package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;

@Controller
public class GoodsController {

	private GoodsDAO dao;
	
	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listGoods.do")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", dao.listAll());
		mv.setViewName("listGoods");
		return mv;
	}
	
	@RequestMapping("/detailGoods.do")
	public ModelAndView detail(@RequestParam("no") int no) {
		ModelAndView mv = new ModelAndView("detailGoods");
		//viewName을 매개변수로 가짐
		mv.addObject("g", dao.getGoods(no));
		return mv;
	}
	
	
}
