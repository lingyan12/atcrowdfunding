package com.atguigu.scw.project.controller;

import com.alibaba.fastjson.JSON;
import com.atguigu.scw.IO.AppResponse;
import com.atguigu.scw.enums.ProjectStatusEnume;
import com.atguigu.scw.project.bean.TReturn;
import com.atguigu.scw.project.component.OssTemplate;
import com.atguigu.scw.project.constant.ProjectConstant;
import com.atguigu.scw.project.service.TProjectService;
import com.atguigu.scw.project.vo.req.BaseVo;
import com.atguigu.scw.project.vo.req.ProjectBaseInfoVo;
import com.atguigu.scw.project.vo.req.ProjectRedisStorageVo;
import com.atguigu.scw.project.vo.req.projectReturnsVo;
import com.netflix.discovery.converters.Auto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.spring.web.json.Json;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Api(tags = "项目发起模块")
@RequestMapping("/project/create")
@RestController
@Slf4j
public class ProjectCreateController {

	@Autowired
	OssTemplate oss;


	@Autowired
	StringRedisTemplate redis;

	@Autowired
	TProjectService projectService;


	@ApiOperation(value = "1-项目初始创建")
	@PostMapping("/init")
	public AppResponse<Object> init(BaseVo vo) {

		try {
			String token = vo.getAccessToken();

			if (StringUtils.isEmpty(token)){

				AppResponse<Object> fail = AppResponse.fail(null);
				fail.setMsg("请求必须提供AccessToken");
			}

			String memeberId = redis.opsForValue().get(token);

			if (StringUtils.isEmpty(memeberId)){

				AppResponse<Object> response = AppResponse.fail(null);
				response.setMsg("请登录系统再发布项目");

				return response;
			}


			ProjectRedisStorageVo storageVo = new ProjectRedisStorageVo();

			BeanUtils.copyProperties(vo , storageVo);

			String projectToken = UUID.randomUUID().toString().replace("-","");

			storageVo.setProjectToken(projectToken);

			String bigJson = JSON.toJSONString(storageVo);

			redis.opsForValue().set(ProjectConstant.TEMP_PROJECT_PREFIX+projectToken , bigJson);

			log.debug("bigJson======{}",bigJson);


			return AppResponse.ok(storageVo);
		} catch (BeansException e) {
			e.printStackTrace();
			return AppResponse.fail(null);



		}
	}





		@ApiOperation(value = "2-项目基本信息")
	@PostMapping("/baseinfo")
	public AppResponse<Object> baseinfo(ProjectBaseInfoVo vo) {

			try {
				String accessToken = vo.getAccessToken();
				if(StringUtils.isEmpty(accessToken)){

					AppResponse<Object> fail = AppResponse.fail(null);
					fail.setMsg("必须携带token进行操作");


					return fail;
				}
				String id = redis.opsForValue().get(accessToken);

				if (StringUtils.isEmpty(id)){

					AppResponse<Object> fail = AppResponse.fail(null);

					fail.setMsg("请先登录再操作");


					return fail;

				}


				String projectToken = ProjectConstant.TEMP_PROJECT_PREFIX + vo.getProjectToken();

				String bigJson = redis.opsForValue().get(projectToken);

				ProjectRedisStorageVo bigVo = JSON.parseObject(bigJson, ProjectRedisStorageVo.class);

				//2.从redis取出bigVo数据 将小Vo 拷贝到大Vo中 后继续序列化


				BeanUtils.copyProperties(vo , bigVo);

				String reBigJson = JSON.toJSONString(bigVo);

				redis.opsForValue().set(projectToken , reBigJson);



				return AppResponse.ok(bigVo);
			} catch (Exception e) {
				e.printStackTrace();
				log.error("处理失败{}",e.getMessage());


				return AppResponse.fail(null);
			}
		}

