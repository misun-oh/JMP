package jmp.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Rest rest = new Rest();
//		Chef chef = new Chef();		
//		Rest rest2 = new Rest(chef);

		// 세팅파일을 읽어들여 빈을 생성하여 컨텍스트 영역에 담는다.
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("jmp/spring/ex01/mainTestConfig.xml");
				
				
			
		System.out.println(((Rest)context.getBean("rest")));

	}

}
