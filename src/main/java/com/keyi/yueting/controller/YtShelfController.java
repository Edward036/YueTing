package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtShelf;
import com.keyi.yueting.repository.ShelfRepository;
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
public class YtShelfController {
    @Autowired
    private ShelfRepository repository;

    @GetMapping(value = "/shelf/{id}")
    public Result<YtShelf> getList() {
        return ResultUtil.success(repository.findAll());
    }

    @PostMapping(value = "/shelf")
    public Result<YtShelf> add(@Valid YtShelf ytShelf, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        ytShelf.setNovelId(ytShelf.getNovelId());
        ytShelf.setUserId(ytShelf.getUserId());
        return ResultUtil.success(repository.save(ytShelf));
    }

    @DeleteMapping(value = "/shelf/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.delete(id);
    }
}
