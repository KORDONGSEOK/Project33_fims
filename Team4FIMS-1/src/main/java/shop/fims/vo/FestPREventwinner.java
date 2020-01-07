package shop.fims.vo;

/**
 * @file shop.fims.vo.FestPREventwinner.java
 * @name FestPREventwinner
 * @brief 홍보 상세 경품이벤트 - 당첨자관리
 * @author ksmart33 김동석
 */
public class FestPREventwinner {

	private String FestprEveCd ; //이벤트당첨자 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FestprProCd ; //홍보상세코드 
	private String ManComCd ; //위원회코드 
	private String FestTitle ; //축제명 
	private String FestprEveNm ; //이름 
	private String FestprEvePhone ; //연락처 
	private String FestprEveAddr ; //주소 
	private String FestpreveDeliDt ; //경품전달일 
	private String FestprEveNo ; //당첨자번호 
	private String FestprEveEtc ; //비고 
	private String InsertDt ; //작성일 
	
	public String getFestprEveCd() {
		return FestprEveCd;
	}
	public void setFestprEveCd(String festprEveCd) {
		FestprEveCd = festprEveCd;
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
	public String getFestprProCd() {
		return FestprProCd;
	}
	public void setFestprProCd(String festprProCd) {
		FestprProCd = festprProCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getFestTitle() {
		return FestTitle;
	}
	public void setFestTitle(String festTitle) {
		FestTitle = festTitle;
	}
	public String getFestprEveNm() {
		return FestprEveNm;
	}
	public void setFestprEveNm(String festprEveNm) {
		FestprEveNm = festprEveNm;
	}
	public String getFestprEvePhone() {
		return FestprEvePhone;
	}
	public void setFestprEvePhone(String festprEvePhone) {
		FestprEvePhone = festprEvePhone;
	}
	public String getFestprEveAddr() {
		return FestprEveAddr;
	}
	public void setFestprEveAddr(String festprEveAddr) {
		FestprEveAddr = festprEveAddr;
	}
	public String getFestpreveDeliDt() {
		return FestpreveDeliDt;
	}
	public void setFestpreveDeliDt(String festpreveDeliDt) {
		FestpreveDeliDt = festpreveDeliDt;
	}
	public String getFestprEveNo() {
		return FestprEveNo;
	}
	public void setFestprEveNo(String festprEveNo) {
		FestprEveNo = festprEveNo;
	}
	public String getFestprEveEtc() {
		return FestprEveEtc;
	}
	public void setFestprEveEtc(String festprEveEtc) {
		FestprEveEtc = festprEveEtc;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestPREventwinner [FestprEveCd=" + FestprEveCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd="
				+ AreaCd + ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FestprProCd=" + FestprProCd
				+ ", ManComCd=" + ManComCd + ", FestTitle=" + FestTitle + ", FestprEveNm=" + FestprEveNm
				+ ", FestprEvePhone=" + FestprEvePhone + ", FestprEveAddr=" + FestprEveAddr + ", FestpreveDeliDt="
				+ FestpreveDeliDt + ", FestprEveNo=" + FestprEveNo + ", FestprEveEtc=" + FestprEveEtc + ", InsertDt="
				+ InsertDt + "]";
	}

}
