package shop.fims.vo;

/**
 * @file shop.fims.vo.Board.java
 * @name Board
 * @brief 게시판관리
 * @author ksmart33 김동석
 */
public class Board {

	private String BoardCd ; //게시판코드 
	private String BoardTitle ; //제목 
	private String BoardContent ; //내용 
	private String BoardWriter ; //작성자 
	private String BoardDt ; //작성일 
	
	public String getBoardCd() {
		return BoardCd;
	}
	public void setBoardCd(String boardCd) {
		BoardCd = boardCd;
	}
	public String getBoardTitle() {
		return BoardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		BoardTitle = boardTitle;
	}
	public String getBoardContent() {
		return BoardContent;
	}
	public void setBoardContent(String boardContent) {
		BoardContent = boardContent;
	}
	public String getBoardWriter() {
		return BoardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		BoardWriter = boardWriter;
	}
	public String getBoardDt() {
		return BoardDt;
	}
	public void setBoardDt(String boardDt) {
		BoardDt = boardDt;
	}
	
	@Override
	public String toString() {
		return "Board [BoardCd=" + BoardCd + ", BoardTitle=" + BoardTitle + ", BoardContent=" + BoardContent
				+ ", BoardWriter=" + BoardWriter + ", BoardDt=" + BoardDt + "]";
	}

	
	
}
