package com.keyi.yueting.domain;

import lombok.Data;
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
@Data
@Entity
public class YtConfigTicket {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 16)
    private Integer amount;

    @Column(length = 32)
    private String ticket;

    @NotNull(message = "")
    @Column(length = 32)
    private String ticketGive;

    @NotNull(message = "")
    @Column(length = 32)
    private String status;

    @NotNull(message = "")
    @Column(length = 32)
    private String ctime;
}
