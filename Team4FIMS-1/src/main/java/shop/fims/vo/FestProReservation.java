package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProReservation.java
 * @name FestProReservation
 * @brief 모든 축제 프로그램 예약관리
 * @author ksmart33 김동석
 */
public class FestProReservation {

	private String FestproResCd ; //모든축제 예약관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestProCd ; //하나의 축제내 여러개 프로그램 소개코드 
	private String FestprodivPlaCd ; //모든축제별프로그램장소분류 
	private String FestprodivThemeCd ; //모든 축제별 프로그램 성격분류 
	private String FestNm ; //축제명 
	private String FestProNm ; //프로그램명 
	private String FestproResFee ; //예약요금 
	private String FestproResNm ; //예약자 
	private String FestproResPer ; //예약인원 
	private String FestproResDt ; //예약일자 
	private String FestproResPhone ; //예약자 연락처 
	private String FestproResCon ; //예약현황 
	private String FestproResManNm ; //위원회 담당자 
	private String FestproResManDt ; //위원회 작성일 
	
	public String getFestproResCd() {
		return FestproResCd;
	}
	public void setFestproResCd(String festproResCd) {
		FestproResCd = festproResCd;
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
	public String getFestProCd() {
		return FestProCd;
	}
	public void setFestProCd(String festProCd) {
		FestProCd = festProCd;
	}
	public String getFestprodivPlaCd() {
		return FestprodivPlaCd;
	}
	public void setFestprodivPlaCd(String festprodivPlaCd) {
		FestprodivPlaCd = festprodivPlaCd;
	}
	public String getFestprodivThemeCd() {
		return FestprodivThemeCd;
	}
	public void setFestprodivThemeCd(String festprodivThemeCd) {
		FestprodivThemeCd = festprodivThemeCd;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getFestProNm() {
		return FestProNm;
	}
	public void setFestProNm(String festProNm) {
		FestProNm = festProNm;
	}
	public String getFestproResFee() {
		return FestproResFee;
	}
	public void setFestproResFee(String festproResFee) {
		FestproResFee = festproResFee;
	}
	public String getFestproResNm() {
		return FestproResNm;
	}
	public void setFestproResNm(String festproResNm) {
		FestproResNm = festproResNm;
	}
	public String getFestproResPer() {
		return FestproResPer;
	}
	public void setFestproResPer(String festproResPer) {
		FestproResPer = festproResPer;
	}
	public String getFestproResDt() {
		return FestproResDt;
	}
	public void setFestproResDt(String festproResDt) {
		FestproResDt = festproResDt;
	}
	public String getFestproResPhone() {
		return FestproResPhone;
	}
	public void setFestproResPhone(String festproResPhone) {
		FestproResPhone = festproResPhone;
	}
	public String getFestproResCon() {
		return FestproResCon;
	}
	public void setFestproResCon(String festproResCon) {
		FestproResCon = festproResCon;
	}
	public String getFestproResManNm() {
		return FestproResManNm;
	}
	public void setFestproResManNm(String festproResManNm) {
		FestproResManNm = festproResManNm;
	}
	public String getFestproResManDt() {
		return FestproResManDt;
	}
	public void setFestproResManDt(String festproResManDt) {
		FestproResManDt = festproResManDt;
	}
	
	@Override
	public String toString() {
		return "FestProReservation [FestproResCd=" + FestproResCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd + ", FestProCd=" + FestProCd
				+ ", FestprodivPlaCd=" + FestprodivPlaCd + ", FestprodivThemeCd=" + FestprodivThemeCd + ", FestNm="
				+ FestNm + ", FestProNm=" + FestProNm + ", FestproResFee=" + FestproResFee + ", FestproResNm="
				+ FestproResNm + ", FestproResPer=" + FestproResPer + ", FestproResDt=" + FestproResDt
				+ ", FestproResPhone=" + FestproResPhone + ", FestproResCon=" + FestproResCon + ", FestproResManNm="
				+ FestproResManNm + ", FestproResManDt=" + FestproResManDt + "]";
	}

}
