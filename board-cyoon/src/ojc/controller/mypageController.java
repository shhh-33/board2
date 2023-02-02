package ojc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mypageController {
	
	@GetMapping("/mypage")	
	public String getMypageView(HttpServletRequest request) { 
		return "mypage";
	}
	

}
