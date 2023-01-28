	package ojc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ojc.model.Board;
import ojc.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {

	 private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	 @Autowired
	 private BoardService bservice;
		
	
	@GetMapping("/list")
	public void boardListGET(Model model) {
		log.info("boardListGET");
	}
	
	@GetMapping("/enroll")
	public void boardEnrollGET() {		
		log.info("게시판 등록 페이지 진입");
	}
		
		/* 게시판 등록 */
	@PostMapping("/enroll")
	public String boardEnrollPOST(Board board, RedirectAttributes rttr) {
		log.info("BoardVO : " + board);
		//bservice.enroll(board);
		log.info("BoardVO : " + board);
		rttr.addFlashAttribute("result", "enroll success");
		return "redirect:/board/list";
			
	}
		
	/* 게시판 조회 */
	@GetMapping("/get")
	public void boardGetPageGET(int no, Model model) {
		model.addAttribute("pageInfo", bservice.getPage(no));			
	}

	@PostMapping("/get")
	public String boardGetPagePOST(Board board) {
		log.info("BoardVO : " + board);
		//bservice.enroll(board);
		log.info("BoardVO : " + board);
		return "redirect:/board/list";
			
	}	
	
}
