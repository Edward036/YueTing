package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtRecommend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecommendRepository extends JpaRepository<YtRecommend, Integer> {
//    public List<YtShelf> findByUserId(Integer integer);

    @Query(value = "select r.sort, n.title, r.title from yt_recommend r LEFT JOIN yt_novel n on his.user_id=u.id", nativeQuery = true)
    List<YtRecommend> findWithNovel();
}