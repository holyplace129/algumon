package com.algu.algumon.user.service;

import com.algu.algumon.user.domain.User;
import com.algu.algumon.user.domain.repository.UserRepository;
import com.algu.algumon.user.dto.reqeust.SigninRequest;
import com.algu.algumon.user.dto.reqeust.UserRequest;
import com.algu.algumon.user.dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 회원가입
    public Long signUpUser(UserRequest param) {
        User user = User.builder()
                .email(param.getEmail())
                .password(param.getPassword())
                .build();

        userRepository.save(user);
        return user.getId();
    }

    // 로그인
    public User signin(SigninRequest param) {
        Optional<User> optionalUser = userRepository.findByEmail(param.getEmail());

        if (optionalUser.isEmpty()) {
            return null;
        }

        User user = optionalUser.get();

        if (!user.getPassword().equals(param.getPassword())) {
            return null;
        }

        return user;
    }

    // 유저 조회
    public List<UserResponse> findAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserResponse(
                        user.getId(),
                        user.getEmail(),
                        user.getPassword(),
                        user.getLevel(),
                        user.getExperiencePoint(),
                        user.getCreateDate(),
                        user.getVisitCnt(),
                        user.getIsBlocked(),
                        user.getIsDeleted()
                )).collect(Collectors.toList());
    }
}
