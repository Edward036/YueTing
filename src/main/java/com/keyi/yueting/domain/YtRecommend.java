package com.keyi.yueting.domain;

import javax.persistence.*;

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

    @Column(columnDefinition = "varchar(64) COMMENT '标题'")
    private String title;

    @Column(columnDefinition = "int(16) COMMENT '专辑id'")
    private Integer novelId;

    @Column(columnDefinition = "int(16) COMMENT '首页排序'")
    private Integer sort;

//    @OneToMany(mappedBy = "recommend", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private YtNovel ytNovel;

    public YtRecommend() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
