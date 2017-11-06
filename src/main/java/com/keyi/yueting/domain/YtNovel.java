package com.keyi.yueting.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
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

    public YtNovel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getCatParentId() {
        return catParentId;
    }

    public void setCatParentId(Integer catParentId) {
        this.catParentId = catParentId;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getChaptTotal() {
        return chaptTotal;
    }

    public void setChaptTotal(Integer chaptTotal) {
        this.chaptTotal = chaptTotal;
    }

    public Integer getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Integer getClickNumBase() {
        return ClickNumBase;
    }

    public void setClickNumBase(Integer clickNumBase) {
        ClickNumBase = clickNumBase;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return OSS + cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Long getUtime() {
        return utime;
    }

    public void setUtime(Long utime) {
        this.utime = utime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", ClickNumBase='" + ClickNumBase + '\'' +
                ", ctime=" + ctime + '\'' +
                ", utime=" + utime + '\'' +
                '}';
    }
}
