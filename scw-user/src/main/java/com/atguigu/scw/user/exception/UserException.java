package com.atguigu.scw.user.exception;

import com.atguigu.scw.user.enums.UserExceptionEnums;

public class UserException extends RuntimeException{

    //运行期异常会自动回滚


    public UserException() {
    }

    public UserException(UserExceptionEnums e ){
        super(e.getMessage());
    }


}
