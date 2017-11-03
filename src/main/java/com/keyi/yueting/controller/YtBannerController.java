package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtBanner;
import com.keyi.yueting.repository.BannerRepository;
import com.keyi.yueting.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 廖师兄
 * 2016-10-30 23:36
 */
@RestController
public class YtBannerController {
    @Autowired
    private BannerRepository bannerRepository;

    /**
     * 查询所有分类列表
     *
     * @return
     */
    @GetMapping(value = "/banner")
    public Result<YtBanner> getList() {
        return ResultUtil.success(bannerRepository.findAll());
    }
}
