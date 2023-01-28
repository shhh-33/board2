package ojc.service;

import java.util.List;

import ojc.model.Board;

public interface BoardService {

	/* 게시판 등록 */
	public void enroll(Board board);
	
	/* 게시판 목록 */
	public List<Board> getList();		
	
	/* 게시판 조회 */
	public Board getPage(int bno);
	
//	/* 게시판 수정 */
//	public int modify(Board board);	
//	
//	/* 게시판 삭제 */
//	public int delete(int bno);	

	
}