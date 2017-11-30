package com.keyi.yueting.domain;

import lombok.Data;
import org.hibernate.annotations.Table;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Data
@Entity
@Table(appliesTo = "yt_novel_chapt", comment = "小说章节表")
public class YtNovelChapt {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(columnDefinition = "int(16) COMMENT '类型：1音频 2文本'")
    private Integer type;

    @Column(columnDefinition = "int(16) COMMENT '小说ID'")
    private Integer novelId;

    @Column(columnDefinition = "int(16) COMMENT '章节号'")
    private Integer chapt;

    @Column(columnDefinition = "varchar(32) COMMENT '章节标题'")
    private String title;

    @Column(columnDefinition = "int(32) COMMENT '本章节总秒数'")
    private Integer seconds;

    @Column(columnDefinition = "varchar(32) COMMENT '音频URL'")
    private String fileUrl;

    @Column(columnDefinition = "int(16) COMMENT '状态：1在线 0下线'")
    private Integer status;

    @Column(columnDefinition = "int(16) COMMENT '1收费 0免费'")
    private Integer vip;

    @Column(columnDefinition = "varchar(64) COMMENT '原始文件作品名称'")
    private String originNovelTitle;

    @Column(columnDefinition = "varchar(64) COMMENT '原始文件章节名称'")
    private String originChaptTitle;

    @Column(columnDefinition = "int(16)")
    private Integer ctime;
}
