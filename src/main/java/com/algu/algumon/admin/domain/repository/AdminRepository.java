package com.algu.algumon.admin.domain.repository;

import com.algu.algumon.admin.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
