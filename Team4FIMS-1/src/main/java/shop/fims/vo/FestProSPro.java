package shop.fims.vo;

/**
 * @file shop.fims.vo.FestProSPro.java
 * @name FestProSPro
 * @brief 하나의 축제내 하나의 프로그램내 상세관리
 * @author ksmart33 김동석
 */
public class FestProSPro {

	private String FestproSproCd ; //하나의축제내하나의프로그램내 상세관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String FestprodivThemeCd ; //모든 축제별 프로그램 성격분류 
	private String FestProCd ; //하나의 축제내 여러개 프로그램 소개코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FestCd ; //축제코드 
	private String ManComCd ; //위원회코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestproSproNm ; //중프로그램명 
	private String FestproSproPlace ; //세부위치 
	private String FestproSproTime ; //세부시간 
	private String FestproSproDetail ; //내용 
	private String FestproSproExpense ; //중프로그램비용 
	private String InsertDt ; //작성일 
	
	public String getFestproSproCd() {
		return FestproSproCd;
	}
	public void setFestproSproCd(String festproSproCd) {
		FestproSproCd = festproSproCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getFestprodivThemeCd() {
		return FestprodivThemeCd;
	}
	public void setFestprodivThemeCd(String festprodivThemeCd) {
		FestprodivThemeCd = festprodivThemeCd;
	}
	public String getFestProCd() {
		return FestProCd;
	}
	public void setFestProCd(String festProCd) {
		FestProCd = festProCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
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
	public String getFestproSproNm() {
		return FestproSproNm;
	}
	public void setFestproSproNm(String festproSproNm) {
		FestproSproNm = festproSproNm;
	}
	public String getFestproSproPlace() {
		return FestproSproPlace;
	}
	public void setFestproSproPlace(String festproSproPlace) {
		FestproSproPlace = festproSproPlace;
	}
	public String getFestproSproTime() {
		return FestproSproTime;
	}
	public void setFestproSproTime(String festproSproTime) {
		FestproSproTime = festproSproTime;
	}
	public String getFestproSproDetail() {
		return FestproSproDetail;
	}
	public void setFestproSproDetail(String festproSproDetail) {
		FestproSproDetail = festproSproDetail;
	}
	public String getFestproSproExpense() {
		return FestproSproExpense;
	}
	public void setFestproSproExpense(String festproSproExpense) {
		FestproSproExpense = festproSproExpense;
	}
	public String getInsertDt() {
		return InsertDt;
	}
	public void setInsertDt(String insertDt) {
		InsertDt = insertDt;
	}
	
	@Override
	public String toString() {
		return "FestProSPro [FestproSproCd=" + FestproSproCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", FestprodivThemeCd=" + FestprodivThemeCd + ", FestProCd=" + FestProCd + ", AccMemCd=" + AccMemCd
				+ ", FestCd=" + FestCd + ", ManComCd=" + ManComCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", FestproSproNm=" + FestproSproNm + ", FestproSproPlace=" + FestproSproPlace + ", FestproSproTime="
				+ FestproSproTime + ", FestproSproDetail=" + FestproSproDetail + ", FestproSproExpense="
				+ FestproSproExpense + ", InsertDt=" + InsertDt + "]";
	}

}
