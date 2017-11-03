package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<YtComment, Integer> {
    public List<YtComment> findByNovelId(Integer integer);
}