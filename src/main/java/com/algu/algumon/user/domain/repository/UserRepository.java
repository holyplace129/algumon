package com.algu.algumon.user.domain.repository;

import com.algu.algumon.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
