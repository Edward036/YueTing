package com.keyi.yueting.domain;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Entity
@Table(appliesTo = "yt_comment", comment = "评论管理")
public class YtComment {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @Column(columnDefinition = "int(11) COMMENT '专辑id'")
    private Integer novelId;

    @Column(columnDefinition = "varchar(16) COMMENT '评论人'")
    private String name;

    @Min(value = 0, message = "")
    @Column(columnDefinition = "varchar(16) COMMENT '点赞数量'")
    private Integer like;

    @Column(columnDefinition = "varchar(16) COMMENT '评论内容'")
    private String comment;

    public YtComment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNovelId() {
        return novelId;
    }

    public void setNovelId(Integer novelId) {
        this.novelId = novelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
