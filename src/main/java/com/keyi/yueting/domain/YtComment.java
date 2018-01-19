package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;

/**
 * @author qiupengxie
 */
@Data
@Entity
@Table(appliesTo = "yt_comment", comment = "评论管理")
public class YtComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "int(16) COMMENT '专辑id'")
    private Integer novelId;

    @Column(columnDefinition = "varchar(16) COMMENT '评论人'")
    private String name;

    @Column(columnDefinition = "int(16) COMMENT '点赞数量'")
    private Integer likeNum;

    @Column(columnDefinition = "varchar(16) COMMENT '评论内容'")
    private String comment;
}
