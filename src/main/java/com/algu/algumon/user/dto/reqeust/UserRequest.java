package com.algu.algumon.user.dto.reqeust;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserRequest {

    @Email(message = "유효한 이메일을 입력해주세요.")
    private String email;

    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;

    private LocalDate createDate;

    @Builder
    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
        this.createDate = LocalDate.now();
    }
}
