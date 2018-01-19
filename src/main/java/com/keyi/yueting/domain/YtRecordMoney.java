package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author qiupengxie
 */
@Data
@Entity
public class YtRecordMoney {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(name = "user_id")
    private Integer userId;

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
}
