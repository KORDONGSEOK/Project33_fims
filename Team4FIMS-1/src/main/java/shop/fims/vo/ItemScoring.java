package shop.fims.vo;

/**
 * @file shop.fims.vo.ItemScoring.java
 * @name ItemScoring
 * @brief 축제의 각 항목배점
 * @author ksmart33 김동석
 */
public class ItemScoring {

	private String ItemScoCd ; //축제의 각항목배점 
	private String EvaIndexCd ; //심사 평가지표명코드 
	private String EvaindexItemCd ; //항목코드 
	private String EvaindexScoCd ; //객관식문항점수표 코드 
	private String FestCd ; //축제코드 
	private String Score ; //배점 
	
	public String getItemScoCd() {
		return ItemScoCd;
	}
	public void setItemScoCd(String itemScoCd) {
		ItemScoCd = itemScoCd;
	}
	public String getEvaIndexCd() {
		return EvaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		EvaIndexCd = evaIndexCd;
	}
	public String getEvaindexItemCd() {
		return EvaindexItemCd;
	}
	public void setEvaindexItemCd(String evaindexItemCd) {
		EvaindexItemCd = evaindexItemCd;
	}
	public String getEvaindexScoCd() {
		return EvaindexScoCd;
	}
	public void setEvaindexScoCd(String evaindexScoCd) {
		EvaindexScoCd = evaindexScoCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
	}
	
	@Override
	public String toString() {
		return "ItemScoring [ItemScoCd=" + ItemScoCd + ", EvaIndexCd=" + EvaIndexCd + ", EvaindexItemCd="
				+ EvaindexItemCd + ", EvaindexScoCd=" + EvaindexScoCd + ", FestCd=" + FestCd + ", Score=" + Score + "]";
	}

}
