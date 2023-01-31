package ojc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mypageController {
	
	@GetMapping("/mypage")	
	public String getMypageView(HttpServletRequest request) { //http프로토콜의 request정보를 서블릿에게 전달
		return "mypage";
	}
	

}
