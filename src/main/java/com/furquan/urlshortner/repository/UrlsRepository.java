package com.furquan.urlshortner.repository;

import com.furquan.urlshortner.entity.ShortUrls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlsRepository extends JpaRepository<ShortUrls, Long> {
}
