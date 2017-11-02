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
public class YtNovelChapt {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer type;

    @Column(length = 32)
    private String novelId;

    @NotNull(message = "")
    @Column(length = 32)
    private String chapt;

    @NotNull(message = "")
    @Column(length = 32)
    private String title;

    @NotNull(message = "")
    @Column(length = 32)
    private String seconds;

    @NotNull(message = "")
    @Column(length = 32)
    private String fileUrl;

    @NotNull(message = "")
    @Column(length = 32)
    private String status;

    @NotNull(message = "")
    @Column(length = 32)
    private String vip;

    @NotNull(message = "")
    @Column(length = 32)
    private String originNovelTitle;

    @NotNull(message = "")
    @Column(length = 32)
    private String originChaptTitle;

    @NotNull(message = "")
    @Column(length = 32)
    private String ctime;

    public YtNovelChapt() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNovelId() {
        return novelId;
    }

    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }

    public String getChapt() {
        return chapt;
    }

    public void setChapt(String chapt) {
        this.chapt = chapt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getOriginNovelTitle() {
        return originNovelTitle;
    }

    public void setOriginNovelTitle(String originNovelTitle) {
        this.originNovelTitle = originNovelTitle;
    }

    public String getOriginChaptTitle() {
        return originChaptTitle;
    }

    public void setOriginChaptTitle(String originChaptTitle) {
        this.originChaptTitle = originChaptTitle;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", originNovelTitle='" + originNovelTitle + '\'' +
                ", originChaptTitle=" + originChaptTitle + '\'' +
                ", ctime=" + ctime + '\'' +
                '}';
    }
}
