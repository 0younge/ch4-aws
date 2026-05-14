package com.example.ch4aws.member.repository;

import com.example.ch4aws.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