	@ApiOperation(value = "3-添加项目回报档位")
	@PostMapping("/return")
	public AppResponse<Object> returnDetail(@RequestBody List<projectReturnsVo> pro) {
//		try {
			String accessToken = pro.get(0).getAccessToken();
			System.err.println("accessToken========"+accessToken);
			if(StringUtils.isEmpty(accessToken)){

				System.err.println("必须携带token进行操作");

				AppResponse<Object> fail = AppResponse.fail(null);
				fail.setMsg("必须携带token进行操作");


				return fail;
			}
			String id = redis.opsForValue().get(accessToken);

			if (StringUtils.isEmpty(id)){

				System.err.println("请先登录再操作");

				AppResponse<Object> fail = AppResponse.fail(null);

				fail.setMsg("请先登录再操作");


				return fail;

			}

			System.err.println("size ======================" + pro.size());
			String projectToken =  pro.get(0).getProjectToken();

			String bigJson = redis.opsForValue().get(ProjectConstant.TEMP_PROJECT_PREFIX+projectToken);

			ProjectRedisStorageVo bigVo = JSON.parseObject(bigJson, ProjectRedisStorageVo.class);


			System.err.println("bigJson================="+bigJson);
			System.err.println("projectToken================="+projectToken);
			System.err.println("bigVo================="+bigVo);

			List<TReturn> rtnList = bigVo.getProjectReturns();
//			project:create:temp:188a786c90154d81b7d4b1417622eba4
//			project:create:temp:project:create:temp:188a786c90154d81b7d4b1417622eba4

			for (projectReturnsVo vo : pro) {
				TReturn r = new TReturn();
				BeanUtils.copyProperties(vo,r);

				System.err.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr======"+r);
				rtnList.add(r);

			}
//
//
//			BeanUtils.copyProperties(pro , bigVo);
//
			String reBigJson = JSON.toJSONString(bigVo);

			redis.opsForValue().set(projectToken , reBigJson);


			return AppResponse.ok(bigVo);
//		} catch (Exception e) {
//			e.printStackTrace();
//			log.error("处理失败{}",e.getMessage());
//
//
//			return AppResponse.fail(null);
//		}
	}

	
//	@ApiOperation(value = "删除项目回报档位")
//	@DeleteMapping("/return")
//	public AppResponse<Object> deleteReturnDetail() {
//		return AppResponse.ok("ok");
//	}

	/**
	 * 文件上传要求
	 * method = post
	 * enctype = "multipart/form-data"
	 * type = file
	 *
	 * springMVC继承了commons-fileupload和 commons-io
	 * SpringMVC提供了文件上传解析器
	 * Ccontroller处理文件上传时可以用MultipartFile接收文件
	 *
	 * @return
	 */
	
	@ApiOperation(value = "上传图片")
	@PostMapping("/upload")
	public AppResponse<Object> upload(@RequestParam("uploadfile") MultipartFile[] files) throws Exception {


		System.err.println("oss:"+oss + "detail" + oss.show());


		if (null == files || files.length== 0 ){
			throw new Exception("file长度为0 NULL POINT Exception");
		}



		ArrayList<String> filepathList = new ArrayList<>();

		try{

			for (MultipartFile file : files) {

				String RAWfilename = file.getOriginalFilename();
				String rename = UUID.randomUUID().toString().replace("-","").substring(4)+"_"+RAWfilename;


				String path = oss.upLoadFile(rename, file.getInputStream());

				filepathList.add(path);


				log.debug("文件上传成功----{}",filepathList);

				return AppResponse.ok(filepathList);

			}


		}catch (Exception e ){

			e.getStackTrace();

			log.error("文件上传失败！！");

			return AppResponse.fail(null);



		}












		return AppResponse.ok("ok");
	}
	
//	@ApiOperation(value = "4-确认项目法人信息")
//	@PostMapping("/confirm/legal")
//	public AppResponse<Object> legal() {
//		return AppResponse.ok("ok");
//	}
	
//	@ApiOperation(value = "项目草稿保存")
//	@PostMapping("/tempsave")
//	public AppResponse<Object> tempsave() {
//		return AppResponse.ok("ok");
//	}
	
	@ApiOperation(value = "4-项目提交审核申请")
	@PostMapping("/submit")
	public AppResponse<Object> submit(String accessToken ,String projectToken ,String ops) {


//		try {




			if(StringUtils.isEmpty(accessToken)){

				AppResponse<Object> fail = AppResponse.fail(null);
				fail.setMsg("必须携带token进行操作");


				return fail;
			}


			//请确保id 转换Integer 一定不能报错 否则会出现报错!
			String id = redis.opsForValue().get(accessToken);





			if (StringUtils.isEmpty(id)){

				AppResponse<Object> fail = AppResponse.fail(null);

				fail.setMsg("请先登录再操作");


				return fail;

			}

			if ("0".equals(ops)){
				//保存草稿

				projectService.save(accessToken ,projectToken , ProjectStatusEnume.DRAFT.getCode());

				return AppResponse.ok("保存草稿ok");


			}else if("1".equals(ops)){
				//保存提交审核
				projectService.save(accessToken ,projectToken ,  ProjectStatusEnume.SUBMIT_AUTH.getCode());

				return AppResponse.ok("保存提交审核ok");



			}else {
				//提交的ops错误
				AppResponse<Object> fail = AppResponse.fail(null);
				fail.setMsg("提交的ops错误!");
				return fail;
			}


//	}catch (Exception e){
//			e.getStackTrace();
//			System.err.println(e.getStackTrace());
//
//			AppResponse<Object> fail = AppResponse.fail(null);
//			fail.setMsg(e.getMessage());
//
//		return fail;
//	}
	
}

}
