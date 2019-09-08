package com.machangbao.community.model;

import lombok.Data;

/**
 * .
 * Created by mcbbugu
 * 2019-09-08 18:25
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String token;
    private String accountId;
    private Long gmtCreate;
    private Long gmtModified;
}