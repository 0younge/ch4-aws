package com.example.ch4aws.member.service;

import com.example.ch4aws.member.entity.Member;
import com.example.ch4aws.member.dto.MemberCreateRequest;
import com.example.ch4aws.member.dto.MemberResponse;
import com.example.ch4aws.common.exception.MemberNotFoundException;
import com.example.ch4aws.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponse create(MemberCreateRequest request) {
        Member member = new Member(
                request.getName(),
                request.getAge(),
                request.getMbti().toUpperCase()
        );

        return MemberResponse.from(memberRepository.save(member));
    }

    public MemberResponse getById(Long id) {
        return memberRepository.findById(id)
                .map(MemberResponse::from)
                .orElseThrow(() -> new MemberNotFoundException(id));
    }
}
