package com.bit.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDAO;
import com.bit.vo.BoardVO;

@Controller
@RequestMapping("/insertBoard.do")
public class InsertBoardController {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public void form() {
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submit(BoardVO b) {
		ModelAndView mv = new ModelAndView();
		int re = dao.insertBoard(b);
		if(re > 0) {
			mv.setViewName("redirect:/listBoard.do");
		} else {
			mv.addObject("msg", "게시물 등록 실패");
			mv.setViewName("error");
		}
		
		return mv;
	}
}
