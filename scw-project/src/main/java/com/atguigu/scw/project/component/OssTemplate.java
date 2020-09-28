package com.atguigu.scw.project.component;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import lombok.Data;
import lombok.ToString;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


//1. 自动从properties获取值的方式有很多 可以@Component 然后再 属性值上面通过value("xxx.xxx")获取properties获取值
//2. 通过创建配置类

@Data
@ToString
public class OssTemplate {



            // Endpoint以杭州为例，其它Region请按实际情况填写。
            private String endpoint;
            // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
            private String accessKeyId;
            private String accessKeySecret;

            private String bucket;




    public String show(){

        return "endpoint"+endpoint+"========"+"accessKeyId"+accessKeyId;

    }

    public String upLoadFile(String filename,InputStream inputStream) throws FileNotFoundException {

        try {

            System.err.println("endpoint+ "+endpoint );
            System.err.println("accessKeyId+ "+accessKeyId );
            System.err.println("accessKeySecret+ "+accessKeySecret );
            System.err.println("bucket+ "+bucket );

            // 创建OSSClient实例。
            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

            // 上传文件流。
            // InputStream inputStream = new FileInputStream("C:/Users/XXIAO/Desktop/3.png");

            ossClient.putObject(bucket, "pic/"+filename, inputStream);

            // 关闭OSSClient。
            ossClient.shutdown();
            System.out.println(("文件上传成功" + filename));
            return "ok";

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }


}








