package com.machangbao.community.exception;

/**
 * .
 * Created by mcbbugu
 * 2019-09-17 23:39
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{


    QUESTION_NOT_FOUND("你找的问题不在了，换个试试");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
