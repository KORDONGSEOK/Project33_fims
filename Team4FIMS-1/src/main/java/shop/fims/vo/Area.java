package shop.fims.vo;

/**
 * @file shop.fims.vo.Area.java
 * @name Area
 * @brief 전국 지역관리
 * @author ksmart33 김동석
 */
public class Area {

	private String AreaCd ; //전국지역코드 
	private String AreaNm ; //지역명 
	
	public String getAreaCd() {
		return AreaCd;
	}
	public void setAreaCd(String areaCd) {
		AreaCd = areaCd;
	}
	public String getAreaNm() {
		return AreaNm;
	}
	public void setAreaNm(String areaNm) {
		AreaNm = areaNm;
	}
	
	@Override
	public String toString() {
		return "Area [AreaCd=" + AreaCd + ", AreaNm=" + AreaNm + "]";
	}

	
}
