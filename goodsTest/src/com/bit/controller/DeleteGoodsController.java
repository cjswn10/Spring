package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;

@Controller
public class DeleteGoodsController {
private GoodsDAO dao;
	
	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/deleteGoods.do")
	public ModelAndView delete(@RequestParam("no")int no) {
		ModelAndView mv = new ModelAndView();
		int re = dao.deleteGoods(no);
		if(re > 0) {
			mv.setViewName("redirect:/listGoods.do");
		} else {
			mv.addObject("msg", "상품수정 실패");
			mv.setViewName("error");
		}
		
		return mv;
	}

}
