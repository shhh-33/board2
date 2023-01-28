package ojc.model;

import java.util.Date;

public class Board {
	/* 게시판 번호 */
	private int no;
	
	/* 게시판 제목 */
	private String title;
	
	/* 게시판 내용 */
	private String content;
	
	/* 게시판 작가 */
	private String id;
	
	/* 등록 날짜 */
	private Date create_date;
	
	/* 수정 날짜 */
	private Date update_date;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", content=" + content + ", id=" + id + ", create_date="
				+ create_date + ", update_date=" + update_date + "]";
	}
}
