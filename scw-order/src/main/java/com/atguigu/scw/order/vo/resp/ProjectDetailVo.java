package com.atguigu.scw.order.vo.resp;


import com.atguigu.scw.order.bean.TReturn;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
@Data
public class ProjectDetailVo implements Serializable {








    private Integer mmemberid; //会员id

    private Integer id;
    private String name;// 项目名称
    private String remark;// 项目简介

    private Long money;

    private Integer day;

    private String status;

    private String deploydate;

    private Long supportmoney=0L;

    private Integer supporter=0;

    private Integer completion=0;

    private Integer memberid;

    private String createdate;

    private Integer follower=100;



    private String headerImage; // 项目头部图片\

    private List<String> detailsImage = new ArrayList<String>();


    private List<TReturn> projectReturns = new ArrayList<TReturn>();







}
