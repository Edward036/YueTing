package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtNovel;
import com.keyi.yueting.repository.NovelRepository;
import com.keyi.yueting.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2016-10-30 23:36
 */
@RestController
public class YtNovelController {
    @Autowired
    private NovelRepository novelRepository;

    /**
     * 查询所有专辑列表
     *
     * @return
     */
    @RequestMapping("/novel")
    public Result<YtNovel> girlList() {
        return ResultUtil.success(novelRepository.findAll());
    }



}
