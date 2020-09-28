package com.atguigu.scw;

import com.atguigu.scw.user.enums.UserExceptionEnums;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class t2 {

    public static void main(String[] args) {

        System.out.println(UserExceptionEnums.USER_EXISTS.getMessage());


    }


    @Test
    public void t3(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.err.println(encoder.encode("123"));


    }



}
