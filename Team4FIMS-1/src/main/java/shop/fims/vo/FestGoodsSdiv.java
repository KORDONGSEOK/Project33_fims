package shop.fims.vo;

/**
 * @file shop.fims.vo.FestGoodsSdiv.java
 * @name FestGoodsSdiv
 * @brief 모든 물품 상품 비품 대분류 - 중분류 - 소분류
 * @author ksmart33 김동석
 */
public class FestGoodsSdiv {

	private String FestgoodsSdivCd ; //모든 물품 상품 비품 대분류 중분류 소분류 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestgoodsLdivCd ; //모든물품 상품 비품 대분류코드 
	private String FestCd ; //축제코드 
	private String FestTitle ; //축제명 
	private String FestgoodsSdivNm ; //모든 물품 상품 비품 대분류 중분류 소분류명 
	
	public String getFestgoodsSdivCd() {
		return FestgoodsSdivCd;
	}
	public void setFestgoodsSdivCd(String festgoodsSdivCd) {
		FestgoodsSdivCd = festgoodsSdivCd;
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
	public String getFestgoodsLdivCd() {
		return FestgoodsLdivCd;
	}
	public void setFestgoodsLdivCd(String festgoodsLdivCd) {
		FestgoodsLdivCd = festgoodsLdivCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestgoodsSdivNm() {
		return FestgoodsSdivNm;
	}
	public void setFestgoodsSdivNm(String festgoodsSdivNm) {
		FestgoodsSdivNm = festgoodsSdivNm;
	}
	
	@Override
	public String toString() {
		return "FestGoodsSdiv [FestgoodsSdivCd=" + FestgoodsSdivCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCd=" + AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestgoodsLdivCd=" + FestgoodsLdivCd
				+ ", FestCd=" + FestCd + ", FestTitle=" + FestTitle + ", FestgoodsSdivNm=" + FestgoodsSdivNm + "]";
	}

}
