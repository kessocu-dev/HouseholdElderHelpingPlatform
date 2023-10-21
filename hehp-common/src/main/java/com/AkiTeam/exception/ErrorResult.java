package com.AkiTeam.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResult implements Serializable {

    private static final long serialVersionUID = -8738363760223125457L;

    /**
     * 错误码
     */
    private String code;
    /**
     * 错误消息
     */
    private String msg;

    public static ErrorResult build(ErrorResult commonErrorResult, String msg) {
        return new ErrorResult(commonErrorResult.getCode(), commonErrorResult.getMsg() + " " + msg);
    }
}