package shop.fims.vo;

/**
 * @file shop.fims.vo.CatApprovalAccount.java
 * @name CatApprovalAccount
 * @brief 하나의 거래처별 승인업종
 * @author ksmart33 김동석
 */
public class CatApprovalAccount {

	private String CatappAccCd ; //거래처별 승인 업종 코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String CatbusAccCd ; //거래처 업종 분류코드 
	private String CatAccCd ; //거래처코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String ManComCd ; //위원회코드 
	private String CatAccNm1 ; //거래처명 
	private String CatbusAccBus ; //거래처업종분류 
	private String CatappAccApp ; //승인자 
	private String ManComNm1 ; //위원회명 
	private String CatappAccDt ; //승인일자 
	private String CatappAccCon ; //승인 상태 
	private String CatappAccPur ; //거래처업무 
	
	public String getCatappAccCd() {
		return CatappAccCd;
	}
	public void setCatappAccCd(String catappAccCd) {
		CatappAccCd = catappAccCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
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
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getCatAccNm1() {
		return CatAccNm1;
	}
	public void setCatAccNm1(String catAccNm1) {
		CatAccNm1 = catAccNm1;
	}
	public String getCatbusAccBus() {
		return CatbusAccBus;
	}
	public void setCatbusAccBus(String catbusAccBus) {
		CatbusAccBus = catbusAccBus;
	}
	public String getCatappAccApp() {
		return CatappAccApp;
	}
	public void setCatappAccApp(String catappAccApp) {
		CatappAccApp = catappAccApp;
	}
	public String getManComNm1() {
		return ManComNm1;
	}
	public void setManComNm1(String manComNm1) {
		ManComNm1 = manComNm1;
	}
	public String getCatappAccDt() {
		return CatappAccDt;
	}
	public void setCatappAccDt(String catappAccDt) {
		CatappAccDt = catappAccDt;
	}
	public String getCatappAccCon() {
		return CatappAccCon;
	}
	public void setCatappAccCon(String catappAccCon) {
		CatappAccCon = catappAccCon;
	}
	public String getCatappAccPur() {
		return CatappAccPur;
	}
	public void setCatappAccPur(String catappAccPur) {
		CatappAccPur = catappAccPur;
	}
	
	@Override
	public String toString() {
		return "CatApprovalAccount [CatappAccCd=" + CatappAccCd + ", AreacityAdminCd=" + AreacityAdminCd
				+ ", CatbusAccCd=" + CatbusAccCd + ", CatAccCd=" + CatAccCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd="
				+ AreaCd + ", ManComCd=" + ManComCd + ", CatAccNm1=" + CatAccNm1 + ", CatbusAccBus=" + CatbusAccBus
				+ ", CatappAccApp=" + CatappAccApp + ", ManComNm1=" + ManComNm1 + ", CatappAccDt=" + CatappAccDt
				+ ", CatappAccCon=" + CatappAccCon + ", CatappAccPur=" + CatappAccPur + "]";
	}

	
}
