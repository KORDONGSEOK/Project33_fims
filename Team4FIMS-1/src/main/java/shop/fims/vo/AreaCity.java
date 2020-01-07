package shop.fims.vo;

/**
 * @file shop.fims.vo.AreaCity.java
 * @name AreaCity
 * @brief 모든 지역 시군관리
 * @author ksmart33 김동석
 */
public class AreaCity {

	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityNm ; //시군명 
	
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
	public String getAreaCityNm() {
		return AreaCityNm;
	}
	public void setAreaCityNm(String areaCityNm) {
		AreaCityNm = areaCityNm;
	}
	
	@Override
	public String toString() {
		return "AreaCity [AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd + ", AreaCityNm=" + AreaCityNm + "]";
	}
	
	

	
}
