package jmp.spring.ex02;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jmp.spring.ex02.VO.SampleVO;
import jmp.spring.ex02.VO.SampleVOList;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SampleController {

	@GetMapping("/sample/test")
	public String sampleTest(SampleVOList list, SampleVO vo, Model model, RedirectAttributes rttr) {
		log.info("===================/sample/test");
		log.info(vo);
		log.info(list.getList());
		model.addAttribute("serverTime", new java.util.Date());
		rttr.addFlashAttribute("okFlg","등록성공");
		return "redirect:/";
	}
	
	@GetMapping("/sample/voTest")
	public @ResponseBody SampleVO voTest() {
		SampleVO vo = new SampleVO();
		vo.setName("김길동");
		vo.setAge(1);
		return vo;
	}
	
	@GetMapping("/fileUpload")
	public void fileUpload() {
		
	}
	
	@PostMapping("/fileUploadExe")
	public String fileUploadExe(ArrayList<MultipartFile> files) {
		files.forEach(file->{
			if(file.isEmpty())
				log.info("파일이 없습니다.");
			else {
				log.info(file.getOriginalFilename());
				log.info(file.getSize());
			}
		});
		return "fileUpload";
	}
	
}
