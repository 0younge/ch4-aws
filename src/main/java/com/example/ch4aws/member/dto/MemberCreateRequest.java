package com.example.ch4aws.member.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberCreateRequest {

    @NotBlank(message = "팀원 이름은 필수입니다.")
    private final String name;

    @NotNull(message = "팀원 나이는 필수입니다.")
    private final Integer age;

    @NotBlank(message = "팀원 MBTI는 필수입니다.")
    private final String mbti;
}
