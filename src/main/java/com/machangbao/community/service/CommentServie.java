package com.machangbao.community.service;

import com.machangbao.community.exception.CustomizeErrorCode;
import com.machangbao.community.exception.CustomizeException;
import com.machangbao.community.model.Comment;
import org.springframework.stereotype.Service;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 02:09
 */
@Service
public class CommentServie {

    public void insert(Comment comment) {
        if(comment.getParentId() == null || comment.getParentId() == 0){
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM__NOT_FOUND);
        }
    }
}