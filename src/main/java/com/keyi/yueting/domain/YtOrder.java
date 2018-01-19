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
public class YtOrder {

    @Id
    @GeneratedValue
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
}
