package com.machangbao.community.dto;

import com.machangbao.community.exception.CustomizeErrorCode;
import lombok.Data;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 02:02
 */
@Data
public class ResultDTO {

    private Integer code;

    private String message;

    public static ResultDTO errorOf(Integer code, String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(), errorCode.getMessage());
    }
}