package com.AkiTeam.common;

import lombok.Getter;

/**
 * @author Yunnuo
 * @email ymz@ebox.vip
 * @date 2023/2/26 15:25
 * @desciption: 全局统一返回结果状态码
 */
@Getter
public enum ResultCode {

    OK("200", "成功"),
    ERROR("201", "失败"),
    PARAM_ERROR("202", "参数不正确"),
    SERVICE_ERROR("203", "服务异常"),
    DATA_ERROR("204","数据异常"),
    NOT_LOG_IN("205","未登录"),
    NO_ACCESS("206", "没有权限"),
    TOKEN_ERROR("207", "token错误");

    private String code;
    private String message;

    ResultCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode(){return this.code;}

    public String getMessage(){return this.message;}

    public static ResultCode codeOf(String code){
        ResultCode status = resolve(code);
        if (status == null){
            throw new IllegalArgumentException("No matching constant for [" + code + "]");
        }
        return status;
    }

    public static ResultCode resolve(String statusCode){
        for (ResultCode resultCode : values()){
            if (resultCode.code == statusCode){
                return resultCode;
            }
        }
        return null;
    }

    public String toString(){
        return this.code + " " + name();
    }
}

