package com.atguigu.scw.project.vo.req;


import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class projectReturnsVo extends BaseVo{

    private String projectToken;




    private Integer id;

    private Integer projectid;

    private String type;

    private Integer supportmoney;

    private String content;

    private Integer count;

    private Integer signalpurchase;

    private Integer purchase;

    private Integer freight;

    private String invoice;

    private Integer rtndate;


}
