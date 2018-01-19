package com.keyi.yueting.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author qiupengxie
 */
@Data
@Entity
public class YtShelf {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 16, columnDefinition = "int(16) COMMENT '用户Id'")
    private Integer userId;

    @Column(length = 16, columnDefinition = "int(16) COMMENT '专辑Id'")
    private Integer novelId;
}
