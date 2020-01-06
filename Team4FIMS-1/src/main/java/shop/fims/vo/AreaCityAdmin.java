package shop.fims.vo;

/**
 * @file shop.fims.vo.AreaCityAdmin.java
 * @name AreaCityAdmin
 * @brief 모든 행정기관관리
 * @author ksmart33 김동석
 */
public class AreaCityAdmin {

	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String AreacityAdminNm ; //행정기관명 
	
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
	public String getAreacityAdminNm() {
		return AreacityAdminNm;
	}
	public void setAreacityAdminNm(String areacityAdminNm) {
		AreacityAdminNm = areacityAdminNm;
	}
	
	@Override
	public String toString() {
		return "AreaCityAdmin [AreacityAdminCd=" + AreacityAdminCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", AreacityAdminNm=" + AreacityAdminNm + "]";
	}

	
	
}
