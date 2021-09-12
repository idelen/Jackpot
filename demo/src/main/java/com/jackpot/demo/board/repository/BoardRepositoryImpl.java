package com.jackpot.demo.board.repository;

import com.jackpot.demo.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepositoryImpl extends JpaRepository<Board, Long> {
    Board save(Board board);
    Optional<Board> findById(Long id);
}
