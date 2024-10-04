package com.algu.algumon.post.presentation;

import com.algu.algumon.post.domain.Post;
import com.algu.algumon.post.dto.request.PostRequest;
import com.algu.algumon.post.dto.response.PostResponse;
import com.algu.algumon.post.service.PostService;
import lombok.RequiredArgsConstructor;
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

    // 게시글 작성
    @PostMapping("")
    public ResponseEntity<Post> write(@RequestBody PostRequest param) {
        Post post = postService.createPost(param);
        return ResponseEntity.ok(post);
    }
}
