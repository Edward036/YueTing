package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtNovel;
import com.keyi.yueting.repository.NovelRepository;
import com.keyi.yueting.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by 廖师兄
 * 2016-10-30 23:36
 */
@RestController
public class YtNovelController {
    @Autowired
    private NovelRepository repository;

    /**
     * 查询所有专辑列表
     *
     * @return
     */
    @RequestMapping("/novel")
    public Result<YtNovel> getList() {
        return ResultUtil.success(repository.findAll());
    }

    @PostMapping(value = "/comment")
    public Result<YtNovel> add(@Valid YtNovel ytNovel,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        ytNovel.setBid(ytNovel.getBid());
        ytNovel.setBrief(ytNovel.getBrief());
        ytNovel.setCatId(ytNovel.getCatId());
        ytNovel.setCatName(ytNovel.getCatName());
        ytNovel.setCover(ytNovel.getCover());
        ytNovel.setPlayer(ytNovel.getPlayer());
        ytNovel.setTitle(ytNovel.getTitle());
        ytNovel.setWriter(ytNovel.getWriter());
        ytNovel.setCatParentId(ytNovel.getCatParentId());
        ytNovel.setChaptTotal(ytNovel.getChaptTotal());
        return ResultUtil.success(repository.save(ytNovel));
    }
}
