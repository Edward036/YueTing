package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author qiupengxie
 */
@Data
@Entity
public class YtOrderRecharge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}
