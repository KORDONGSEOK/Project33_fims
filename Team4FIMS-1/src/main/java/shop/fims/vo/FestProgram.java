package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProgram.java
 * @name FestProgram
 * @brief 하나의 축제내 여러개 프로그램 소개관리
 * @author ksmart33 김동석
 */
public class FestProgram {

	private String FestProCd ; //하나의 축제내 여러개 프로그램 소개코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String FestprodivDayCd ; //축제프로그램일차분류코드 
	private String FestprodivPlaCd ; //모든축제별프로그램장소분류 
	private String FestprodivThemeCd ; //모든 축제별 프로그램 성격분류 
	private String FestCd ; //축제코드 
	private String ManComCd ; //위원회코드 
	private String ExaRepCd ; //모든 심사 결과 
	private String FesrevBudCd ; //모든축제세입세출예산관리코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestTitle ; //축제명 
	private String FestProNm ; //프로그램명 
	private String FestProImg ; //프로그램이미지 
	private String FestproTimeStart ; //프로그램시작시간 
	private String FestproTimeEnd ; //프로그램종료시간 
	private String FestproReservDiv ; //예약가능여부 
	private String FestProRuntime ; //소요시간 
	private String FestProDetail ; //내용 
	private String GroupCd ; //세입세출상세 그룹코드 
	private String ActionDt ; //마감일자 
	private String ActionStatus ; //마감유무 
	private String FestProExpense ; //대프로그램비용 
	private String FestProAgelevel ; //관람연령 
	private String FestproTicketCost ; //입장료금액 
	private String FestproReflectDiv ; //평과결과에대한반영 
	private String FestproReflectDt ; //평과결과에대한반영일자 
	private String ProApprove ; //승인자ID 
	private String InsertDt ; //작성일
	
	public String getFestProCd() {
		return FestProCd;
	}
	public void setFestProCd(String festProCd) {
		FestProCd = festProCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getFestprodivDayCd() {
		return FestprodivDayCd;
	}
	public void setFestprodivDayCd(String festprodivDayCd) {
		FestprodivDayCd = festprodivDayCd;
	}
	public String getFestprodivPlaCd() {
		return FestprodivPlaCd;
	}
	public void setFestprodivPlaCd(String festprodivPlaCd) {
		FestprodivPlaCd = festprodivPlaCd;
	}
	public String getFestprodivThemeCd() {
		return FestprodivThemeCd;
	}
	public void setFestprodivThemeCd(String festprodivThemeCd) {
		FestprodivThemeCd = festprodivThemeCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getExaRepCd() {
		return ExaRepCd;
	}
	public void setExaRepCd(String exaRepCd) {
		ExaRepCd = exaRepCd;
	}
	public String getFesrevBudCd() {
		return FesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		FesrevBudCd = fesrevBudCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
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
	public String getFestProNm() {
		return FestProNm;
	}
	public void setFestProNm(String festProNm) {
		FestProNm = festProNm;
	}
	public String getFestProImg() {
		return FestProImg;
	}
	public void setFestProImg(String festProImg) {
		FestProImg = festProImg;
	}
	public String getFestproTimeStart() {
		return FestproTimeStart;
	}
	public void setFestproTimeStart(String festproTimeStart) {
		FestproTimeStart = festproTimeStart;
	}
	public String getFestproTimeEnd() {
		return FestproTimeEnd;
	}
	public void setFestproTimeEnd(String festproTimeEnd) {
		FestproTimeEnd = festproTimeEnd;
	}
	public String getFestproReservDiv() {
		return FestproReservDiv;
	}
	public void setFestproReservDiv(String festproReservDiv) {
		FestproReservDiv = festproReservDiv;
	}
	public String getFestProRuntime() {
		return FestProRuntime;
	}
	public void setFestProRuntime(String festProRuntime) {
		FestProRuntime = festProRuntime;
	}
	public String getFestProDetail() {
		return FestProDetail;
	}
	public void setFestProDetail(String festProDetail) {
		FestProDetail = festProDetail;
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
	public String getFestProExpense() {
		return FestProExpense;
	}
	public void setFestProExpense(String festProExpense) {
		FestProExpense = festProExpense;
	}
	public String getFestProAgelevel() {
		return FestProAgelevel;
	}
	public void setFestProAgelevel(String festProAgelevel) {
		FestProAgelevel = festProAgelevel;
	}
	public String getFestproTicketCost() {
		return FestproTicketCost;
	}
	public void setFestproTicketCost(String festproTicketCost) {
		FestproTicketCost = festproTicketCost;
	}
	public String getFestproReflectDiv() {
		return FestproReflectDiv;
	}
	public void setFestproReflectDiv(String festproReflectDiv) {
		FestproReflectDiv = festproReflectDiv;
	}
	public String getFestproReflectDt() {
		return FestproReflectDt;
	}
	public void setFestproReflectDt(String festproReflectDt) {
		FestproReflectDt = festproReflectDt;
	}
	public String getProApprove() {
		return ProApprove;
	}
	public void setProApprove(String proApprove) {
		ProApprove = proApprove;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestProgram [FestProCd=" + FestProCd + ", AreacityAdminCd=" + AreacityAdminCd + ", FestprodivDayCd="
				+ FestprodivDayCd + ", FestprodivPlaCd=" + FestprodivPlaCd + ", FestprodivThemeCd=" + FestprodivThemeCd
				+ ", FestCd=" + FestCd + ", ManComCd=" + ManComCd + ", ExaRepCd=" + ExaRepCd + ", FesrevBudCd="
				+ FesrevBudCd + ", AccMemCd=" + AccMemCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", FestTitle=" + FestTitle + ", FestProNm=" + FestProNm + ", FestProImg=" + FestProImg
				+ ", FestproTimeStart=" + FestproTimeStart + ", FestproTimeEnd=" + FestproTimeEnd
				+ ", FestproReservDiv=" + FestproReservDiv + ", FestProRuntime=" + FestProRuntime + ", FestProDetail="
				+ FestProDetail + ", GroupCd=" + GroupCd + ", ActionDt=" + ActionDt + ", ActionStatus=" + ActionStatus
				+ ", FestProExpense=" + FestProExpense + ", FestProAgelevel=" + FestProAgelevel + ", FestproTicketCost="
				+ FestproTicketCost + ", FestproReflectDiv=" + FestproReflectDiv + ", FestproReflectDt="
				+ FestproReflectDt + ", ProApprove=" + ProApprove + ", InsertDt=" + InsertDt + "]";
	}

}
