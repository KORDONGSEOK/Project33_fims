package shop.fims.vo;

/**
 * @file shop.fims.vo.FestPRDiv.java
 * @name FestPRDiv
 * @brief 홍보 방식분류
 * @author ksmart33 김동석
 */
public class FestPRDiv {

	private String FestprDivCd ; //홍보방식코드 
	private String FestprDivNm ; //홍보방식구분명 
	
	public String getFestprDivCd() {
		return FestprDivCd;
	}
	public void setFestprDivCd(String festprDivCd) {
		FestprDivCd = festprDivCd;
	}
	public String getFestprDivNm() {
		return FestprDivNm;
	}
	public void setFestprDivNm(String festprDivNm) {
		FestprDivNm = festprDivNm;
	}
	@Override
	public String toString() {
		return "FestPRDiv [FestprDivCd=" + FestprDivCd + ", FestprDivNm=" + FestprDivNm + "]";
	}

}
