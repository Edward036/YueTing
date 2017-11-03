package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<YtComment, Integer> {
//    public List<YtComment> findByText(String string);
}