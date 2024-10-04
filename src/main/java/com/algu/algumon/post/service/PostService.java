package com.algu.algumon.post.service;

import com.algu.algumon.post.domain.Post;
import com.algu.algumon.post.domain.repository.PostRepository;
import com.algu.algumon.post.dto.request.PostRequest;
import com.algu.algumon.post.dto.response.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService{

    private final PostRepository postRepository;

    public List<PostResponse> findAll() {
        return postRepository.findAll().stream()
                .map(post -> new PostResponse(
                        post.getId(),
                        post.getTitle(),
                        post.getContent(),
                        post.getViews(),
                        post.getCreateDate(),
                        post.getUser().getId(),
                        post.getCategory()
                )).collect(Collectors.toList());
    }

    public Post createPost(PostRequest param) {
        Post post = Post.builder()
                .title(param.getTitle())
                .content(param.getContent())
                .views(0L)
                .user(param.getUser())
                .category(param.getCategory())
                .build();

        return postRepository.save(post);
    }
}
