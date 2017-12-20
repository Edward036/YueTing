/**
 * CreditEase.cn Inc.
 * Copyright (c) 2006-2015 All Rights Reserved.
 */
package com.keyi.yueting.upload;

/**
 * Ajax响应对象
 *
 * @author qhwang
 */
public class CommonRes {

    private Integer status;

    private String msg;

    private Object data;

    public static CommonRes success(Object beans) {
        CommonRes commonRes = new CommonRes();
        commonRes.setData(beans);
        commonRes.setStatus(Integer.valueOf(LoanDrainageExceptionEnum.SUCCESS.getStatus()));
        commonRes.setMsg(LoanDrainageExceptionEnum.SUCCESS.getMessage());

        return commonRes;
    }

    public static CommonRes success() {
        CommonRes commonRes = new CommonRes();
        commonRes.setStatus(Integer.valueOf(LoanDrainageExceptionEnum.SUCCESS.getStatus()));
        commonRes.setMsg(LoanDrainageExceptionEnum.SUCCESS.getMessage());

        return commonRes;
    }

    public static CommonRes checkFail(String message) {
        CommonRes commonRes = new CommonRes();
        commonRes.setStatus(Integer.valueOf(LoanDrainageExceptionEnum.FAIL.getStatus()));
        commonRes.setMsg(message);
        return commonRes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
