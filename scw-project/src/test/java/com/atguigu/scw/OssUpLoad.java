package com.atguigu.scw;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class OssUpLoad {


    public static void main(String[] args) throws FileNotFoundException {


        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        String accessKeyId = "LTAI4G6AToU9k3sP37CcnfjN";
        String accessKeySecret = "Ak9g2UaGgGigHreJ2kKgKhhxQB7Uf6";

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
        InputStream inputStream = new FileInputStream("C:/Users/XXIAO/Desktop/3.png");
        ossClient.putObject("lingyan", "pic/3.png", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();







    }
}
