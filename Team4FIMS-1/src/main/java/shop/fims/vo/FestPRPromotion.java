package shop.fims.vo;

/**
 * @file shop.fims.vo.FestPRPromotion.java
 * @name FestPRPromotion
 * @brief 홍보 상세관리
 * @author ksmart33 김동석
 */
public class FestPRPromotion {

	private String FestprProCd ; //홍보상세코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestprDivCd ; //홍보방식코드 
	private String ManComCd ; //위원회코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FesrevBudCd ; //모든축제세입세출예산관리코드 
	private String CatAccCd ; //거래처코드 
	private String FestTitle ; //축제명 
	private String FestprProNm ; //매체명 
	private String FestprProDetail ; //홍보내용상세 
	private String FprproOrderDt ; //홍보제작일 
	private String FprproStartDt ; //홍보시작일 
	private String FprproEndDt ; //홍보종료일 
	private String FestprProPlace ; //장소/배포처 
	private String FestprProAmt ; //수량 
	private String FestprProAttach ; //첨부파일 
	private String GroupCd ; //세입세출상세_그룹코드 
	private String ActionDt ; //마감일 
	private String ActionStatus ; //마감유무 
	private String FestprProExpense ; //금액 
	private String FestprProEtc ; //비고 
	private String InsertDt ; //작성일 
	
	public String getFestprProCd() {
		return FestprProCd;
	}
	public void setFestprProCd(String festprProCd) {
		FestprProCd = festprProCd;
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
	public String getFestprDivCd() {
		return FestprDivCd;
	}
	public void setFestprDivCd(String festprDivCd) {
		FestprDivCd = festprDivCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
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
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestprProNm() {
		return FestprProNm;
	}
	public void setFestprProNm(String festprProNm) {
		FestprProNm = festprProNm;
	}
	public String getFestprProDetail() {
		return FestprProDetail;
	}
	public void setFestprProDetail(String festprProDetail) {
		FestprProDetail = festprProDetail;
	}
	public String getFprproOrderDt() {
		return FprproOrderDt;
	}
	public void setFprproOrderDt(String fprproOrderDt) {
		FprproOrderDt = fprproOrderDt;
	}
	public String getFprproStartDt() {
		return FprproStartDt;
	}
	public void setFprproStartDt(String fprproStartDt) {
		FprproStartDt = fprproStartDt;
	}
	public String getFprproEndDt() {
		return FprproEndDt;
	}
	public void setFprproEndDt(String fprproEndDt) {
		FprproEndDt = fprproEndDt;
	}
	public String getFestprProPlace() {
		return FestprProPlace;
	}
	public void setFestprProPlace(String festprProPlace) {
		FestprProPlace = festprProPlace;
	}
	public String getFestprProAmt() {
		return FestprProAmt;
	}
	public void setFestprProAmt(String festprProAmt) {
		FestprProAmt = festprProAmt;
	}
	public String getFestprProAttach() {
		return FestprProAttach;
	}
	public void setFestprProAttach(String festprProAttach) {
		FestprProAttach = festprProAttach;
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
	public String getFestprProExpense() {
		return FestprProExpense;
	}
	public void setFestprProExpense(String festprProExpense) {
		FestprProExpense = festprProExpense;
	}
	public String getFestprProEtc() {
		return FestprProEtc;
	}
	public void setFestprProEtc(String festprProEtc) {
		FestprProEtc = festprProEtc;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestPRPromotion [FestprProCd=" + FestprProCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestprDivCd=" + FestprDivCd
				+ ", ManComCd=" + ManComCd + ", AccMemCd=" + AccMemCd + ", FesrevBudCd=" + FesrevBudCd + ", CatAccCd="
				+ CatAccCd + ", FestTitle=" + FestTitle + ", FestprProNm=" + FestprProNm + ", FestprProDetail="
				+ FestprProDetail + ", FprproOrderDt=" + FprproOrderDt + ", FprproStartDt=" + FprproStartDt
				+ ", FprproEndDt=" + FprproEndDt + ", FestprProPlace=" + FestprProPlace + ", FestprProAmt="
				+ FestprProAmt + ", FestprProAttach=" + FestprProAttach + ", GroupCd=" + GroupCd + ", ActionDt="
				+ ActionDt + ", ActionStatus=" + ActionStatus + ", FestprProExpense=" + FestprProExpense
				+ ", FestprProEtc=" + FestprProEtc + ", InsertDt=" + InsertDt + "]";
	}

}
