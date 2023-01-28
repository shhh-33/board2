package ojc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ojc.model.Board;
import ojc.repository.BoardMapper;

@Repository 
public class BoardServiceImpl implements BoardService{
	
	@Autowired(required=true)
	private BoardMapper mapper;
	
	@Override
	public void enroll(Board board) {
		mapper.enroll(board);
	}

	/* 寃뚯떆�뙋 紐⑸줉 */
	@Override
	public List<Board> getList() {
		
		return mapper.getList();
	}
		

	/* 寃뚯떆�뙋 議고쉶 */
	@Override
	public Board getPage(int no) {
		return mapper.getPage(no);
	}	

}
