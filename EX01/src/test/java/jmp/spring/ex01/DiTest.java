package jmp.spring.ex01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DiTest {
	@Autowired
	Chef chef;
	@Autowired
	Rest rest;
	
	@Test
	public void diTest() {
		chef.setType("중식");
		rest.setChef(chef);
		log.info(rest);
		
	}
}
