package com.machangbao.community.controller;

import com.machangbao.community.dto.CommentDTO;
import com.machangbao.community.dto.ResultDTO;
import com.machangbao.community.exception.CustomizeErrorCode;
import com.machangbao.community.model.Comment;
import com.machangbao.community.model.User;
import com.machangbao.community.service.CommentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 01:34
 */
@RestController
public class CommentController {

    @Autowired
    private CommentServie commentServie;

    @PostMapping("/comment")
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(comment.getGmtModified());
        comment.setComentator(1);
        //Long类型要加个L
        comment.setLikeCount(0L);
        commentServie.insert(comment);
        Map<Object, Object> objectObjectMap = new HashMap<>();
        objectObjectMap.put("message", "成功");
        return objectObjectMap;
    }
}