package ojc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String getHomeView(HttpServletRequest request) { //http���������� request������ �������� ����
		return "index";
	}
	
	@GetMapping("/404.html")
	public String get404View() {
		return "error/404";
	}
	
	@GetMapping("/throw")
	public String testControllerAdvice() {
		throw new RuntimeException("Error Test In Controller.");
	}
	

}
