package com.machangbao.community.dto;

import com.machangbao.community.model.User;
import lombok.Data;

/**
 * .
 * Created by mcbbugu
 * 2019-09-13 15:34
 */
@Data
public class QuestionDTO {

    private Long id;

    private String title;

    private String description;

    private String tag;

    private Long gmtCreate;

    private Long gmtModified;

    private Long creator;

    private Integer viewCount;

    private Integer commentCount;

    private Integer likeCount;

    private User user;
}