package com.practice4.demojbdc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practice4.demojbdc.entity.Course;

@Repository
public class CourseDAO {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Course> findAll(){
		return jdbctemplate.query("select * from course", new CourseRowMapper());
	}
	public Course findOne(int courseid) {
		return jdbctemplate.queryForObject("select * from course where courseid = ?", new Object[]{courseid},
				new BeanPropertyRowMapper<Course>(Course.class));
	}
	public int deleteId(int courseid) {
		return jdbctemplate.update("delete  from course where courseid = ?", new Object[] {courseid});
	}
	
	public int insertValue(Course c) {
		return jdbctemplate.update("insert into course(courseid, coursename) values(?,?)", 
				new Object[] {c.getCourseid(),c.getCourseName()});
	}
	public int updateValue(Course c) {
		return jdbctemplate.update("update course set coursename= ? where courseid= ?",
				new Object[] {c.getCourseName(), c.getCourseid()});
	}

}
