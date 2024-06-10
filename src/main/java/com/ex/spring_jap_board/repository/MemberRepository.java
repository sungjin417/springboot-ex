package com.ex.spring_jap_board.repository;

import com.ex.spring_jap_board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email); // not null
    boolean existsByEmail(String email);
    Optional<Member> findByEmailAndPwd(String email, String pwd);
    List<Member> findAll();
}
