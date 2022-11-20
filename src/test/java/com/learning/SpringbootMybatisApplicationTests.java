package com.learning;

import com.learning.dao.studentDao;
import com.learning.domain.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private studentDao studentDao;
	@Test
	void contextLoads() {
		student student=studentDao.findStudent(1);
		System.out.println(student);
	}

}
