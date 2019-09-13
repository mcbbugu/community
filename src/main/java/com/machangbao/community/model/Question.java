package com.machangbao.community.model;

import lombok.Data;

/**
 * 问题类
 * Created by mcbbugu
 * 2019-09-11 22:24
 */
@Data
public class Question {

    private Integer id;

    private String title;

    private String description;

    private String tag;

    private Long gmtCreate;

    private Long gmtModified;

    private Integer creator;

    private Integer viewCount;

    private Integer commentCount;

    private Integer likeCount;
}