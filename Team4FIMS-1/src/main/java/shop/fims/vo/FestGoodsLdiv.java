package shop.fims.vo;

/**
 * @file shop.fims.vo.FestGoodsLdiv.java
 * @name FestGoodsLdiv
 * @brief 모든 물품 상품 비품 대분류
 * @author ksmart33 김동석
 */
public class FestGoodsLdiv {

	private String FestgoodsLdivCd ; //모든물품 상품 비품 대분류코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String FestCd ; //축제코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestTitle ; //축제명 
	private String FestgoodsLdivNm ; //모든물품 상품 비품 대분류 
	
	public String getFestgoodsLdivCd() {
		return FestgoodsLdivCd;
	}
	public void setFestgoodsLdivCd(String festgoodsLdivCd) {
		FestgoodsLdivCd = festgoodsLdivCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
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
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestgoodsLdivNm() {
		return FestgoodsLdivNm;
	}
	public void setFestgoodsLdivNm(String festgoodsLdivNm) {
		FestgoodsLdivNm = festgoodsLdivNm;
	}
	
	@Override
	public String toString() {
		return "FestGoodsLdiv [FestgoodsLdivCd=" + FestgoodsLdivCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", FestCd=" + FestCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd + ", FestTitle="
				+ FestTitle + ", FestgoodsLdivNm=" + FestgoodsLdivNm + "]";
	}

}
