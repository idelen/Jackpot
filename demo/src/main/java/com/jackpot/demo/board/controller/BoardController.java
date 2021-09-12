package com.jackpot.demo.board.controller;

import com.jackpot.demo.board.dto.BoardResponseDto;
import com.jackpot.demo.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/board")
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("")
    public String boardHome() {
        return "board/home";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView boardDetail(@PathVariable Long id) {
        BoardResponseDto boardResponseDto = boardService.findById(id);

        ModelAndView mv = new ModelAndView("board/detail");
        mv.addObject("board", boardResponseDto);

        return mv;
    }

}
