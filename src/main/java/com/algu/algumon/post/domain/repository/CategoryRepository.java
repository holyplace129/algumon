package com.algu.algumon.post.domain.repository;

import com.algu.algumon.post.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
