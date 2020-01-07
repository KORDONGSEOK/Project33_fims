package shop.fims.vo;

/**
 * @file shop.fims.vo.FestGoodsIn.java
 * @name FestGoodsIn
 * @brief 축제별 입고 물품관리
 * @author ksmart33 김동석
 */
public class FestGoodsIn {

	private String FestgoodsInCd ; //입고홍보상품코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestgoodsLdivCd ; //모든물품 상품 비품 대분류코드 
	private String FestgoodsSdivCd ; //모든 물품 상품 비품 소분류코드 
	private String ManComCd ; //위원회코드 
	private String CatAccCd ; //거래처코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FesrevBudCd ; //모든축제세입세출예산관리코드 
	private String FestTitle ; //축제명 
	private String FestgoodsInNm ; //상품명 
	private String FestgoodsInDetail ; //입고목적 
	private String FestgoodsInAmt ; //수량 
	private String GroupCd ; //세입세출상세 그룹코드 
	private String ActionDt ; //마감일자 
	private String ActionStatus ; //마감유무 
	private String FestgoodsExpense ; //총금액 
	private String InsertDt ; //작성일 
	
	public String getFestgoodsInCd() {
		return FestgoodsInCd;
	}
	public void setFestgoodsInCd(String festgoodsInCd) {
		FestgoodsInCd = festgoodsInCd;
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
	public String getFestgoodsLdivCd() {
		return FestgoodsLdivCd;
	}
	public void setFestgoodsLdivCd(String festgoodsLdivCd) {
		FestgoodsLdivCd = festgoodsLdivCd;
	}
	public String getFestgoodsSdivCd() {
		return FestgoodsSdivCd;
	}
	public void setFestgoodsSdivCd(String festgoodsSdivCd) {
		FestgoodsSdivCd = festgoodsSdivCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
	}
	public String getFesrevBudCd() {
		return FesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		FesrevBudCd = fesrevBudCd;
	}
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestgoodsInNm() {
		return FestgoodsInNm;
	}
	public void setFestgoodsInNm(String festgoodsInNm) {
		FestgoodsInNm = festgoodsInNm;
	}
	public String getFestgoodsInDetail() {
		return FestgoodsInDetail;
	}
	public void setFestgoodsInDetail(String festgoodsInDetail) {
		FestgoodsInDetail = festgoodsInDetail;
	}
	public String getFestgoodsInAmt() {
		return FestgoodsInAmt;
	}
	public void setFestgoodsInAmt(String festgoodsInAmt) {
		FestgoodsInAmt = festgoodsInAmt;
	}
	public String getGroupCd() {
		return GroupCd;
	}
	public void setGroupCd(String groupCd) {
		GroupCd = groupCd;
	}
	public String getActionDt() {
		return ActionDt;
	}
	public void setActionDt(String actionDt) {
		ActionDt = actionDt;
	}
	public String getActionStatus() {
		return ActionStatus;
	}
	public void setActionStatus(String actionStatus) {
		ActionStatus = actionStatus;
	}
	public String getFestgoodsExpense() {
		return FestgoodsExpense;
	}
	public void setFestgoodsExpense(String festgoodsExpense) {
		FestgoodsExpense = festgoodsExpense;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestGoodsIn [FestgoodsInCd=" + FestgoodsInCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestgoodsLdivCd=" + FestgoodsLdivCd
				+ ", FestgoodsSdivCd=" + FestgoodsSdivCd + ", ManComCd=" + ManComCd + ", CatAccCd=" + CatAccCd
				+ ", AccMemCd=" + AccMemCd + ", FesrevBudCd=" + FesrevBudCd + ", FestTitle=" + FestTitle
				+ ", FestgoodsInNm=" + FestgoodsInNm + ", FestgoodsInDetail=" + FestgoodsInDetail + ", FestgoodsInAmt="
				+ FestgoodsInAmt + ", GroupCd=" + GroupCd + ", ActionDt=" + ActionDt + ", ActionStatus=" + ActionStatus
				+ ", FestgoodsExpense=" + FestgoodsExpense + ", InsertDt=" + InsertDt + "]";
	}

}
