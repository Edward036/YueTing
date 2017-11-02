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
public class YtUser {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer user_type;

    @Column(length = 32)
    private String openId;

    @NotNull(message = "")
    @Column(length = 32)
    private String nickname;

    @Column(length = 5)
    private Integer sex;

    @NotNull(message = "")
    @Column(length = 256)
    private String headImgUrl;

    @NotNull(message = "")
    @Column(length = 64)
    private String unionId;

    @NotNull(message = "")
    @Column(length = 32)
    private String country;

    @NotNull(message = "")
    @Column(length = 32)
    private String province;

    @NotNull(message = "")
    @Column(length = 32)
    private String city;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer fromChannelId;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer channelId;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer ticket;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer ticketRecharge;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer ticketGive;


    @NotNull(message = "")
    @Column(length = 16)
    private Integer regIp;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer regTime;

    public YtUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getFromChannelId() {
        return fromChannelId;
    }

    public void setFromChannelId(Integer fromChannelId) {
        this.fromChannelId = fromChannelId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Integer getTicketRecharge() {
        return ticketRecharge;
    }

    public void setTicketRecharge(Integer ticketRecharge) {
        this.ticketRecharge = ticketRecharge;
    }

    public Integer getTicketGive() {
        return ticketGive;
    }

    public void setTicketGive(Integer ticketGive) {
        this.ticketGive = ticketGive;
    }

    public Integer getRegIp() {
        return regIp;
    }

    public void setRegIp(Integer regIp) {
        this.regIp = regIp;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", ticketGive='" + ticketGive + '\'' +
                ", v=" + regIp + '\'' +
                ", regTime=" + regTime + '\'' +
                '}';
    }
}
