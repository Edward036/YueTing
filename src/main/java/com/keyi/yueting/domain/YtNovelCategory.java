package com.keyi.yueting.domain;

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

    public YtNovelCategory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", parentId='" + parentId + '\'' +
                ", title=" + title + '\'' +
                '}';
    }
}
