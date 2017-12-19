package com.keyi.yueting.aspect;

import com.aliyun.oss.OSSClient;

import java.io.File;

/**
 * Image process examples.
 */
public class ImageSample {

	private static String endpoint = Constants.endpoint;
	private static String accessKeyId = Constants.accessKeyId;
	private static String accessKeySecret = Constants.accessKeySecret;
	private static String bucketName = Constants.bucketName;
	private static String key = "a0_1_4.jpg";
	private static String imagePath = Constants.PATH_PC_IMAGE;

	public static void main(String[] args) {
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

//		try {
//			// resize
//			String style = "image/resize,m_fixed,w_100,h_100";
//			GetObjectRequest request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-resize.jpg"));
//
//			// crop
//			style = "image/crop,w_100,h_100,x_100,y_100,r_1";
//			request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-crop.jpg"));
//
//			// rotate
//			style = "image/rotate,90";
//			request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-rotate.jpg"));
//
//			// sharpen
//			style = "image/sharpen,100";
//			request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-sharpen.jpg"));
//
//			// add watermark into the image
//			style = "image/watermark,text_SGVsbG8g5Zu-54mH5pyN5YqhIQ";
//			request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-watermark.jpg"));
//
//			// convert format
//			style = "image/format,png";
//			request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-format.png"));
//
//			// image information
//			style = "image/info";
//			request = new GetObjectRequest(bucketName, key);
//			request.setProcess(style);
//
//			ossClient.getObject(request, new File("example-info.txt"));
//
//		} catch (OSSException oe) {
//			System.out.println("Caught an OSSException, which means your request made it to OSS, "
//					+ "but was rejected with an error response for some reason.");
//			System.out.println("Error Message: " + oe.getErrorCode());
//			System.out.println("Error Code:       " + oe.getErrorCode());
//			System.out.println("Request ID:      " + oe.getRequestId());
//			System.out.println("Host ID:           " + oe.getHostId());
//		} catch (ClientException ce) {
//			System.out.println("Caught an ClientException, which means the client encountered "
//					+ "a serious internal problem while trying to communicate with OSS, "
//					+ "such as not being able to access the network.");
//			System.out.println("Error Message: " + ce.getMessage());
//		} catch (Throwable e) {
//			e.printStackTrace();
//		} finally {
//			ossClient.shutdown();
//		}
	}
}