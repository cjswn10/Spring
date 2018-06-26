package com.bit.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.bit.vo.DeptVO;

public class DeptDAO {

   private SimpleJdbcTemplate template;

   public void setDataSource(DataSource dataSource) {

      template = new SimpleJdbcTemplate(dataSource);
   }

   public List<DeptVO> listAll() {

      List<DeptVO> list = null;
      String sql = "SELECT * FROM dept ORDER BY dno";
      RowMapper<DeptVO> mapper = new BeanPropertyRowMapper<DeptVO>(DeptVO.class);
      list = template.query(sql, mapper);
      //executeQuery, executeUpdate
      return list;
   }
   
   public int insert(DeptVO d) {
	   int re = -1;
	   String sql ="INSERT INTO dept values(?,?,?)";
	   re = template.update(sql, d.getDno(), d.getDname(), d.getDloc());
	   return re;
   }
   
   public DeptVO detail(int dno) {
	   DeptVO d = new DeptVO();
	   String sql = "SELECT * FROM dept WHERE dno=?";
	   RowMapper<DeptVO> mapper = new BeanPropertyRowMapper<DeptVO>(DeptVO.class);
	   d = template.queryForObject(sql, mapper, dno);
	   return d;
   }
   
   public int update(DeptVO d) {
	   int re = -1;
	   String sql ="UPDATE dept SET dname=?, dloc=? WHERE dno=?";
	   re = template.update(sql, d.getDname(), d.getDloc(), d.getDno());
	   return re;
   }
   
   public int delete(int dno) {
	   int re = -1;
	   String sql = "DELETE dept WHERE dno=?";
	   re = template.update(sql, dno);
	   return re;
   }
}