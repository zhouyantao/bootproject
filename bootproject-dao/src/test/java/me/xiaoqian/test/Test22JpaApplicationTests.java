package me.xiaoqian.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import me.xiaoqian.bootproject.dao.entity.NewAirportRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test22JpaApplicationTests {
	@Autowired
	NewAirportRepository newAirportRepository;
	
	@Test
	public void exampleTest() {
		
	}
}
