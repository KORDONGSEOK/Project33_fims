package shop.fims.vo;

/**
 * @file shop.fims.vo.GoodsPesentCondition.java
 * @name GoodsPesentCondition
 * @brief 모든 보유물품현황
 * @author ksmart33 김동석
 */
public class GoodsPesentCondition {

	private String GoodspreConCd ; //모든보유물품현황코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String AdminDepCd ; //모든 행정기관 부서코드 
	private String AdmindepEmpNm ; //담당자 
	private String AdmAgeNm ; //모든지역 
	private String AreaCityNm ; //모든 지역 시군이름 
	private String AreacityAdminNm ; //모든 행정기관이름 
	private String FestNm ; //축제명 
	private String AdmimDepNm ; //부서명 
	private String GoodsNm ; //보유물품 
	private String GoodsCount ; //수량 
	private String SpecialNote ; //특이사항 
	
	public String getGoodspreConCd() {
		return GoodspreConCd;
	}
	public void setGoodspreConCd(String goodspreConCd) {
		GoodspreConCd = goodspreConCd;
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
	public String getAdminDepCd() {
		return AdminDepCd;
	}
	public void setAdminDepCd(String adminDepCd) {
		AdminDepCd = adminDepCd;
	}
	public String getAdmindepEmpNm() {
		return AdmindepEmpNm;
	}
	public void setAdmindepEmpNm(String admindepEmpNm) {
		AdmindepEmpNm = admindepEmpNm;
	}
	public String getAdmAgeNm() {
		return AdmAgeNm;
	}
	public void setAdmAgeNm(String admAgeNm) {
		AdmAgeNm = admAgeNm;
	}
	public String getAreaCityNm() {
		return AreaCityNm;
	}
	public void setAreaCityNm(String areaCityNm) {
		AreaCityNm = areaCityNm;
	}
	public String getAreacityAdminNm() {
		return AreacityAdminNm;
	}
	public void setAreacityAdminNm(String areacityAdminNm) {
		AreacityAdminNm = areacityAdminNm;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getAdmimDepNm() {
		return AdmimDepNm;
	}
	public void setAdmimDepNm(String admimDepNm) {
		AdmimDepNm = admimDepNm;
	}
	public String getGoodsNm() {
		return GoodsNm;
	}
	public void setGoodsNm(String goodsNm) {
		GoodsNm = goodsNm;
	}
	public String getGoodsCount() {
		return GoodsCount;
	}
	public void setGoodsCount(String goodsCount) {
		GoodsCount = goodsCount;
	}
	public String getSpecialNote() {
		return SpecialNote;
	}
	public void setSpecialNote(String specialNote) {
		SpecialNote = specialNote;
	}
	
	@Override
	public String toString() {
		return "GoodsPesentCondition [GoodspreConCd=" + GoodspreConCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCd=" + AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", AdminDepCd="
				+ AdminDepCd + ", AdmindepEmpNm=" + AdmindepEmpNm + ", AdmAgeNm=" + AdmAgeNm + ", AreaCityNm="
				+ AreaCityNm + ", AreacityAdminNm=" + AreacityAdminNm + ", FestNm=" + FestNm + ", AdmimDepNm="
				+ AdmimDepNm + ", GoodsNm=" + GoodsNm + ", GoodsCount=" + GoodsCount + ", SpecialNote=" + SpecialNote
				+ "]";
	}

}
