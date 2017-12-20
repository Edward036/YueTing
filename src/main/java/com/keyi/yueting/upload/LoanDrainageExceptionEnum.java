package com.keyi.yueting.upload;


import lombok.Getter;

/**
 * 异常类型枚举类
 */
public enum LoanDrainageExceptionEnum {

	SYSTEM_PARAM_ERROR("501","参数校验错误"),
	SYSTEM_ERROR("500","系统异常"),
	PARAMTER_NOT_RIGHT("502","参数解密异常"),
	SUCCESS("0", "SUCCESS"),
	FAIL("-1", "FAIL"),
	USER_TOKEN_NOTVALIADE("-2","用户已失效"),
	UNLOGIN("1001", "NOT LOGIN"),
	USER_NOT_EXSIST("1000","该手机号未注册"),
	USER_HAS_EXSIST("1009","该手机号已经注册"),
	PHONE_NOTVALIADE("1001", "手机号格式有误"),
	VERIFYCODE_NOT_INVALID("1002", "图形验证码已失效"),
	IMAGECODE_NOT_RIGHT("1003", "请输入正确的图形验证码"),
	PHONE_PASSWORD_NOTVALIADE("1004", "用户名或密码不正确"),
	SMS_CODE_INVALID("1005","短信验证码已失效"),
	VERIFYCODE_NOT_RIGHT("1006", "请输入正确的短信验证码"),
	TEL_SMS_FREQUENCY("1007", "发送过于频繁，请稍后再试"),
	TEL_SMS_COUNT_EXCEED("1008", "该手机号已达到验证码最大发送次数，请明日再试"),
	USER_PASSWORD_NOTSET("2000", "该手机号尚未设置密码"),
	USERTEL_NOT_EQUAL("2001", "当前用户手机号不匹配"),
	ADMIN_USERNAME_PASSWORD_NOTSET("2002", "用户名或密码错误"),
	ADMIN_USER_NOT_EXSIST("2003", "用户名不存在"),
	APP_VERSION_NOT_VALID("2005","当前版本不合法"),
	APP_VERSION_NEED_UPDate("2006","当前版本需要强制升级"),
	IDCARD_NOTVALIADE("2004", "身份证有误");

	@Getter
	private String status;
	
	@Getter
	private String message;
	
	LoanDrainageExceptionEnum(String status, String message) {
		this.status = status;
		this.message = message;
	}
}
