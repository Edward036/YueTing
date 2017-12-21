package com.keyi.yueting.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.keyi.yueting.upload.CommonRes;
import com.keyi.yueting.upload.Constants;
import com.keyi.yueting.upload.HttpUtils;
import org.apache.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {
    private static String endpoint = Constants.endpoint;
    private static String accessKeyId = Constants.accessKeyId;
    private static String accessKeySecret = Constants.accessKeySecret;
    private static String bucketName = Constants.bucketName;
    private static String key = "a0_1_4.jpg";
    private static String imagePath = Constants.PATH_PC_IMAGE;

    @PostMapping(value = "/string/upload")
    public String fileUpload(@RequestBody JSONObject object) {
        String imagePath = object.getString("imagePath");
        String[] path = imagePath.split("/");
        String imageName = path[path.length - 1];
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            ossClient.putObject(bucketName,
                    imageName,
                    new File(imagePath));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }
        return "success";
    }

    @PostMapping(value = "/byte/upload")
    public CommonRes byteUpload(@RequestBody JSONObject object) {
        //
        String imageName = object.getString("imageName");
        byte[] image = object.getBytes("image");
        uploadOss(imageName, image);
        return CommonRes.success("success");
    }

    @PostMapping(value = "/face/verify")
    public CommonRes faceVerify(@RequestBody JSONObject object) {
        String host = "http://rlsbbd.market.alicloudapi.com";
        String path = "/face/verify";
        String method = "POST";
        String appcode = "91fe6c36d67a453ab80de7239bd83ff0";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE
        // 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        //根据API的要求，定义相对应的Content-Type
        headers.put("Content-Type", "application/json; charset=UTF-8");
        Map<String, String> querys = new HashMap<String, String>();
        String bodys = JSON.toJSONString(object);
        System.out.println(bodys);
//        String bodys = "{\"type\":0,#0:通过url识别，参数image_url不为空；1:通过图片content识别，参数content不为空\"image_url_1\":\"http://a.com/a.jgp\",#输入图片1的URL\"content_1\":\"\",#输入图片1的content，base64方式编码\"image_url_2\":\"http://a.com/b.jgp\",#输入图片2的URL\"content_2\":\"\"#输入图片2的content，base64方式编码}";
        HttpResponse response = null;
        try {
            response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println("response");
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CommonRes.success(response.toString());
    }

    private void uploadOss(String imageName, byte[] image) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            ossClient.putObject(bucketName,
                    imageName,
                    new ByteArrayInputStream(image));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }
    }
}
