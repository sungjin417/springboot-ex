package com.ex.spring_jap_board.repository;

import com.ex.spring_jap_board.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원 저장 테스트")
    public void createMemberTest() {
        for (int i = 0; i <= 10; i++) {
            Member member = new Member();
            member.setName("테스트 유저" + i);
            member.setPwd("qwe"+i);
            member.setEmail("test"+i+"@gmail.com");
            member.setImage("테스트 이미지"+i);
            memberRepository.save(member);
        }
    }
    @Test
    @DisplayName("가입여부 확인 테스트")
    public void findMemberAllTest() {
        this.createMemberTest();
        List<Member> memberList = memberRepository.findAll();
        for(Member e : memberList) System.out.println(e.toString());

    }

}