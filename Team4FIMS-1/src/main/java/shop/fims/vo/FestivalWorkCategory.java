package shop.fims.vo;

/**
 * @file shop.fims.vo.FestivalWorkCategory.java
 * @name FestivalWorkCategory
 * @brief 축제 진행업무 대분류
 * @author ksmart33 김동석
 */
public class FestivalWorkCategory {

	private String FesworkCatCd ; //축제진행업무대분류코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestNm ; //축제명 
	private String FesworkCatNm ; //진행업무대분류명 
	
	public String getFesworkCatCd() {
		return FesworkCatCd;
	}
	public void setFesworkCatCd(String fesworkCatCd) {
		FesworkCatCd = fesworkCatCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return AreaCd;
	}
	public void setAreaCd(String areaCd) {
		AreaCd = areaCd;
	}
	public String getAreaCityCd() {
		return AreaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		AreaCityCd = areaCityCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getFesworkCatNm() {
		return FesworkCatNm;
	}
	public void setFesworkCatNm(String fesworkCatNm) {
		FesworkCatNm = fesworkCatNm;
	}
	
	@Override
	public String toString() {
		return "FestivalWorkCategory [FesworkCatCd=" + FesworkCatCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCd=" + AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestNm=" + FestNm
				+ ", FesworkCatNm=" + FesworkCatNm + "]";
	}

}
