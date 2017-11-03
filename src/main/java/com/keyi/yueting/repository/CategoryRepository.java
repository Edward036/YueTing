package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtNovelCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<YtNovelCategory, Integer> {
        public List<YtNovelCategory> findByTitle(String string);
    }