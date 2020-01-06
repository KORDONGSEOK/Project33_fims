package shop.fims.vo;

/**
 * @file shop.fims.vo.FesttivalTicketRevenu.java
 * @name FesttivalTicketRevenu
 * @brief 입장권-세입
 * @author ksmart33 김동석
 */
public class FesttivalTicketRevenu {

	private String FesticRevCd ; //입장권세입관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String FestCd ; //축제코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FesticRevFee ; //입장료금액 
	private String FesticRevAmount ; //수량 
	private String GroupCd ; //세입상세그룹코드 
	private String ActionDt ; //마감일자 
	private String ActionStatus ; //마감유무 
	
	public String getFesticRevCd() {
		return FesticRevCd;
	}
	public void setFesticRevCd(String festicRevCd) {
		FesticRevCd = festicRevCd;
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
	public String getFesticRevFee() {
		return FesticRevFee;
	}
	public void setFesticRevFee(String festicRevFee) {
		FesticRevFee = festicRevFee;
	}
	public String getFesticRevAmount() {
		return FesticRevAmount;
	}
	public void setFesticRevAmount(String festicRevAmount) {
		FesticRevAmount = festicRevAmount;
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
		return "FesttivalTicketRevenu [FesticRevCd=" + FesticRevCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", FestCd=" + FestCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd + ", FesticRevFee="
				+ FesticRevFee + ", FesticRevAmount=" + FesticRevAmount + ", GroupCd=" + GroupCd + ", ActionDt="
				+ ActionDt + ", ActionStatus=" + ActionStatus + "]";
	}

}
