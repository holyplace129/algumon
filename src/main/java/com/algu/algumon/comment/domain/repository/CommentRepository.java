package com.algu.algumon.comment.domain.repository;

import com.algu.algumon.comment.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
