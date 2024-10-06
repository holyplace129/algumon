package com.algu.algumon.user.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    private Long level = 1L;

    private Long experiencePoint = 0L;

    private LocalDate createDate;

    private Long visitCnt = 0L;

    private Boolean isBlocked = false;

    private Boolean isDeleted = false;

    @Builder
    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.createDate = LocalDate.now();
    }
}
