package com.algu.algumon.user.dto.response;

import com.algu.algumon.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class UserResponse {

    private final Long id;
    private final String email;
    private final String password;
    private final Long level;
    private final Long experiencePoint;
    private final LocalDate createDate;
    private final Long visitCnt;
    private final Boolean isBlocked;
    private final Boolean isDeleted;

    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getLevel(),
                user.getExperiencePoint(),
                user.getCreateDate(),
                user.getVisitCnt(),
                user.getIsBlocked(),
                user.getIsDeleted()
        );
    }
}
