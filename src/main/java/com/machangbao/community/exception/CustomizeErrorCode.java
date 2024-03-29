package com.machangbao.community.exception;

/**
 * .
 * Created by mcbbugu
 * 2019-09-17 23:39
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{


    QUESTION_NOT_FOUND(2001, "你找的问题不在了，换个试试"),
    TARGET_PARAM__NOT_FOUND(2002, "未选中任何问题或评论进行回复"),
    NO_LOGIN(2003, "未登录，不能评论，请先登录"),
    SYS_ERROR(2004, "服务冒烟了"),
    TYPE_PARAM_WORNG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUNT(2006, "你操作的评论不存在，换个试试")
    ;
    private String message;
    private Integer code;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}
