package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.annotations.Table;
import org.hibernate.validator.constraints.NotBlank;

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
@Table(appliesTo = "yt_novel_category", comment = "小说分类表")
public class YtNovelCategory {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "该字段不能为空")
    @Column(columnDefinition = "int(16) COMMENT '父分类ID，顶级为0'")
    private Integer parentId = 0;

    @NotBlank(message = "该字段不能为空")
//    @Column(length = 32)
    @Column(columnDefinition = "varchar(32) COMMENT '分类名称'")
    private String title = "";
}
