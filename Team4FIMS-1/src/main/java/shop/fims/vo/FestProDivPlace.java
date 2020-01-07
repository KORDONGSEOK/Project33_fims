package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProDivPlace.java
 * @name FestProDivPlace
 * @brief 모든 축제별 프로그램 장소분류
 * @author ksmart33 김동석
 */
public class FestProDivPlace {

	private String FestprodivPlaCd ; //모든축제별프로그램장소분류 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestCd ; //축제코드 
	private String FestTitle ; //축제명 
	private String FestprodivPlaNm ; //모든축제별프로그램장소 
	
	public String getFestprodivPlaCd() {
		return FestprodivPlaCd;
	}
	public void setFestprodivPlaCd(String festprodivPlaCd) {
		FestprodivPlaCd = festprodivPlaCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAreaCityCd() {
		return AreaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		AreaCityCd = areaCityCd;
	}
	public String getAreaCd() {
		return AreaCd;
	}
	public void setAreaCd(String areaCd) {
		AreaCd = areaCd;
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
	public String getFestprodivPlaNm() {
		return FestprodivPlaNm;
	}
	public void setFestprodivPlaNm(String festprodivPlaNm) {
		FestprodivPlaNm = festprodivPlaNm;
	}
	
	@Override
	public String toString() {
		return "FestProDivPlace [FestprodivPlaCd=" + FestprodivPlaCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd + ", FestCd=" + FestCd + ", FestTitle="
				+ FestTitle + ", FestprodivPlaNm=" + FestprodivPlaNm + "]";
	}

}
