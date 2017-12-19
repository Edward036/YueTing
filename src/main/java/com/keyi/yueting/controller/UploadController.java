package com.keyi.yueting.controller;

import com.aliyun.oss.OSSClient;
import com.keyi.yueting.aspect.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.File;

@RestController
public class UploadController {
    private static String endpoint = Constants.endpoint;
    private static String accessKeyId = Constants.accessKeyId;
    private static String accessKeySecret = Constants.accessKeySecret;
    private static String bucketName = Constants.bucketName;
    private static String key = "a0_1_4.jpg";
    private static String imagePath = Constants.PATH_PC_IMAGE;

    @GetMapping(value = "/string/upload")
    private String initUpload(String imagePath) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            ossClient.putObject(bucketName,
                    key,
                    new File(imagePath));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }
        return "success";
    }

    @PostMapping(value = "/byte/upload")
    private String byteUpload(byte[] image) {
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        try {
            ossClient.putObject(bucketName,
                    key,
                    new ByteArrayInputStream(image));
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }
        return "success";
    }

    public void picture() {
    }

    public void audio() {
    }

    public void gmt_iso8601(String time) {

    }
}
