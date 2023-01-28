package ojc.repository;

import java.util.List;

import ojc.model.Board;

public interface BoardMapper {
	public void enroll(Board board);
	
	public List<Board> getList();
	
	public List<Board> getListPaging();
	
	public Board getPage(int no);
}
