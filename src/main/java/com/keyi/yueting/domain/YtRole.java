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
public class YtRole {

    @Id
    @GeneratedValue
    @Column(length = 16)
    private Integer id;

    @Column(length = 32, columnDefinition = "varchar(32) COMMENT '用户组名称'")
    private String name;

    @Column(length = 1024, columnDefinition = "varchar(1024) COMMENT '权限控制'")
    private String acl;
}
