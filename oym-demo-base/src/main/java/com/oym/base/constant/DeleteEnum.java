package com.oym.base.constant;

/**
 * @author zyd
 * @date 2019/10/28 9:13
 * @desc
 */
public enum DeleteEnum {
    NO_DELETE(0, "未删除"),
    DELETED(1, "已删除");

    private int code;
    private String value;

    DeleteEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}