package com.algu.algumon.user.presentation;

import com.algu.algumon.user.domain.User;
import com.algu.algumon.user.dto.reqeust.SigninRequest;
import com.algu.algumon.user.dto.reqeust.UserRequest;
import com.algu.algumon.user.dto.response.UserResponse;
import com.algu.algumon.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserApi {

    private final UserService userService;

    // 회원가입
    @PostMapping("/signup")
    public ResponseEntity<Void> signUpUser(@RequestBody UserRequest param) {
        userService.signUpUser(param);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // 로그인
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SigninRequest request) {
        User user = userService.signin(request);
        return ResponseEntity.ok(user);
    }

    // 유저 목록 조회
    @GetMapping("")
    public ResponseEntity<List<UserResponse>> findAllUsers() {
        List<UserResponse> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }
}
