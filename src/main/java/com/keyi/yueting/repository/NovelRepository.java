package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtNovel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NovelRepository extends JpaRepository<YtNovel, Integer> {
        public List<YtNovel> findByTitle(String string);
    }