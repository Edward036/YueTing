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
public class YtConfigTicket {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer role_id;

    @Column(length = 32)
    private String username;

    @NotNull(message = "")
    @Column(length = 32)
    private String password;

    public YtConfigTicket() {
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", role_id='" + role_id + '\'' +
                ", username=" + username + '\'' +
                ", password=" + password + '\'' +
                '}';
    }
}
