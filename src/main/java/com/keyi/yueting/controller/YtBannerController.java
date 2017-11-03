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
    private BannerRepository repository;

    @GetMapping(value = "/banner")
    public Result<YtBanner> getList() {
        return ResultUtil.success(repository.findAll());
    }

    @PostMapping(value = "/banner")
    public Result<Girl> add(@Valid YtBanner ytBanner, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        ytBanner.setImage(ytBanner.getImage());
        ytBanner.setText(ytBanner.getText());
        ytBanner.setToUrl(ytBanner.getToUrl());
        return ResultUtil.success(repository.save(ytBanner));
    }

    @DeleteMapping(value = "/banner/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.delete(id);
    }
}
