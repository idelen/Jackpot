package com.jackpot.demo.board.dto;

import com.jackpot.demo.board.domain.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.createdAt = board.getCreatedAt();
        this.createdBy = board.getCreatedBy();
        this.updatedAt = board.getUpdatedAt();
        this.updatedBy = board.getUpdatedBy();
    }
}
