package shop.fims.vo;

/**
 * @file shop.fims.vo.AdminDepart.java
 * @name AdminDepart
 * @brief 모든 행정기관 부서관리
 * @author ksmart33 김동석
 */
public class AdminDepart {

	private String AdminDepCd ; //모든 행정기관 부서코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AdminDepBelong ; //실국명 
	private String AdminDepNm ; //부서명 
	
	public String getAdminDepCd() {
		return AdminDepCd;
	}
	public void setAdminDepCd(String adminDepCd) {
		AdminDepCd = adminDepCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAdminDepBelong() {
		return AdminDepBelong;
	}
	public void setAdminDepBelong(String adminDepBelong) {
		AdminDepBelong = adminDepBelong;
	}
	public String getAdminDepNm() {
		return AdminDepNm;
	}
	public void setAdminDepNm(String adminDepNm) {
		AdminDepNm = adminDepNm;
	}
	
	@Override
	public String toString() {
		return "AdminDepart [AdminDepCd=" + AdminDepCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AdminDepBelong="
				+ AdminDepBelong + ", AdminDepNm=" + AdminDepNm + "]";
	}

}
