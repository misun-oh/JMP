package jmp.spring.ex02.VO;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SampleVO {
	private String name;
	private int age;
	private ArrayList<String> ids;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dueDate;
}
