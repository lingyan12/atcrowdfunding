package com.atguigu.scw.project.vo.req;


import com.atguigu.scw.project.bean.TReturn;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;

@ToString
@Data
public class ProjectRedisStorageVo extends BaseVo{

    private String projectToken;  //项目临时Token


    private List<Integer> typeids = new ArrayList<Integer>();  //项目的分类
    private List<Integer> tagids= new ArrayList<Integer>(); //项目的标签


    private String name;
    private String remark;
    private Long money;
    private Integer day;



    private String headerImage; //项目头部图片
    private List<String> detailsImage = new ArrayList<String>();//项目详细图片

    //回报
    private List<TReturn> projectReturns = new ArrayList<TReturn>();






}
