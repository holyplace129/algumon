package com.algu.algumon.post.service;

import com.algu.algumon.post.domain.Post;
import com.algu.algumon.post.domain.repository.PostRepository;
import com.algu.algumon.post.dto.request.PostRequest;
import com.algu.algumon.post.dto.response.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService{

    private final PostRepository postRepository;

    // 게시글 조회
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

    // 단일 게시글 조회
    public PostResponse getPostById(Long id) {
        Optional<Post> postId = postRepository.findById(id);

        if (postId.isPresent()) {
            return PostResponse.from(postId.get());
        } else {
            throw new IllegalArgumentException("해당 ID의 게시글을 찾을 수 없습니다.");
        }
    }

    // 게시글 작성
    public PostResponse createPost(PostRequest param) {
        Post post = Post.builder()
                .title(param.getTitle())
                .content(param.getContent())
                .category(param.getCategory())
                .build();

        Post savePost = postRepository.save(post);
        return PostResponse.from(savePost);
    }

    // 게시글 수정
    public PostResponse updatePost(Long id, PostRequest param) {
        Optional<Post> postId = postRepository.findById(id);

        if (postId.isPresent()) {
            Post post = postId.get();

            post.setTitle(param.getTitle());
            post.setContent(param.getContent());
            post.setCategory(param.getCategory());

            Post updatePost = postRepository.save(post);
            return PostResponse.from(updatePost);

        } else {
            throw new IllegalArgumentException("해당 ID의 게시글을 찾을 수 없습니다.");
        }
    }
}
