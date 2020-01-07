package shop.fims.vo;

/**
 * @file shop.fims.vo.VolApp.java
 * @name VolApp
 * @brief 축제자원봉사 신청서
 * @author ksmart33 김동석
 */
public class VolApp {

	private String VolAppCd ; //축제자원봉사 신청서관리 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FesAnnCd ; //모든축제공고코드 
	private String ManComCd ; //위원회코드 
	private String VolAppCat ; //지원분야 
	private String VolAppNm ; //신청자이름 
	private String VolAppPhone ; //연락처 
	private String VolAppDt1 ; //생년월일 
	private String VolAppGender ; //성별 
	private String VolAppTshirt ; //티셔츠사이즈 
	private String VolAppPortalid ; //자원봉사포털ID 
	private String VolAppSpec ; //특기사항 
	private String VolAppReason ; //지원동기 
	private String VolAppEmail ; //이메일주소 
	private String VolAppDt2 ; //신청일 
	private String VolAppSel ; //합격여부 
	private String VolAppDt3 ; //합격일자 
	public String getVolAppCd() {
		return VolAppCd;
	}
	public void setVolAppCd(String volAppCd) {
		VolAppCd = volAppCd;
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
	public String getFesAnnCd() {
		return FesAnnCd;
	}
	public void setFesAnnCd(String fesAnnCd) {
		FesAnnCd = fesAnnCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getVolAppCat() {
		return VolAppCat;
	}
	public void setVolAppCat(String volAppCat) {
		VolAppCat = volAppCat;
	}
	public String getVolAppNm() {
		return VolAppNm;
	}
	public void setVolAppNm(String volAppNm) {
		VolAppNm = volAppNm;
	}
	public String getVolAppPhone() {
		return VolAppPhone;
	}
	public void setVolAppPhone(String volAppPhone) {
		VolAppPhone = volAppPhone;
	}
	public String getVolAppDt1() {
		return VolAppDt1;
	}
	public void setVolAppDt1(String volAppDt1) {
		VolAppDt1 = volAppDt1;
	}
	public String getVolAppGender() {
		return VolAppGender;
	}
	public void setVolAppGender(String volAppGender) {
		VolAppGender = volAppGender;
	}
	public String getVolAppTshirt() {
		return VolAppTshirt;
	}
	public void setVolAppTshirt(String volAppTshirt) {
		VolAppTshirt = volAppTshirt;
	}
	public String getVolAppPortalid() {
		return VolAppPortalid;
	}
	public void setVolAppPortalid(String volAppPortalid) {
		VolAppPortalid = volAppPortalid;
	}
	public String getVolAppSpec() {
		return VolAppSpec;
	}
	public void setVolAppSpec(String volAppSpec) {
		VolAppSpec = volAppSpec;
	}
	public String getVolAppReason() {
		return VolAppReason;
	}
	public void setVolAppReason(String volAppReason) {
		VolAppReason = volAppReason;
	}
	public String getVolAppEmail() {
		return VolAppEmail;
	}
	public void setVolAppEmail(String volAppEmail) {
		VolAppEmail = volAppEmail;
	}
	public String getVolAppDt2() {
		return VolAppDt2;
	}
	public void setVolAppDt2(String volAppDt2) {
		VolAppDt2 = volAppDt2;
	}
	public String getVolAppSel() {
		return VolAppSel;
	}
	public void setVolAppSel(String volAppSel) {
		VolAppSel = volAppSel;
	}
	public String getVolAppDt3() {
		return VolAppDt3;
	}
	public void setVolAppDt3(String volAppDt3) {
		VolAppDt3 = volAppDt3;
	}
	
	@Override
	public String toString() {
		return "VolApp [VolAppCd=" + VolAppCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FesAnnCd=" + FesAnnCd + ", ManComCd="
				+ ManComCd + ", VolAppCat=" + VolAppCat + ", VolAppNm=" + VolAppNm + ", VolAppPhone=" + VolAppPhone
				+ ", VolAppDt1=" + VolAppDt1 + ", VolAppGender=" + VolAppGender + ", VolAppTshirt=" + VolAppTshirt
				+ ", VolAppPortalid=" + VolAppPortalid + ", VolAppSpec=" + VolAppSpec + ", VolAppReason=" + VolAppReason
				+ ", VolAppEmail=" + VolAppEmail + ", VolAppDt2=" + VolAppDt2 + ", VolAppSel=" + VolAppSel
				+ ", VolAppDt3=" + VolAppDt3 + "]";
	}

}
