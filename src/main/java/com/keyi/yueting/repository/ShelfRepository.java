package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtShelf;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShelfRepository extends JpaRepository<YtShelf, Integer> {
    public List<YtShelf> findByUserId(Integer integer);
}