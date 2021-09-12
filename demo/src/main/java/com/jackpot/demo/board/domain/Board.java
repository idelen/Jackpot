package com.jackpot.demo.board.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String content;

    @Column(name = "createdat")
    private LocalDateTime createdAt;

    @Column(name = "createdby")
    private String createdBy;

    @Column(name = "updatedat")
    private LocalDateTime updatedAt;

    @Column(name = "updatedby")
    private String updatedBy;
}
