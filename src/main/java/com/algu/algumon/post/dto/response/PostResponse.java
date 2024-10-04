package com.algu.algumon.post.dto.response;

import com.algu.algumon.post.domain.Category;
import com.algu.algumon.post.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class PostResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final Long views;
    private final LocalDateTime createDate;
    private final Long userId;
    private final Category category;

    public static PostResponse from(Post post) {
        return new PostResponse(
                post.getId(),
                post.getTitle(),
                post.getContent(),
                post.getViews(),
                post.getCreateDate(),
                post.getUser().getId(),
                post.getCategory()
        );
    }
}

