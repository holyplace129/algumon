package com.algu.algumon.post.domain.repository;

import com.algu.algumon.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
