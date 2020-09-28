package com.atguigu.scw.user.enums;

public enum UserExceptionEnums {

    USER_EXISTS(1,"用户已存在"),
    EMAIL_EXISTS(2,"邮箱地址已存在"),
    EMAIL_UNEXISTS(5,"用户不存在"),
    USER_LOCKED(3,"用户被锁定"),
    USER_PWD_ERR(6,"密码错误"),
    USER_SAVE_ERROR(4,"用户保存失败"),;


    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    UserExceptionEnums(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserExceptionEnums{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
