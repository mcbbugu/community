package com.machangbao.community.dto;

import lombok.Data;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 01:42
 */
@Data
public class CommentDTO {

    private Long parentId;

    private String content;

    private Integer type;
}