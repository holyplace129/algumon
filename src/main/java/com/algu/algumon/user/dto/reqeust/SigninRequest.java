package com.algu.algumon.user.dto.reqeust;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {

    private String email;
    private String password;
}
