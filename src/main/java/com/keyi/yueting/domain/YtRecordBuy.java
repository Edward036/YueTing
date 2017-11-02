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
public class YtRecordBuy {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer userId;

    @Column(length = 32)
    private Integer novelId;

    @NotNull(message = "")
    @Column(length = 1024)
    private String chapJson;

    @NotNull(message = "")
    @Column(length = 1024)
    private Integer uTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNovelId() {
        return novelId;
    }

    public void setNovelId(Integer novelId) {
        this.novelId = novelId;
    }

    public String getChapJson() {
        return chapJson;
    }

    public void setChapJson(String chapJson) {
        this.chapJson = chapJson;
    }

    public Integer getuTime() {
        return uTime;
    }

    public void setuTime(Integer uTime) {
        this.uTime = uTime;
    }

    public YtRecordBuy() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", novelId='" + novelId + '\'' +
                ", chapJson=" + chapJson + '\'' +
                ", uTime=" + uTime + '\'' +
                '}';
    }
}
