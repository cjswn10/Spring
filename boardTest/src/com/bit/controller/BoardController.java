package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDAO;

@Controller
public class BoardController {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listBoard.do")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("listBoard");
		mv.addObject("list", dao.listAll());
		return mv;
	}
}
