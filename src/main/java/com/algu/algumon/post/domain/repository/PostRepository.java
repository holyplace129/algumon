package com.algu.algumon.post.domain.repository;

import com.algu.algumon.post.domain.Post;
import com.algu.algumon.post.dto.request.PostRequest;
import com.algu.algumon.post.dto.response.PostResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
