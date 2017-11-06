package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtRecommend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendRepository extends JpaRepository<YtRecommend, Integer> {
//    public List<YtShelf> findByUserId(Integer integer);
}