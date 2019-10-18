package com.machangbao.community.controller;

import com.machangbao.community.dto.CommentCreateDTO;
import com.machangbao.community.dto.CommentDTO;
import com.machangbao.community.dto.ResultDTO;
import com.machangbao.community.enums.CommentTypeEnum;
import com.machangbao.community.exception.CustomizeErrorCode;
import com.machangbao.community.model.Comment;
import com.machangbao.community.model.User;
import com.machangbao.community.service.CommentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    public Object post(@RequestBody CommentCreateDTO commentCreateDTO,
                       HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }
        Comment comment = new Comment();
        comment.setParentId(commentCreateDTO.getParentId());
        comment.setContent(commentCreateDTO.getContent());
        comment.setType(commentCreateDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(comment.getGmtModified());
        comment.setComentator(1L);
        //Long类型要加个L
        comment.setLikeCount(0L);
        commentServie.insert(comment);
        return ResultDTO.okof();
    }

    @PostMapping("/comment/{id}")
    public ResultDTO<List<CommentDTO>> comments(@PathVariable(name = "id") long id){
        List<CommentDTO> commentDTOS = commentServie.listByTargetId(id,
                CommentTypeEnum.COMMENT);
        return ResultDTO.okof(commentDTOS);
    }
}