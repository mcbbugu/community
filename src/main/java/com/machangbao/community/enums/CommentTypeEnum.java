package com.machangbao.community.enums;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 02:07
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2),
    ;

    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
