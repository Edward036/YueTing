package com.keyi.yueting.domain;

import lombok.Data;

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
public class YtPosition {

    //    @Min(value = 18, message = "")
    //    @NotNull
    //    @Max()
    //    @Length()

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 32)
    private String name;

    @NotNull(message = "")
    @Column(length = 32)
    private String listOrder;

    @NotNull(message = "")
    @Column(length = 32)
    private String thumb;

    @NotNull(message = "")
    @Column(length = 32)
    private String toUrl;

    @NotNull(message = "")
    @Column(length = 32)
    private String ctime;
}
