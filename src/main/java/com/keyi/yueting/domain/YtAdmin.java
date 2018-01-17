package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Data
@Entity
public class YtAdmin {

//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "username", length = 32)
    private String username;

    @NotNull(message = "")
    @Column(name = "password", length = 32)
    private String password;
}
