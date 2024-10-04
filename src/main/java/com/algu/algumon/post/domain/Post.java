package com.algu.algumon.post.domain;

import com.algu.algumon.user.domain.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String title;
    @Setter
    private String content;
    private Long views;
    private LocalDateTime createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @Setter
    @Enumerated(value = EnumType.STRING)
    private Category category;

    @Builder
    public Post(String title, String content, Long views, User user, Category category) {
        this.title = title;
        this.content = content;
        this.views = views;
        this.createDate = LocalDateTime.now();
        this.user = user;
        this.category = category;
    }
}
