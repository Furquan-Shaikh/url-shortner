package com.furquan.urlshortner.repository;

import com.furquan.urlshortner.entity.UrlClicks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalyticsRepository extends JpaRepository<UrlClicks, Long> {
}
