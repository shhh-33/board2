package ojc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ojc.dto.LoginDto;
import ojc.model.User;
import ojc.service.LoginService;


/**
 * 로그인 처리용 컨트롤러
 *
 */
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String getLoginView() {
		return "login";
	}

	/**
	 * 로그인 처리
	 * @param login
	 * @param model
	 * @param session
	 * @return
	 */
	@PostMapping("/login")
	public String postLogin(LoginDto login, Model model, HttpSession session) {
		loginService.authenticate(login);
		if (login.getError() != null) {
			model.addAttribute("error", login.getError());
			model.addAttribute("login", login);
			return "login";
		} else {
			User user = new User(login.getEmail(), login.getPassword());
			session.setAttribute("user", user);
			return "redirect:/";
		}
	}

	@GetMapping("/logout")
	public String getLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
