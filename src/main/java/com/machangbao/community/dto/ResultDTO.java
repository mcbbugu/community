package com.machangbao.community.dto;

import com.machangbao.community.exception.CustomizeErrorCode;
import com.machangbao.community.exception.CustomizeException;
import lombok.Data;

/**
 * .
 * Created by mcbbugu
 * 2019-09-21 02:02
 */
@Data
public class ResultDTO<T> {

    private Integer code;

    private String message;

    private T data;

    public static ResultDTO errorOf(Integer code, String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(), errorCode.getMessage());
    }

    public static ResultDTO errorof(CustomizeException e){
        return errorOf(e.getCode(), e.getMessage());
    }

    public static ResultDTO okof(){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功");
        return resultDTO;
    }

    public static <T> ResultDTO okof(T t){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功");
        resultDTO.setData(t);
        return resultDTO;
    }
}