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
public class YtAdminLog {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 5)
    private Integer admin_id;

    @Column(length = 32)
    private String admin_name;

    @Column(length = 32)
    private String admin_ip;

    @Column(length = 32)
    private String add_time;

    @Column(length = 32)

    private String password;

    public YtAdminLog() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", admin_id='" + admin_id + '\'' +
                ", admin_name=" + admin_name + '\'' +
                ", admin_ip=" + admin_ip + '\'' +
                '}';
    }
}
