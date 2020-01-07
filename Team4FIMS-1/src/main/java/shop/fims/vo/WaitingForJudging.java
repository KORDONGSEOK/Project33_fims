package shop.fims.vo;

/**
 * @file shop.fims.vo.WaitingForJudging.java
 * @name WaitingForJudging
 * @brief 심사 대기 관리
 * @author ksmart33 김동석
 */
public class WaitingForJudging {

	private String WatforJudCd ; //심사대기 코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestProCd ; //하나의 축제내 하나의 프로그램 소개코드 
	private String MemCd ; //회원코드 
	private String VolAppCd ; //축제자원봉사 신청서관리 
	private String AreacityAdmNm ; //행정기관명 
	private String AreaNm ; //전국 지역관리 
	private String AreaCityNm ; //모든 지역 시군관리 
	private String FestNm ; //축제명 
	private String ExaTarget ; //심사대상 
	private String ExaNm ; //심사명 
	private String RegDt ; //등록일자 
	private String ExaDt ; //심사완료일자 
	private String ExaManager ; //담당자 
	private String ExaStatus ; //심사현황 
	
	public String getWatforJudCd() {
		return WatforJudCd;
	}
	public void setWatforJudCd(String watforJudCd) {
		WatforJudCd = watforJudCd;
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
	public String getFestProCd() {
		return FestProCd;
	}
	public void setFestProCd(String festProCd) {
		FestProCd = festProCd;
	}
	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		MemCd = memCd;
	}
	public String getVolAppCd() {
		return VolAppCd;
	}
	public void setVolAppCd(String volAppCd) {
		VolAppCd = volAppCd;
	}
	public String getAreacityAdmNm() {
		return AreacityAdmNm;
	}
	public void setAreacityAdmNm(String areacityAdmNm) {
		AreacityAdmNm = areacityAdmNm;
	}
	public String getAreaNm() {
		return AreaNm;
	}
	public void setAreaNm(String areaNm) {
		AreaNm = areaNm;
	}
	public String getAreaCityNm() {
		return AreaCityNm;
	}
	public void setAreaCityNm(String areaCityNm) {
		AreaCityNm = areaCityNm;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getExaTarget() {
		return ExaTarget;
	}
	public void setExaTarget(String exaTarget) {
		ExaTarget = exaTarget;
	}
	public String getExaNm() {
		return ExaNm;
	}
	public void setExaNm(String exaNm) {
		ExaNm = exaNm;
	}
	public String getRegDt() {
		return RegDt;
	}
	public void setRegDt(String regDt) {
		RegDt = regDt;
	}
	public String getExaDt() {
		return ExaDt;
	}
	public void setExaDt(String exaDt) {
		ExaDt = exaDt;
	}
	public String getExaManager() {
		return ExaManager;
	}
	public void setExaManager(String exaManager) {
		ExaManager = exaManager;
	}
	public String getExaStatus() {
		return ExaStatus;
	}
	public void setExaStatus(String exaStatus) {
		ExaStatus = exaStatus;
	}
	
	@Override
	public String toString() {
		return "WaitingForJudging [WatforJudCd=" + WatforJudCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestProCd=" + FestProCd + ", MemCd="
				+ MemCd + ", VolAppCd=" + VolAppCd + ", AreacityAdmNm=" + AreacityAdmNm + ", AreaNm=" + AreaNm
				+ ", AreaCityNm=" + AreaCityNm + ", FestNm=" + FestNm + ", ExaTarget=" + ExaTarget + ", ExaNm=" + ExaNm
				+ ", RegDt=" + RegDt + ", ExaDt=" + ExaDt + ", ExaManager=" + ExaManager + ", ExaStatus=" + ExaStatus
				+ "]";
	}

}
