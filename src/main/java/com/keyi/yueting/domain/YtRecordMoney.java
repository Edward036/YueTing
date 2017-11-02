package com.keyi.yueting.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Entity
public class YtRecordMoney {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 16)
    private Integer user_id;

    @Column(length = 16)
    private Integer type;

    @Column(length = 16)
    private Integer ticketChange;

    @Column(length = 16)
    private Integer ticketGiveChange;

    @Column(length = 16)
    private Integer ticketLeft;

    @Column(length = 16)
    private Integer ticketGiveLeft;

    @Column(length = 32)
    private String orderNo;

    @Column(length = 16)
    private Integer payType;

    @Column(length = 32)
    private String ctime;

    public YtRecordMoney() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTicketChange() {
        return ticketChange;
    }

    public void setTicketChange(Integer ticketChange) {
        this.ticketChange = ticketChange;
    }

    public Integer getTicketGiveChange() {
        return ticketGiveChange;
    }

    public void setTicketGiveChange(Integer ticketGiveChange) {
        this.ticketGiveChange = ticketGiveChange;
    }

    public Integer getTicketLeft() {
        return ticketLeft;
    }

    public void setTicketLeft(Integer ticketLeft) {
        this.ticketLeft = ticketLeft;
    }

    public Integer getTicketGiveLeft() {
        return ticketGiveLeft;
    }

    public void setTicketGiveLeft(Integer ticketGiveLeft) {
        this.ticketGiveLeft = ticketGiveLeft;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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
                ", orderNo='" + orderNo + '\'' +
                ", payType=" + payType + '\'' +
                ", ctime=" + ctime + '\'' +
                '}';
    }
}
