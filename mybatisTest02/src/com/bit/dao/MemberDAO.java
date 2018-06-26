package com.bit.dao;

import java.util.List;

import com.bit.db.MemberManager;
import com.bit.vo.MemberVO;

public class MemberDAO {
	public List<MemberVO> listAll() {
		return MemberManager.listAll();
	}
	
}
