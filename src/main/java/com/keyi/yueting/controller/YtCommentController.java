package com.keyi.yueting.controller;

import com.keyi.yueting.domain.Result;
import com.keyi.yueting.domain.YtComment;
import com.keyi.yueting.repository.CommentRepository;
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
public class YtCommentController {
    @Autowired
    private CommentRepository repository;

    /**
     * 查询所有分类列表
     *
     * @return
     */
    @GetMapping(value = "/comment")
    public Result<YtComment> getList() {
        return ResultUtil.success(repository.findAll());
    }

    /**
     * 添加一个banner
     * @return
     */
    @PostMapping(value = "/comment")
    public Result<YtComment> add(@Valid YtComment ytComment, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        ytComment.setLikeNum(ytComment.getLikeNum());
        ytComment.setComment(ytComment.getComment());
        ytComment.setName(ytComment.getName());
        ytComment.setNovelId(ytComment.getNovelId());
        return ResultUtil.success(repository.save(ytComment));
    }

    //删除
    @DeleteMapping(value = "/comment/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.delete(id);
    }
}
