package com.atguigu.scw.project.service.impl;

import com.alibaba.fastjson.JSON;

import com.atguigu.scw.component.utils.AppDateUtils;
import com.atguigu.scw.project.bean.*;
import com.atguigu.scw.project.constant.ProjectConstant;
import com.atguigu.scw.project.mapper.*;
import com.atguigu.scw.project.service.TProjectService;
import com.atguigu.scw.project.vo.req.ProjectRedisStorageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class TProjectServiceImpl implements TProjectService {

    @Autowired
    StringRedisTemplate redis;




    @Autowired
    TProjectMapper projectMapper;

    @Autowired
    TProjectImagesMapper tProjectImagesMapper;

    @Autowired
    TReturnMapper returnMapper;


    @Autowired
    TProjectTypeMapper projectTypeMapper;
    @Autowired
    TProjectTagMapper projectTagMapper;


    @Override
    @Transactional
    public void save(String accessToken,String projectToken, byte code) {

        /**
         * 1.从redis中获取bigVo数据
         * 2.保存项目
         * 3.保存图片
         * 4.保存回报
         * 5.保存项目和分类关系
         * 6.保存项目和标签关系
         * 7.保存发起人（省略）
         * 8.保存法人（省略）
         * 9.清理redis
         *
         *
         */
        //1.从redis中获取bigVo数据


        String bigJson = redis.opsForValue().get(ProjectConstant.TEMP_PROJECT_PREFIX+projectToken);


        ProjectRedisStorageVo bigVo = JSON.parseObject(bigJson, ProjectRedisStorageVo.class);

        String memberid = redis.opsForValue().get(accessToken);

        System.err.println("bigJson---"+bigJson);
        System.err.println("bigVo---"+bigVo);
        System.err.println("id---"+memberid);

        //2.保存项目

        TProject projectDo = new TProject();
        projectDo.setName(bigVo.getName());
        projectDo.setRemark(bigVo.getRemark());
        projectDo.setMoney(bigVo.getMoney());
        projectDo.setDay(bigVo.getDay());
        projectDo.setStatus(code +"");
        projectDo.setMemberid(Integer.parseInt(memberid));
        projectDo.setCreatedate(AppDateUtils.getFormatTime());

        //主键回填

        System.err.println("开始主键回填==========================================");
        System.err.println(projectDo);
        projectMapper.insertSelective(projectDo);
        Integer projectId = projectDo.getId();
        System.err.println("=====================================id :::::::::::::::" + projectId);

        log.debug("project回填id=-----------{}" , projectId);

        //3.保存图片

        //头图
        TProjectImages projectImages = new TProjectImages();
        projectImages.setProjectid(projectId);
        projectImages.setImgurl(bigVo.getHeaderImage());
        projectImages.setImgtype((byte)0);
        tProjectImagesMapper.insertSelective(projectImages);

        List<String> detailsImage = bigVo.getDetailsImage();

        //详细图
        for (String imgPath : detailsImage) {
            TProjectImages pi = new TProjectImages();
            pi.setProjectid(projectId);
            pi.setImgurl(imgPath);
            pi.setImgtype((byte) 1);
            tProjectImagesMapper.insertSelective(pi);
        }

            //4.保存回报
            List<TReturn> projetcReturns = bigVo.getProjectReturns();

        for (TReturn t : projetcReturns) {

            System.err.println("t-------"+t);
        }


            System.err.println(projetcReturns);
            for (TReturn retObj : projetcReturns) {
                retObj.setProjectid(projectId);
                returnMapper.insertSelective(retObj);


            }

            //5.保存项目和分类关系
            List<Integer> typeids = bigVo.getTypeids();
            for (Integer typeId : typeids) {
                TProjectType pt = new TProjectType();
                pt.setProjectid(projectId);
                pt.setTypeid(typeId);
                projectTypeMapper.insertSelective(pt);


            }


            //6.保存项目和标签关系

            List<Integer> getTagid = bigVo.getTagids();
            for (Integer tagid : getTagid) {
                TProjectTag tag = new TProjectTag();
                tag.setProjectid(projectId);
                tag.setTagid(tagid);
                projectTagMapper.insertSelective(tag);


            }

            //9.清理redis缓存

//            redis.delete(ProjectConstant.TEMP_PROJECT_PREFIX+projectToken);










    }
}
