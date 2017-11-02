package com.keyi.yueting.domain;

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
@Entity
public class YtNovel {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer bid;

    @Column(length = 32)
    private String title;

    @NotNull(message = "")
    @Column(length = 32)
    private String cover;

    @NotNull(message = "")
    @Column(length = 32)
    private String catId;

    @Column(length = 32)
    private String catParentId;

    @NotNull(message = "")
    @Column(length = 32)
    private String catName;

    @NotNull(message = "")
    @Column(length = 32)
    private String writer;

    @NotNull(message = "")
    @Column(length = 32)
    private String player;

    @NotNull(message = "")
    @Column(length = 32, columnDefinition = "COMMENT '简介'")
    private String brief;

    @NotNull(message = "")
    @Column(length = 32)
    private String chaptTotal;

    @NotNull(message = "")
    @Column(length = 32)
    private String isEnd;

    @NotNull(message = "")
    @Column(length = 32)
    private String status;

    @NotNull(message = "")
    @Column(length = 32)
    private String clickNum;

    @NotNull(message = "")
    @Column(length = 32)
    private String ClickNumBase;

    @NotNull(message = "")
    @Column(length = 32)
    private String ctime;

    @NotNull(message = "")
    @Column(length = 32)
    private String utime;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatParentId() {
        return catParentId;
    }

    public void setCatParentId(String catParentId) {
        this.catParentId = catParentId;
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

    public String getChaptTotal() {
        return chaptTotal;
    }

    public void setChaptTotal(String chaptTotal) {
        this.chaptTotal = chaptTotal;
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(String isEnd) {
        this.isEnd = isEnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClickNum() {
        return clickNum;
    }

    public void setClickNum(String clickNum) {
        this.clickNum = clickNum;
    }

    public String getClickNumBase() {
        return ClickNumBase;
    }

    public void setClickNumBase(String clickNumBase) {
        ClickNumBase = clickNumBase;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
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
