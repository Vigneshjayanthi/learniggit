package com.practice4.demojbdc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.practice4.demojbdc.entity.Course;

public class CourseRowMapper  implements RowMapper<Course>{

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		Course c1 = new Course();
		c1.setCourseid(rs.getInt("courseid"));
		c1.setCourseName(rs.getString("coursename"));
		return c1;
	}

}
