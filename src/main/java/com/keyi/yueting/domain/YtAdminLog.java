package com.keyi.yueting.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Entity
public class YtAdminLog {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 16)
    private Integer adminId;

    @Column(length = 16)
    private Integer addTime;

    @Column(length = 32)
    private String adminName;

    @Column(length = 32)
    private String adminIp;

    @Column(length = 256)
    private String adminAgent;

    @Column(length = 256)
    private String title;

    @Column(length = 256)
    private String controller;

    @Column(length = 32)
    private String action;

    @Column(length = 32)
    private String objId;

    @Column(length = 1024)
    private String oldData;

    @Column(length = 1024)
    private String request;

    @Column(length = 1024)
    private String responce;

    @Column(length = 256)
    private String descripe;

    @Column(length = 32)
    private String password;

    public YtAdminLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminIp() {
        return adminIp;
    }

    public void setAdminIp(String adminIp) {
        this.adminIp = adminIp;
    }

    public String getAdminAgent() {
        return adminAgent;
    }

    public void setAdminAgent(String adminAgent) {
        this.adminAgent = adminAgent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponce() {
        return responce;
    }

    public void setResponce(String responce) {
        this.responce = responce;
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", responce='" + responce + '\'' +
                ", descripe=" + descripe + '\'' +
                ", password=" + password + '\'' +
                '}';
    }
}
