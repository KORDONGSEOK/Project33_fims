package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProDivTheme.java
 * @name FestProDivTheme
 * @brief 모든 축제별 프로그램 성격분류
 * @author ksmart33 김동석
 */
public class FestProDivTheme {

	private String FestprodivThemeCd ; //모든 축제별 프로그램 성격분류 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestTitle ; //축제명 
	private String FestprodivThemeNm ; //모든축제별프로그램성격분류 
	
	public String getFestprodivThemeCd() {
		return FestprodivThemeCd;
	}
	public void setFestprodivThemeCd(String festprodivThemeCd) {
		FestprodivThemeCd = festprodivThemeCd;
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
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestprodivThemeNm() {
		return FestprodivThemeNm;
	}
	public void setFestprodivThemeNm(String festprodivThemeNm) {
		FestprodivThemeNm = festprodivThemeNm;
	}
	
	@Override
	public String toString() {
		return "FestProDivTheme [FestprodivThemeCd=" + FestprodivThemeCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCd=" + AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestTitle="
				+ FestTitle + ", FestprodivThemeNm=" + FestprodivThemeNm + "]";
	}

	
}
