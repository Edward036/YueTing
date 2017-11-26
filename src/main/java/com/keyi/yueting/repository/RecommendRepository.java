package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtRecommend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecommendRepository extends JpaRepository<YtRecommend, Integer> {
//    public List<YtShelf> findByUserId(Integer integer);

    @Query(value = "select r.sort, n.title 'novel',concat('http://yue-ting.oss-cn-beijing.aliyuncs.com/', n.`cover`) 'cover', r.title from yt_recommend r LEFT JOIN yt_novel n on r.novel_id=n.id", nativeQuery = true)
    public List findWithNovel();

    @Query(value = "select r.sort, n.title 'novel',concat('http://yue-ting.oss-cn-beijing.aliyuncs.com/', n.`cover`) 'cover', r.title from yt_recommend r LEFT JOIN yt_novel n on r.novel_id=n.id WHERE sort= ?1", nativeQuery = true)
    public List findByNovelSort(Integer integer);

    public List findBySort(Integer integer);
}