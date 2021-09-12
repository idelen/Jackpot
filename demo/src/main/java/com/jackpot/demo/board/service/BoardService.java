package com.jackpot.demo.board.service;

import com.jackpot.demo.board.domain.Board;
import com.jackpot.demo.board.dto.BoardResponseDto;
import com.jackpot.demo.board.repository.BoardRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {

    @Autowired
    private BoardRepositoryImpl boardRepository;

    @Transactional(readOnly = true)
    public BoardResponseDto findById(Long id) {
        return convertDto(boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시물 존재안함")));
    }

    public BoardResponseDto convertDto(Board board) {
        return new BoardResponseDto(board);
    }

}
