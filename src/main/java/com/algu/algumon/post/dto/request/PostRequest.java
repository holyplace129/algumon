package com.algu.algumon.post.dto.request;

import com.algu.algumon.post.domain.Category;
import com.algu.algumon.user.domain.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
public class PostRequest {

    private String title;
    private String content;
    private Category category;

    @Builder
    public PostRequest(String title, String content, Category category) {
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
