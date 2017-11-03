package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Girl;
import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtBanner;
import com.keyi.yueting.repository.BannerRepository;
import com.keyi.yueting.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

    /**
     * 添加一个banner
     * @return
     */
    @PostMapping(value = "/banner")
    public Result<Girl> girlAdd(@Valid YtBanner ytBanner, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        ytBanner.setImage(ytBanner.getImage());
        ytBanner.setText(ytBanner.getText());
        ytBanner.setToUrl(ytBanner.getToUrl());
        return ResultUtil.success(bannerRepository.save(ytBanner));
    }

    //删除
    @DeleteMapping(value = "/banner/{id}")
    public void girlDelete(@PathVariable("id") Integer id) {
        bannerRepository.delete(id);
    }
}
