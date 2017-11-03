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
@Table(appliesTo = "yt_novel_chapt", comment = "小说章节表")
public class YtNovelChapt {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(columnDefinition = "int(16) COMMENT '类型：1音频 2文本'")
    private Integer type;

    @Column(columnDefinition = "int(16) COMMENT '小说ID'")
    private Integer novelId;

    @Column(columnDefinition = "int(16) COMMENT '章节号'")
    private Integer chapt;

    @Column(columnDefinition = "varchar(32) COMMENT '章节标题'")
    private String title;

    @Column(columnDefinition = "int(32) COMMENT '本章节总秒数'")
    private Integer seconds;

    @Column(columnDefinition = "varchar(32) COMMENT '音频URL'")
    private String fileUrl;

    @Column(columnDefinition = "int(16) COMMENT '状态：1在线 0下线'")
    private Integer status;

    @Column(columnDefinition = "int(16) COMMENT '1收费 0免费'")
    private Integer vip;

    @Column(columnDefinition = "varchar(64) COMMENT '原始文件作品名称'")
    private String originNovelTitle;

    @Column(columnDefinition = "varchar(64) COMMENT '原始文件章节名称'")
    private String originChaptTitle;

    @Column(columnDefinition = "int(16)")
    private Integer ctime;

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

    public Integer getNovelId() {
        return novelId;
    }

    public void setNovelId(Integer novelId) {
        this.novelId = novelId;
    }

    public Integer getChapt() {
        return chapt;
    }

    public void setChapt(Integer chapt) {
        this.chapt = chapt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
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

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
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
