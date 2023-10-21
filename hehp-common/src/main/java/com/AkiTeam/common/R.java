package com.AkiTeam.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author  aki
 * @email 842384412@qq.com
 * @date  2023/10/20 19:17
 * @desciption:  RestfulAPI全局统一返回结果类
 */
@Data
@Builder
@AllArgsConstructor
public class R<T> implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 返回码
     */
    private ResultCode code;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 数据数
     */
    private long total;
    /**
     * 返回数据
     */
    private T data;

    public R(){this.total = 0L;}

    public R(ResultCode code){this.code = code;}

    public R(ResultCode code, T data){
        super();
        this.code = code;
        this.data = data;
        this.message = code.getMessage();
    }

    public String getCode(){
        return this.code.getCode();
    }

    public String getCodeMessage(){
        return this.code.getMessage();
    }
    public static  <T> R<T> ok(){
        return new R<T>(ResultCode.OK);
    }

    public static <T> R ok(T data){
        return R.builder()
                .code(ResultCode.OK)
                .data(data)
                .message(ResultCode.OK.getMessage())
                .build();
    }

    public static <T> R ok(T data, long total) {
        return R.builder()
                .code(ResultCode.OK)
                .data(data)
                .total(total)
                .message(ResultCode.OK.getMessage())
                .build();
    }

    public static <T> R ok(String message){
        return R.builder()
                .code(ResultCode.OK)
                .message(message)
                .build();
    }

    public static <T> R ok(String message, T data){
        return R.builder()
                .code(ResultCode.OK)
                .message(message)
                .data(data)
                .build();
    }

    public static <T> R error(){
        return R.builder()
                .code(ResultCode.ERROR)
                .message(ResultCode.ERROR.getMessage())
                .data(null)
                .build();
    }

    public static <T> R error(String message){
        return R.builder()
                .code(ResultCode.ERROR)
                .message(message == null || message.isEmpty() ? ResultCode.ERROR.getMessage() : message)
                .data(null)
                .build();
    }

    public boolean isSuccess(){
        return Objects.equals(this.getCode(), ResultCode.OK.name());
    }
}
