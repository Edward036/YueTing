package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @author qiupengxie
 */
@Data
@Entity
public class YtRecordListen {

    @Id
    @GeneratedValue
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
}
