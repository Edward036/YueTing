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
public class YtRecordLoginRecent {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer userId;

    @Column(length = 32)
    private String channelId;

    @NotNull(message = "")
    @Column(length = 32)
    private String loginTime;
}
