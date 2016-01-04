package kr.co.sample.bbs;

import java.util.List;

import javax.annotation.Resource;

//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("testController")
public class TestController {

//	Logger log = Logger.getLogger(TestController.class);
	
	private final String PATH = "/front/test/";
	
	@Resource(name="testService")
	private TestService testService;
	
	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	@RequestMapping("/test1234")
	public String getProductList(@ModelAttribute("testDto")TestDto testDto
			, Model model) throws Exception {
//		log.debug("----------------- testController -----------------");
		
		List<TestDto> list = testService.getProductList(testDto);
		model.addAttribute("list", list);
				
		return PATH + "bbs";
	}
	
}
