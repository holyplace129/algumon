package com.algu.algumon.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    private Long level;
    private Long experiencePoint;
    private LocalDate createDate;
    private Long visitCnt;
    private Boolean isBlocked;
    private Boolean isDeleted;


}
