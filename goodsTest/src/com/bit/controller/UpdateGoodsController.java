package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;

@Controller
@RequestMapping("/updateGoods.do")
public class UpdateGoodsController {
	private GoodsDAO dao;
	
	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView form(@RequestParam("no")int no) {
		ModelAndView mv = new ModelAndView();
		GoodsVO g = dao.getGoods(no);
		mv.addObject("g", g);
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView update(GoodsVO g) {
		ModelAndView mv = new ModelAndView();
		int re = dao.updateGoods(g);
		if(re > 0) {
			mv.setViewName("redirect:/listGoods.do");
		} else {
			mv.addObject("msg", "상품수정 실패");
			mv.setViewName("error");
		}
		return mv;
	}
	
}
