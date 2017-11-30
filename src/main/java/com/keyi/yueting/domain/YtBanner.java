package com.keyi.yueting.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Data
@Entity
public class YtBanner {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @Column(columnDefinition = "varchar(1024) COMMENT '文案'")
    private String text;

    @Column(columnDefinition = "varchar(64) COMMENT '跳转'")
    private String toUrl;

    @Column(columnDefinition = "varchar(64) COMMENT '图片'")
    private String image;
}
