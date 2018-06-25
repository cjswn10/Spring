package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;


/*
 * 같은 url로 가는 경우 클래스 헤드에 RequestMapping을 써줄 수 있다.
 * value로 각각 써줘도 됨
 *@RequestMapping(value="/insertGoods.do", method=RequestMethod.GET)
 */
@Controller
@RequestMapping("/insertGoods.do")
public class InsertGoodsController {
	private GoodsDAO dao;
	
	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public void form() {
			//이렇게 쓰면 위에(head) requestMapping에 쓴 애로 감
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submit(GoodsVO g) {
		ModelAndView mv = new ModelAndView();
		int re = dao.insertGoods(g);
		if(re > 0) {
			mv.setViewName("redirect:/listGoods.do");
		} else {
			mv.addObject("msg", "상품등록 실패");
			mv.setViewName("error");
		}
		return mv;
	}
}
