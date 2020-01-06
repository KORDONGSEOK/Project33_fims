package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProDivDay.java
 * @name FestProDivDay
 * @brief 축제 프로그램 일차분류
 * @author ksmart33 김동석
 */
public class FestProDivDay {

	private String FestprodivDayCd ; //축제프로그램일차분류코드 
	private String FestprodivDayNm ; //프로그램일차분류 
	
	public String getFestprodivDayCd() {
		return FestprodivDayCd;
	}
	public void setFestprodivDayCd(String festprodivDayCd) {
		FestprodivDayCd = festprodivDayCd;
	}
	public String getFestprodivDayNm() {
		return FestprodivDayNm;
	}
	public void setFestprodivDayNm(String festprodivDayNm) {
		FestprodivDayNm = festprodivDayNm;
	}
	
	@Override
	public String toString() {
		return "FestProDivDay [FestprodivDayCd=" + FestprodivDayCd + ", FestprodivDayNm=" + FestprodivDayNm + "]";
	}

}
