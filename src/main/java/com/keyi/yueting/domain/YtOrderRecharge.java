package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Data
@Entity
public class YtOrderRecharge {

    //    @Min(value = 18, message = "")
    //    @NotNull
    //    @Max()
    //    @Length()

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
