package shop.fims.vo;

/**
 * @file shop.fims.vo.FacilityStatus.java
 * @name FacilityStatus
 * @brief 모든 보유시설현황 세입
 * @author ksmart33 김동석
 */
public class FacilityStatus {

	private String FacStaCd ; //모든보유시설코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FesfacCatCd ; //모든시설분류코드 
	private String ManComCd ; //위원회코드 
	private String FestNm ; //축제명 
	private String FesfacCatNm ; //모든시설분류명 
	private String FacStaNm ; //시설명 
	private String FacStaSite ; //위치 
	private String FacStaCount ; //수량 
	private String ComMemNm2 ; //위원회명 
	private String GroupCd ; //세입상세 그룹코드 
	private String ActionDt ; //마감일자 
	private String ActionStatus ; //마감유무 
	
	public String getFacStaCd() {
		return FacStaCd;
	}
	public void setFacStaCd(String facStaCd) {
		FacStaCd = facStaCd;
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
	public String getFesfacCatCd() {
		return FesfacCatCd;
	}
	public void setFesfacCatCd(String fesfacCatCd) {
		FesfacCatCd = fesfacCatCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getFesfacCatNm() {
		return FesfacCatNm;
	}
	public void setFesfacCatNm(String fesfacCatNm) {
		FesfacCatNm = fesfacCatNm;
	}
	public String getFacStaNm() {
		return FacStaNm;
	}
	public void setFacStaNm(String facStaNm) {
		FacStaNm = facStaNm;
	}
	public String getFacStaSite() {
		return FacStaSite;
	}
	public void setFacStaSite(String facStaSite) {
		FacStaSite = facStaSite;
	}
	public String getFacStaCount() {
		return FacStaCount;
	}
	public void setFacStaCount(String facStaCount) {
		FacStaCount = facStaCount;
	}
	public String getComMemNm2() {
		return ComMemNm2;
	}
	public void setComMemNm2(String comMemNm2) {
		ComMemNm2 = comMemNm2;
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
		return "FacilityStatus [FacStaCd=" + FacStaCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FesfacCatCd=" + FesfacCatCd + ", ManComCd="
				+ ManComCd + ", FestNm=" + FestNm + ", FesfacCatNm=" + FesfacCatNm + ", FacStaNm=" + FacStaNm
				+ ", FacStaSite=" + FacStaSite + ", FacStaCount=" + FacStaCount + ", ComMemNm2=" + ComMemNm2
				+ ", GroupCd=" + GroupCd + ", ActionDt=" + ActionDt + ", ActionStatus=" + ActionStatus + "]";
	}

}
