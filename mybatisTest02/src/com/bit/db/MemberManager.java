package com.bit.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.bit.vo.MemberVO;

public class MemberManager {
	private static SqlSessionFactory factory;
    static {
           try {
                  Reader reader = Resources.getResourceAsReader("com/bit/db/sqlMapConfig.xml");
                  factory = new SqlSessionFactoryBuilder().build(reader);
           } catch (Exception e) {
                  // TODO: handle exception
                  System.out.println(e.getMessage());
           }
    }
    
    public static List<MemberVO> listAll() {
    	List<MemberVO> list = null;
    	SqlSession session = factory.openSession();
    	list = session.selectList("members.selectAll");
    	session.close();
    	return list;
    }
    
    
}
