package com.furquan.urlshortner.repository;

import com.furquan.urlshortner.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
