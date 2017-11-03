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
public class YtBanner {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    @Column(length = 16)
    private Integer id;

    @Column(length = 1024, columnDefinition = "varchar(1024) COMMENT '文案'")
    private String text;

    @Column(length = 64, columnDefinition = "varchar(64) COMMENT '跳转'")
    private String toUrl;

    @Column(length = 64, columnDefinition = "varchar(64) COMMENT '图片'")
    private String image;

    public YtBanner() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", toUrl='" + toUrl + '\'' +
                ", image=" + image + '\'' +
                '}';
    }
}
