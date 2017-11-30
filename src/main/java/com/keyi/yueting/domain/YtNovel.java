package com.keyi.yueting.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Data
@Entity
public class YtNovel {

    private static final String OSS = "http://yue-ting.oss-cn-beijing.aliyuncs.com/";

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @Column(columnDefinition = "int(16) COMMENT '长兄ID，0：没有兄弟，大于0：哥哥ID，即priorId'")
    private Integer bid;

    @Column(columnDefinition = "int(16) COMMENT '小说栏目主分类ID'")
    private Integer catParentId;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '小说栏目子分类ID'")
    private Integer catId;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT '章节总数'")
    private Integer chaptTotal;

    @NotNull(message = "")
    @Column(columnDefinition = "int(2) COMMENT '是否完结，1已完结 0未完结'")
    private Integer isEnd;

    @NotNull(message = "")
    @Column(columnDefinition = "int(2) COMMENT '状态：1正常 2下架 3删除'")
    private Integer status;

    @NotNull(message = "")
    @Column(columnDefinition = "int(64) COMMENT '播放次数'")
    private Integer clickNum;

    @NotNull(message = "")
    @Column(columnDefinition = "int(64) COMMENT '基础播放次数'")
    private Integer ClickNumBase;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT '书名'")
    private String title;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(256) COMMENT '封面URL'")
    private String cover;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT '小说栏目名称'")
    private String catName;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT '作者（原著）'")
    private String writer;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(64) COMMENT '主播'")
    private String player;

    @NotNull(message = "")
    @Column(columnDefinition = "varchar(1024) COMMENT '简介'")
    private String brief;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT 'createTime'")
    private Long ctime;

    @NotNull(message = "")
    @Column(columnDefinition = "int(16) COMMENT 'updateTime'")
    private Long utime;

//    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH})
//    @JoinColumn(name="novel_id")
//    private YtRecommend ytRecommend;
}
