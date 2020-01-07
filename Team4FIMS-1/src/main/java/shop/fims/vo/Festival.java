package shop.fims.vo;

/**
 * @file shop.fims.vo.Festival.java
 * @name Festival
 * @brief 모든 축제관리
 * @author ksmart33 김동석
 */
public class Festival {

	private String FestCd ; //축제코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestNm ; //축제명 
	private String FestHostArea ; //축제개최지역 
	private String FestHostPlace ; //축제개최장소 
	private String FestStartDt ; //축제시작일자 
	private String FestEndDt ; //축제종료일자 
	private String FestContent ; //축제내용 
	private String FestSuperAgency ; //축제주관기관 
	private String FestSpoAgency ; //축제후원기관 
	private String FestAddr ; //축제 개최 주소 
	private String FestInquiry ; //축제전화문의 
	
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
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
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getFestHostArea() {
		return FestHostArea;
	}
	public void setFestHostArea(String festHostArea) {
		FestHostArea = festHostArea;
	}
	public String getFestHostPlace() {
		return FestHostPlace;
	}
	public void setFestHostPlace(String festHostPlace) {
		FestHostPlace = festHostPlace;
	}
	public String getFestStartDt() {
		return FestStartDt;
	}
	public void setFestStartDt(String festStartDt) {
		FestStartDt = festStartDt;
	}
	public String getFestEndDt() {
		return FestEndDt;
	}
	public void setFestEndDt(String festEndDt) {
		FestEndDt = festEndDt;
	}
	public String getFestContent() {
		return FestContent;
	}
	public void setFestContent(String festContent) {
		FestContent = festContent;
	}
	public String getFestSuperAgency() {
		return FestSuperAgency;
	}
	public void setFestSuperAgency(String festSuperAgency) {
		FestSuperAgency = festSuperAgency;
	}
	public String getFestSpoAgency() {
		return FestSpoAgency;
	}
	public void setFestSpoAgency(String festSpoAgency) {
		FestSpoAgency = festSpoAgency;
	}
	public String getFestAddr() {
		return FestAddr;
	}
	public void setFestAddr(String festAddr) {
		FestAddr = festAddr;
	}
	public String getFestInquiry() {
		return FestInquiry;
	}
	public void setFestInquiry(String festInquiry) {
		FestInquiry = festInquiry;
	}
	
	@Override
	public String toString() {
		return "Festival [FestCd=" + FestCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCityCd=" + AreaCityCd
				+ ", AreaCd=" + AreaCd + ", FestNm=" + FestNm + ", FestHostArea=" + FestHostArea + ", FestHostPlace="
				+ FestHostPlace + ", FestStartDt=" + FestStartDt + ", FestEndDt=" + FestEndDt + ", FestContent="
				+ FestContent + ", FestSuperAgency=" + FestSuperAgency + ", FestSpoAgency=" + FestSpoAgency
				+ ", FestAddr=" + FestAddr + ", FestInquiry=" + FestInquiry + "]";
	}

}
