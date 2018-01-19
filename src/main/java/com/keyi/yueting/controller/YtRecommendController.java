package com.keyi.yueting.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtRecommend;
import com.keyi.yueting.repository.RecommendRepository;
import com.keyi.yueting.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by 廖师兄
 * 2016-10-30 23:36
 */
@RestController
public class YtRecommendController {
    @Autowired
    private RecommendRepository repository;
    @GetMapping(value = "/recommend")
    public Result getList() {
        List list = repository.findWithNovel();
        JSONArray recommend = (JSONArray) JSON.toJSON(list);
        return ResultUtil.success(recommend);
    }

    @GetMapping(value = "/recommend/{rank}")
    public Result getListByRank(@PathVariable("rank") Integer integer) {
        return ResultUtil.success(repository.findByNovelSort(integer));
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
