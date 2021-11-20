package com.practice4.demojbdc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice4.demojbdc.dao.CourseDAO;
import com.practice4.demojbdc.entity.Course;

@SpringBootApplication
public class DemojbdcApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseDAO courseDAo;

	public static void main(String[] args) {
		SpringApplication.run(DemojbdcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course c = new Course(4,"JM");
		Course c1 = new Course(1,"SBH");
		// TODO Auto-generated method stub
		
		logger.info("single query values ->{}" ,courseDAo.findOne(2));
		logger.info("delete the id -> {}", courseDAo.deleteId(2));
		logger.info("inserting new values ->{}", courseDAo.insertValue(c));
		logger.info(" update the value -> {}",courseDAo.updateValue(c1));
		logger.info("all values from  -> {}", courseDAo.findAll());
		
	}

}
