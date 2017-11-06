package com.keyi.yueting.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Entity
//@Table(appliesTo = "yt_recomment", comment = "首页推荐列表")
public class YtRecommend {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @Column(columnDefinition = "int(16) COMMENT '分类id'")
    private Integer categoryId;

    @Column(columnDefinition = "int(16) COMMENT '专辑id'")
    private Integer novelId;

    @Column(columnDefinition = "int(16) COMMENT '首页排序'")
    private Integer sort;

    public YtRecommend() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getNovelId() {
        return novelId;
    }

    public void setNovelId(Integer novelId) {
        this.novelId = novelId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", novelId='" + novelId + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
