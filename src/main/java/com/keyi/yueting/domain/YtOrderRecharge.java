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
public class YtOrderRecharge {

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
    private String price;

    @NotNull(message = "")
    @Column(length = 32)
    private Integer ticket;

    @NotNull(message = "")
    @Column(length = 32)
    private Integer ticketGive;

    @NotNull(message = "")
    @Column(length = 32)
    private Integer payTime;


    @Column(length = 32)
    private Integer isPay;

    @Column(length = 32)
    private Integer payType;

    @NotNull(message = "")
    @Column(length = 32)
    private Integer ctime;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getTicketGive() {
        return ticketGive;
    }

    public void setTicketGive(Integer ticketGive) {
        this.ticketGive = ticketGive;
    }

    public Integer getPayTime() {
        return payTime;
    }

    public void setPayTime(Integer payTime) {
        this.payTime = payTime;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public YtOrderRecharge() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", isPay='" + isPay + '\'' +
                ", payType=" + payType + '\'' +
                ", ctime=" + ctime + '\'' +
                '}';
    }
}
