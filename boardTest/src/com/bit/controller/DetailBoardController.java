package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDAO;


@Controller
public class DetailBoardController {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/detailBoard.do")
	public ModelAndView detail(@RequestParam("no")int no) {
		ModelAndView mv = new ModelAndView("detailBoard");
		mv.addObject("b", dao.getBoard(no));
		return mv;
	}
}
