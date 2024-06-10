package com.ex.spring_jap_board.repository;

import com.ex.spring_jap_board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByTitleContaining(String Keyword);
    List<Board> findByMemberEmail(String email);
    Page<Board> findAll(Pageable pageable);
}
