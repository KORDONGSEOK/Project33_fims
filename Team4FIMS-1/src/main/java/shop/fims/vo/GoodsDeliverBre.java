package shop.fims.vo;

/**
 * @file shop.fims.vo.GoodsDeliverBre.java
 * @name GoodsDeliverBre
 * @brief 모든축제별 계약물품납품 내역관리
 * @author ksmart33 김동석
 */
public class GoodsDeliverBre {

	private String GoodsdelBreCd ; //모든축제별 계약물품납품내역관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String CatAccCd ; //거래처코드 
	private String CatbusAccCd ; //거래처 업종 분류코드 
	private String ManComCd ; //위원회코드 
	private String DeliverDt ; //계약물품날짜 
	private String DeliverBre ; //계약물품내역 
	
	public String getGoodsdelBreCd() {
		return GoodsdelBreCd;
	}
	public void setGoodsdelBreCd(String goodsdelBreCd) {
		GoodsdelBreCd = goodsdelBreCd;
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
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getCatbusAccCd() {
		return CatbusAccCd;
	}
	public void setCatbusAccCd(String catbusAccCd) {
		CatbusAccCd = catbusAccCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getDeliverDt() {
		return DeliverDt;
	}
	public void setDeliverDt(String deliverDt) {
		DeliverDt = deliverDt;
	}
	public String getDeliverBre() {
		return DeliverBre;
	}
	public void setDeliverBre(String deliverBre) {
		DeliverBre = deliverBre;
	}
	
	@Override
	public String toString() {
		return "GoodsDeliverBre [GoodsdelBreCd=" + GoodsdelBreCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", CatAccCd=" + CatAccCd
				+ ", CatbusAccCd=" + CatbusAccCd + ", ManComCd=" + ManComCd + ", DeliverDt=" + DeliverDt
				+ ", DeliverBre=" + DeliverBre + "]";
	}

}
