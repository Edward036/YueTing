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
public class YtRecordListen {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 16)
    private Integer userId;

    @Column(length = 16)
    private Integer novelId;

    @NotNull(message = "")
    @Column(length = 1024)
    private String recent;

    @NotNull(message = "")
    @Column(length = 1024)
    private String progress;

    @NotNull(message = "")
    @Column(length = 16)
    private Integer utime;

    public YtRecordListen() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", recent='" + recent + '\'' +
                ", progress=" + progress + '\'' +
                ", utime=" + utime + '\'' +
                '}';
    }
}
