package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtNovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NovelRepository extends JpaRepository<YtNovel, Integer> {

    public static final String SQL = "SELECT * FROM yt_novel WHERE id = ?1";

//    public List<YtNovel> findByTitle(String string);

    @Query(value = SQL, nativeQuery = true)
    public List<YtNovel> findByNovelId(Integer integer);
}