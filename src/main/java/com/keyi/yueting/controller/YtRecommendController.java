package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtRecommend;
import com.keyi.yueting.repository.RecommendRepository;
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
public class YtRecommendController {
    @Autowired
    private RecommendRepository repository;

       @GetMapping(value = "/recommend")
    public Result<YtRecommend> getList() {
        return ResultUtil.success(repository.findAll());
    }

    @GetMapping(value = "/recommend/{rank}")
    public Result<YtRecommend> getListByRank(@PathVariable("rank") Integer integer) {
        return ResultUtil.success(repository.findBySort(integer));
    }


    @PostMapping(value = "/recommend")
    public Result<YtRecommend> add(@Valid YtRecommend ytRecommend,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        ytRecommend.setNovelId(ytRecommend.getNovelId());
        ytRecommend.setSort(ytRecommend.getSort());
        ytRecommend.setTitle(ytRecommend.getTitle());
        return ResultUtil.success(repository.save(ytRecommend));
    }

    @DeleteMapping(value = "/recommend")
    public void delete(@PathVariable("userId") Integer userId) {
        repository.delete(userId);
    }
}
