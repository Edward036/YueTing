package com.keyi.yueting.repository;

import com.keyi.yueting.domain.YtBanner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BannerRepository extends JpaRepository<YtBanner, Integer> {
    public List<YtBanner> findByText(String string);
}