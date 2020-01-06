package shop.fims.vo;

/**
 * @file shop.fims.vo.FestivalWorkDivision.java
 * @name FestivalWorkDivision
 * @brief 축제 진행업무 중분류
 * @author ksmart33 김동석
 */
public class FestivalWorkDivision {

	private String FesworkDivCd ; //축제진행업무중분류코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FesworkCatCd ; //축제진행업무대분류코드 
	private String ManComCd ; //위원회코드 
	private String FestNm ; //축제명 
	private String FesworkCatNm ; //진행업무대분류명 
	private String FesworkDivNm ; //진행업무중분류 
	private String ComMemNm2 ; //위원회이름 
	
	public String getFesworkDivCd() {
		return FesworkDivCd;
	}
	public void setFesworkDivCd(String fesworkDivCd) {
		FesworkDivCd = fesworkDivCd;
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
	public String getFesworkCatCd() {
		return FesworkCatCd;
	}
	public void setFesworkCatCd(String fesworkCatCd) {
		FesworkCatCd = fesworkCatCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
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
	public String getFesworkDivNm() {
		return FesworkDivNm;
	}
	public void setFesworkDivNm(String fesworkDivNm) {
		FesworkDivNm = fesworkDivNm;
	}
	public String getComMemNm2() {
		return ComMemNm2;
	}
	public void setComMemNm2(String comMemNm2) {
		ComMemNm2 = comMemNm2;
	}
	
	@Override
	public String toString() {
		return "FestivalWorkDivision [FesworkDivCd=" + FesworkDivCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCd=" + AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FesworkCatCd="
				+ FesworkCatCd + ", ManComCd=" + ManComCd + ", FestNm=" + FestNm + ", FesworkCatNm=" + FesworkCatNm
				+ ", FesworkDivNm=" + FesworkDivNm + ", ComMemNm2=" + ComMemNm2 + "]";
	}

}
