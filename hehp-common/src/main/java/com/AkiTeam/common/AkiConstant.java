package com.AkiTeam.common;

import lombok.Getter;

@Getter
public enum AkiConstant {
    DEFAULT_SUCCESS_MESSAGE("操作成功"),
    DEFAULT_FAILURE_MESSAGE("操作失败，有错误发生"),
    DEFAULT_NULL_MESSAGE("返回值为空");

    private String msg;

    AkiConstant(String msg) {
        this.msg = msg;
    }
}
