package com.example.forwardandredirect.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class testController {


    @GetMapping("/f/{id}")
    public String t1(@PathVariable("id") String id , @RequestParam("m") String m){




//        return "id====="+ id +"\nm--------"+ m;
        return "forward:/t/{id}";

    }


//    @GetMapping("/f/{id}")
    @ResponseBody
    @GetMapping("/t/{id}")
    public String t2(@PathVariable("id") String id , @RequestParam("m") String m) {

        System.err.println("进入t2(");




        return "id====="+ id +"\nm--------"+ m;

    }














    }
