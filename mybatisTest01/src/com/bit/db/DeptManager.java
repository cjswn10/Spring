package com.bit.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.DeptVO;

public class DeptManager {
	private static SqlSessionFactory factory;
	static {
		//프로젝트 실행시에 실행됨
		try {
			Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	public static List<DeptVO> listAll() {
		List<DeptVO> list = null;
		SqlSession session = factory.openSession();
		list = session.selectList("dept.selectAll");
		session.close();
		return list;
	}
	
	public static int insert(DeptVO d) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		//commit할지말지 Auto commit 설정
		re = session.insert("dept.insert", d);
		//session.commit();
		//반드시 commit해줘야함
		session.close();
		return re;
	}
	
	public static DeptVO detail(int dno) {
		DeptVO d = new DeptVO();
		SqlSession session = factory.openSession();
		Map map = new HashMap();
		map.put("dno", dno);
		d = session.selectOne("dept.detail", map);
		session.close();
		return d;
	}
	
	public static int update(DeptVO d) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.update("dept.update", d);
		session.close();
		return re;
	}
	
	public static int delete(int dno) {
		int re = -1;
		SqlSession session = factory.openSession(true);
		re = session.delete("dept.delete", dno);
		session.close();
		return re;
	}
}
