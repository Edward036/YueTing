package com.keyi.yueting.domain;

import lombok.Data;

import javax.persistence.*;


/**
 * @author qiupengxie
 */
@Data
@Entity
//@Table(appliesTo = "yt_recomment", comment = "首页推荐列表")
public class YtRecommend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "title", length = 64, columnDefinition = "varchar(64) COMMENT '标题'")
    private String title;

    @Column(name = "novel_id", columnDefinition = "int(16) COMMENT '专辑id'")
    private Integer novelId;

    @Column(name = "sort", columnDefinition = "int(16) COMMENT '首页排序'")
    private Integer sort;
}
