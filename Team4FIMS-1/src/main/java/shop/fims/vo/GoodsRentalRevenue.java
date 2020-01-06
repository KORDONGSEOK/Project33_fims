package shop.fims.vo;

/**
 * @file shop.fims.vo.GoodsRentalRevenue.java
 * @name GoodsRentalRevenue
 * @brief 모든 축제별 보유물품 대여관리 - 세입
 * @author ksmart33 김동석
 */
public class GoodsRentalRevenue {

	private String GoodsrenRevCd ; //모든축제별 보유물품대여관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String CatbusAccCd ; //거래처 업종 분류코드 
	private String CatAccCd ; //거래처코드 
	private String CatappAccCd ; //거래처별 승인 업종 코드 
	private String FesrevBudCd ; //모든축제세입세출예산관리코드 
	private String ManComCd ; //위원회코드 
	private String DeliverBre ; //보유물품사용내역 
	private String GoodsAmt ; //대여료 
	private String Money ; //수량 
	private String Lender ; //대여자 
	private String ReturnSituation ; //반납유무 
	private String ReturnDueDt ; //반납예정일 
	private String ReturnDt ; //반납완료일 
	private String GroupCd ; //세입상세그룹코드 
	private String ActionDt ; //마감일자 
	private String ActionStatus ; //마감유무 
	
	public String getGoodsrenRevCd() {
		return GoodsrenRevCd;
	}
	public void setGoodsrenRevCd(String goodsrenRevCd) {
		GoodsrenRevCd = goodsrenRevCd;
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
	public String getCatbusAccCd() {
		return CatbusAccCd;
	}
	public void setCatbusAccCd(String catbusAccCd) {
		CatbusAccCd = catbusAccCd;
	}
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getCatappAccCd() {
		return CatappAccCd;
	}
	public void setCatappAccCd(String catappAccCd) {
		CatappAccCd = catappAccCd;
	}
	public String getFesrevBudCd() {
		return FesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		FesrevBudCd = fesrevBudCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getDeliverBre() {
		return DeliverBre;
	}
	public void setDeliverBre(String deliverBre) {
		DeliverBre = deliverBre;
	}
	public String getGoodsAmt() {
		return GoodsAmt;
	}
	public void setGoodsAmt(String goodsAmt) {
		GoodsAmt = goodsAmt;
	}
	public String getMoney() {
		return Money;
	}
	public void setMoney(String money) {
		Money = money;
	}
	public String getLender() {
		return Lender;
	}
	public void setLender(String lender) {
		Lender = lender;
	}
	public String getReturnSituation() {
		return ReturnSituation;
	}
	public void setReturnSituation(String returnSituation) {
		ReturnSituation = returnSituation;
	}
	public String getReturnDueDt() {
		return ReturnDueDt;
	}
	public void setReturnDueDt(String returnDueDt) {
		ReturnDueDt = returnDueDt;
	}
	public String getReturnDt() {
		return ReturnDt;
	}
	public void setReturnDt(String returnDt) {
		ReturnDt = returnDt;
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
	
	@Override
	public String toString() {
		return "GoodsRentalRevenue [GoodsrenRevCd=" + GoodsrenRevCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", AreaCd=" + AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", CatbusAccCd="
				+ CatbusAccCd + ", CatAccCd=" + CatAccCd + ", CatappAccCd=" + CatappAccCd + ", FesrevBudCd="
				+ FesrevBudCd + ", ManComCd=" + ManComCd + ", DeliverBre=" + DeliverBre + ", GoodsAmt=" + GoodsAmt
				+ ", Money=" + Money + ", Lender=" + Lender + ", ReturnSituation=" + ReturnSituation + ", ReturnDueDt="
				+ ReturnDueDt + ", ReturnDt=" + ReturnDt + ", GroupCd=" + GroupCd + ", ActionDt=" + ActionDt
				+ ", ActionStatus=" + ActionStatus + "]";
	}

}
