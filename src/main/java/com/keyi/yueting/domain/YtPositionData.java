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
public class YtPositionData {

    //    @Min(value = 18, message = "")
    //    @NotNull
    //    @Max()
    //    @Length()

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer tId;

    @Column(length = 16)
    private Integer typeId;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer posId;

    @NotNull(message = "")
    @Column(length = 32)
    private String thumb;

    @NotNull(message = "")
    @Column(length = 32)
    private String toUrl;

    @NotNull(message = "")
    @Column(length = 256)
    private String data;

    @NotNull(message = "")
    @Column(length = 32)
    private String listOrder;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer ctime;
}
