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
public class YtPositionData {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer tId;

    @Column(length = 16)
    private Integer typeId;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer posId;

    @NotNull(message = "")
    @Column(length = 32)
    private String thumb;

    @NotNull(message = "")
    @Column(length = 32)
    private String toUrl;

    @NotNull(message = "")
    @Column(length = 256)
    private String data;

    @NotNull(message = "")
    @Column(length = 32)
    private String listOrder;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer ctime;

    public YtPositionData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getToUrl() {
        return toUrl;
    }

    public void setToUrl(String toUrl) {
        this.toUrl = toUrl;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getListOrder() {
        return listOrder;
    }

    public void setListOrder(String listOrder) {
        this.listOrder = listOrder;
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
                ", data='" + data + '\'' +
                ", listOrder=" + listOrder + '\'' +
                ", ctime=" + ctime + '\'' +
                '}';
    }
}
