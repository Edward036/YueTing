package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtShelf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShelfRepository extends JpaRepository<YtShelf, Integer> {
    public List<YtShelf> findByUserId(Integer integer);

//    @Query(value = "select r.sort, n.title, r.title from yt_recommend r LEFT JOIN yt_novel n on r.novel_id=n.id", nativeQuery = true)
//    public List<YtShelf> findWithUserId();
}