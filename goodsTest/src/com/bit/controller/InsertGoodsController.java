package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;


/*
 * ���� url�� ���� ��� Ŭ���� ��忡 RequestMapping�� ���� �� �ִ�.
 * value�� ���� ���൵ ��
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
			//�̷��� ���� ����(head) requestMapping�� �� �ַ� ��
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView submit(GoodsVO g) {
		ModelAndView mv = new ModelAndView();
		int re = dao.insertGoods(g);
		if(re > 0) {
			mv.setViewName("redirect:/listGoods.do");
		} else {
			mv.addObject("msg", "��ǰ��� ����");
			mv.setViewName("error");
		}
		return mv;
	}
}
