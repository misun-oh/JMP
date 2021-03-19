package jmp.spring.ex02.VO;

import java.util.ArrayList;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Data
@Log4j
public class SampleVOList {
	private ArrayList<SampleVO> list;

	public SampleVOList() {
		list = new ArrayList<>();
		log.info("list : "+list);
	}
}
