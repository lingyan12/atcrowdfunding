package com.atguigu.atcrowdfunding.exception;

//继承RUNtimeexceptuion的原因是 业务层事务回滚 ，
// spring声明是业务默认值对Runtime异常进行回滚
public class LoginException extends RuntimeException{

    public LoginException(String message) {
        super(message);
    }

    public LoginException() {
    }
}
