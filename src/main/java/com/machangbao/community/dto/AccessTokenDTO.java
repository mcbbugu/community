package com.machangbao.community.dto;

import lombok.Data;

/**
 * 属性参考：https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/
 * Created by mcbbugu
 * 2019-09-08 11:40
 */
@Data
public class AccessTokenDTO {

    private String client_id;

    private String client_secret;

    private String code;

    private String redirect_uri;

    private String state;
}