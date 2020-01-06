package shop.fims.vo;

/**
 * @file shop.fims.vo.AdminDepartEmploy.java
 * @name AdminDepartEmploy
 * @brief 모든 행정기관 부서별 직원관리
 * @author ksmart33 김동석
 */
public class AdminDepartEmploy {

	private String AdmindepEmpCd ; //모든 행정기관 부서별 직원 관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AdminDepCd ; //모든 행정기관 부서코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String AdmindepEmpNm ; //성명 
	private String AdmindepEmpPosition ; //직위 
	private String AdmindepEmpPhone ; //전화번호 
	private String AdmindepEmpTesk ; //업무 
	
	public String getAdmindepEmpCd() {
		return AdmindepEmpCd;
	}
	public void setAdmindepEmpCd(String admindepEmpCd) {
		AdmindepEmpCd = admindepEmpCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAdminDepCd() {
		return AdminDepCd;
	}
	public void setAdminDepCd(String adminDepCd) {
		AdminDepCd = adminDepCd;
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
	public String getAdmindepEmpNm() {
		return AdmindepEmpNm;
	}
	public void setAdmindepEmpNm(String admindepEmpNm) {
		AdmindepEmpNm = admindepEmpNm;
	}
	public String getAdmindepEmpPosition() {
		return AdmindepEmpPosition;
	}
	public void setAdmindepEmpPosition(String admindepEmpPosition) {
		AdmindepEmpPosition = admindepEmpPosition;
	}
	public String getAdmindepEmpPhone() {
		return AdmindepEmpPhone;
	}
	public void setAdmindepEmpPhone(String admindepEmpPhone) {
		AdmindepEmpPhone = admindepEmpPhone;
	}
	public String getAdmindepEmpTesk() {
		return AdmindepEmpTesk;
	}
	public void setAdmindepEmpTesk(String admindepEmpTesk) {
		AdmindepEmpTesk = admindepEmpTesk;
	}
	
	@Override
	public String toString() {
		return "AdminDepartEmploy [AdmindepEmpCd=" + AdmindepEmpCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AdminDepCd=" + AdminDepCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", AdmindepEmpNm=" + AdmindepEmpNm + ", AdmindepEmpPosition=" + AdmindepEmpPosition
				+ ", AdmindepEmpPhone=" + AdmindepEmpPhone + ", AdmindepEmpTesk=" + AdmindepEmpTesk + "]";
	}

}
