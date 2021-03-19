package jmp.spring.ex01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Log4j
@Component
@Data
public class Rest {

	Chef chef;

//	// Chef 객체를 직접 생성한다.
//	public Rest() {
//		this.chef = new Chef("중식");
//		log.info("기본생성자"+chef.toString());	
//	}
//	
	// Chef 객체를 생성자를 이용해 받아온다
	public Rest(Chef chef) {
		this.chef = chef;
		log.info("생성자를 통한 주입"+chef.toString());	
	}
	
	
}

