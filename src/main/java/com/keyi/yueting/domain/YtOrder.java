package com.keyi.yueting.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Entity
public class YtOrder {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer orderNo;

    @Column(length = 32)
    private String userId;

    @NotNull(message = "")
    @Column(length = 32)
    private String channelId;

    @NotNull(message = "")
    @Column(length = 32)
    private String channelName;


    @NotNull(message = "")
    @Column(length = 32)
    private String novelId;


    @NotNull(message = "")
    @Column(length = 32)
    private String novelTitle;


    @NotNull(message = "")
    @Column(length = 32)
    private String chapts;


    @NotNull(message = "")
    @Column(length = 32)
    private Integer ticket;

    @NotNull(message = "")
    @Column(length = 32)
    private String isPay;

    @NotNull(message = "")
    @Column(length = 32)
    private String payType;

    @NotNull(message = "")
    @Column(length = 32)
    private String payTime;

    @NotNull(message = "")
    @Column(length = 32)
    private String ctime;

    public YtOrder() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }

    public String getNovelTitle() {
        return novelTitle;
    }

    public void setNovelTitle(String novelTitle) {
        this.novelTitle = novelTitle;
    }

    public String getChapts() {
        return chapts;
    }

    public void setChapts(String chapts) {
        this.chapts = chapts;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", payType='" + payType + '\'' +
                ", payTime=" + payTime + '\'' +
                ", ctime=" + ctime + '\'' +
                '}';
    }
}
