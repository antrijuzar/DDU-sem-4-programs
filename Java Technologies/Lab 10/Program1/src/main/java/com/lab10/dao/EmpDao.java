package com.lab10.dao;
import com.lab10.beans.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(Emp e){
		String sql = "insert into employee_info(name,salary,designation) values('"+e.getName()+"',"+e.getSalary()+",'"+e.getDesignation()+"')";
		return template.update(sql);
	}
	
	public int update(Emp e) {
		String sql = "update employee_info set name = '"+e.getName()+"',salary = "+e.getSalary()+",designation = '"+e.getDesignation()+"'";
		return template.update(sql);
	}
	
	public int delete(int id){
		String sql = "delete from employee_info where id = "+id+"";
		return template.update(sql);
	}
	
	public Emp getEmployeeByID(int id) {
		String sql = "select * from employee_info where id = ?";
		return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	
	public List<Emp> getAllEmployees(){
		return template.query("select * from employee_info", new RowMapper<Emp>(){

			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}
