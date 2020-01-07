package shop.fims.vo;

/**
 * @file shop.fims.vo.FestivalHuman.java
 * @name FestivalHuman
 * @brief 모든 축제별 모든 인적관리
 * @author ksmart33 김동석
 */
public class FestivalHuman {

	private String FesHumanCd ; //모든축제별모든인적관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FesworkDivCd ; //축제진행업무중분류코드 
	private String ManComCd ; //위원회코드 
	private String MemCd ; //회원코드 
	private String FacStaCd ; //모든보유시설코드 
	private String FestNm ; //축제명 
	private String FesworkDivNm ; //진행업무중분류명 
	private String FesHumanNm ; //이름 
	private String FesHumanPhone ; //연락처 
	private String FacStaNm ; //보유시설명 
	private String FesHumanHour ; //근무시간 
	private String ComMemNm2 ; //위원회이름 
	
	public String getFesHumanCd() {
		return FesHumanCd;
	}
	public void setFesHumanCd(String fesHumanCd) {
		FesHumanCd = fesHumanCd;
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
	public String getFesworkDivCd() {
		return FesworkDivCd;
	}
	public void setFesworkDivCd(String fesworkDivCd) {
		FesworkDivCd = fesworkDivCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		MemCd = memCd;
	}
	public String getFacStaCd() {
		return FacStaCd;
	}
	public void setFacStaCd(String facStaCd) {
		FacStaCd = facStaCd;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getFesworkDivNm() {
		return FesworkDivNm;
	}
	public void setFesworkDivNm(String fesworkDivNm) {
		FesworkDivNm = fesworkDivNm;
	}
	public String getFesHumanNm() {
		return FesHumanNm;
	}
	public void setFesHumanNm(String fesHumanNm) {
		FesHumanNm = fesHumanNm;
	}
	public String getFesHumanPhone() {
		return FesHumanPhone;
	}
	public void setFesHumanPhone(String fesHumanPhone) {
		FesHumanPhone = fesHumanPhone;
	}
	public String getFacStaNm() {
		return FacStaNm;
	}
	public void setFacStaNm(String facStaNm) {
		FacStaNm = facStaNm;
	}
	public String getFesHumanHour() {
		return FesHumanHour;
	}
	public void setFesHumanHour(String fesHumanHour) {
		FesHumanHour = fesHumanHour;
	}
	public String getComMemNm2() {
		return ComMemNm2;
	}
	public void setComMemNm2(String comMemNm2) {
		ComMemNm2 = comMemNm2;
	}
	
	@Override
	public String toString() {
		return "FestivalHuman [FesHumanCd=" + FesHumanCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FesworkDivCd=" + FesworkDivCd + ", ManComCd="
				+ ManComCd + ", MemCd=" + MemCd + ", FacStaCd=" + FacStaCd + ", FestNm=" + FestNm + ", FesworkDivNm="
				+ FesworkDivNm + ", FesHumanNm=" + FesHumanNm + ", FesHumanPhone=" + FesHumanPhone + ", FacStaNm="
				+ FacStaNm + ", FesHumanHour=" + FesHumanHour + ", ComMemNm2=" + ComMemNm2 + "]";
	}

}
