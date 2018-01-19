package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author qiupengxie
 */
@Data
@Entity
public class YtUser {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(name = "user_type",columnDefinition = "int(2) COMMENT '用户类型：1公众号用户'")
    private Integer userType;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT '微信openid'")
    private String openId;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT '微信昵称'")
    private String nickname;

    @Column(columnDefinition = "int(2) COMMENT '性别'")
    private Integer sex;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(256) COMMENT '头像URL'")
    private String headImgUrl;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT 'unionId'")
    private String unionId;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(32) COMMENT '国家'")
    private String country;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(32) COMMENT '省'")
    private String province;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(32) COMMENT '市'")
    private String city;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '来源渠道（第一次登录绑定）'")
    private Integer fromChannelId;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '用户绑定渠道ID（第一次充值绑定）'")
    private Integer channelId;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '总剩余阅听券'")
    private Integer ticket;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '总剩余充值阅听卷'")
    private Integer ticketRecharge;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '总剩余充值赠送阅听卷'")
    private Integer ticketGive;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(16) COMMENT '注册IP'")
    private Integer regIp;

    @NotNull(message = "")
    @Column(columnDefinition = "int(64) COMMENT '注册时间'")
    private Integer regTime;
}
