package shop.fims.vo;

/**
 * @file shop.fims.vo.FestGoodsOut.java
 * @name FestGoodsOut
 * @brief 축제별 출고 물품관리
 * @author ksmart33 김동석
 */
public class FestGoodsOut {

	private String FestgoodsOutCd ; //출고홍보상품코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestgoodsInCd ; //입고홍보상품코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FestTitle ; //축제명 
	private String FestgoodsOutNm ; //출고상품 
	private String FestgoodsOutDetail ; //출고목적 
	private String FestgoodsOutAmt ; //출고수량 
	private String FestgoodsStock ; //재고수량 
	private String InsertDt ; //작성일
	
	public String getFestgoodsOutCd() {
		return FestgoodsOutCd;
	}
	public void setFestgoodsOutCd(String festgoodsOutCd) {
		FestgoodsOutCd = festgoodsOutCd;
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
	public String getFestgoodsInCd() {
		return FestgoodsInCd;
	}
	public void setFestgoodsInCd(String festgoodsInCd) {
		FestgoodsInCd = festgoodsInCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
	}
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestgoodsOutNm() {
		return FestgoodsOutNm;
	}
	public void setFestgoodsOutNm(String festgoodsOutNm) {
		FestgoodsOutNm = festgoodsOutNm;
	}
	public String getFestgoodsOutDetail() {
		return FestgoodsOutDetail;
	}
	public void setFestgoodsOutDetail(String festgoodsOutDetail) {
		FestgoodsOutDetail = festgoodsOutDetail;
	}
	public String getFestgoodsOutAmt() {
		return FestgoodsOutAmt;
	}
	public void setFestgoodsOutAmt(String festgoodsOutAmt) {
		FestgoodsOutAmt = festgoodsOutAmt;
	}
	public String getFestgoodsStock() {
		return FestgoodsStock;
	}
	public void setFestgoodsStock(String festgoodsStock) {
		FestgoodsStock = festgoodsStock;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestGoodsOut [FestgoodsOutCd=" + FestgoodsOutCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestgoodsInCd=" + FestgoodsInCd
				+ ", AccMemCd=" + AccMemCd + ", FestTitle=" + FestTitle + ", FestgoodsOutNm=" + FestgoodsOutNm
				+ ", FestgoodsOutDetail=" + FestgoodsOutDetail + ", FestgoodsOutAmt=" + FestgoodsOutAmt
				+ ", FestgoodsStock=" + FestgoodsStock + ", InsertDt=" + InsertDt + "]";
	}

}
