package com.algu.algumon.post.presentation;

import com.algu.algumon.post.domain.Post;
import com.algu.algumon.post.dto.request.PostRequest;
import com.algu.algumon.post.dto.response.PostResponse;
import com.algu.algumon.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostApi {

    private final PostService postService;

    // 게시글 조회
    @GetMapping("")
    public ResponseEntity<List<PostResponse>> findAll() {
        List<PostResponse> posts = postService.findAll();
        return ResponseEntity.ok(posts);
    }

    // 단일 게시글 조회
    @GetMapping("/{postId}")
    public ResponseEntity<PostResponse> getPostId(@PathVariable Long postId) {
        PostResponse post = postService.getPostById(postId);
        return ResponseEntity.ok(post);
    }

    // 게시글 작성
    @PostMapping("")
    public ResponseEntity<PostResponse> writePost(@RequestBody PostRequest param) {
        PostResponse response = postService.createPost(param);
        return ResponseEntity.ok(response);
    }

    // 게시글 수정
    @PutMapping("/{postId}")
    public ResponseEntity<PostResponse> updatePost(@PathVariable Long postId, @RequestBody PostRequest param) {
        PostResponse response = postService.updatePost(postId, param);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
