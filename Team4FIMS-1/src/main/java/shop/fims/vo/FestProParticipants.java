package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProParticipants.java
 * @name FestProParticipants
 * @brief 프로그램 참가자관리
 * @author ksmart33 김동석
 */
public class FestProParticipants {

	private String FestproParCd ; //프로그램참가자코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String FestproSproCd ; //하나의축제내하나의프로그램내 상세관리코드 
	private String FestProCd ; //하나의 축제내 여러개 프로그램 소개코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FestCd ; //축제코드 
	private String ManComCd ; //위원회코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestproParNm ; //이름 
	private String FestproParGender ; //성별 
	private String FestproParAge ; //나이 
	private String FestproParPhone ; //연락처 
	private String FestproParEtc ; //특이사항 
	private String InsertDt ; //작성일 
	
	public String getFestproParCd() {
		return FestproParCd;
	}
	public void setFestproParCd(String festproParCd) {
		FestproParCd = festproParCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getFestproSproCd() {
		return FestproSproCd;
	}
	public void setFestproSproCd(String festproSproCd) {
		FestproSproCd = festproSproCd;
	}
	public String getFestProCd() {
		return FestProCd;
	}
	public void setFestProCd(String festProCd) {
		FestProCd = festProCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
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
	public String getFestproParNm() {
		return FestproParNm;
	}
	public void setFestproParNm(String festproParNm) {
		FestproParNm = festproParNm;
	}
	public String getFestproParGender() {
		return FestproParGender;
	}
	public void setFestproParGender(String festproParGender) {
		FestproParGender = festproParGender;
	}
	public String getFestproParAge() {
		return FestproParAge;
	}
	public void setFestproParAge(String festproParAge) {
		FestproParAge = festproParAge;
	}
	public String getFestproParPhone() {
		return FestproParPhone;
	}
	public void setFestproParPhone(String festproParPhone) {
		FestproParPhone = festproParPhone;
	}
	public String getFestproParEtc() {
		return FestproParEtc;
	}
	public void setFestproParEtc(String festproParEtc) {
		FestproParEtc = festproParEtc;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestProParticipants [FestproParCd=" + FestproParCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", FestproSproCd=" + FestproSproCd + ", FestProCd=" + FestProCd + ", AccMemCd=" + AccMemCd
				+ ", FestCd=" + FestCd + ", ManComCd=" + ManComCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", FestproParNm=" + FestproParNm + ", FestproParGender=" + FestproParGender + ", FestproParAge="
				+ FestproParAge + ", FestproParPhone=" + FestproParPhone + ", FestproParEtc=" + FestproParEtc
				+ ", InsertDt=" + InsertDt + "]";
	}

}
