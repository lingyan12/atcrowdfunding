package com.atguigu.scw.project.vo.req;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@ToString
@Data
public class ProjectBaseInfoVo extends BaseVo{


    private String projectToken;  //项目临时Token


    private List<Integer> typeids;  //项目的分类
    private List<Integer> tagids; //项目的标签


    private String name;
    private String remark;
    private Long money;
    private Integer day;



    private String headerImage; //项目头部图片
    private List<String> detailsImage;//项目详细图片





}
