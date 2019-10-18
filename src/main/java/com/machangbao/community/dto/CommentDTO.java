package com.machangbao.community.dto;

import com.machangbao.community.model.User;
import lombok.Data;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 01:42
 */
@Data
public class CommentDTO {

    private Long id;
    private Long parentId;
    private Integer type;
    private Long comentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;

    private User user;
}