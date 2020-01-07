package shop.fims.vo;

/**
 * @file shop.fims.vo.CatAccount.java
 * @name CatAccount
 * @brief 업종별 모든 거래처관리
 * @author ksmart33 김동석
 */
public class CatAccount {

	private String CatAccCd ; //거래처코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String ManComCd ; //위원회코드 
	private String CatAccNm1 ; //거래처명 
	private String CatAccOper ; //사업자분류 
	private String CatAccNm2 ; //거래처대표자명 
	private String CatAccAddr ; //거래처사업장주소 
	private String CatAccNo1 ; //거래처사업자등록번호 
	private String CatAccNo2 ; //거래처법인등록번호 
	private String CatAccPhone1 ; //거래처팩스번호 
	private String CatAccPhone2 ; //대표자 전화번호 
	private String CatAccPhone3 ; //거래처 대표번호 
	private String CatAccEmail ; //거래처이메일 
	private String CatAccDt1 ; //등록일자 
	private String CatAccApp ; //승인자 
	private String ManComNm1 ; //위원회명 
	private String CatAccDt2 ; //승인일자 
	private String CatAccCon ; //승인상태 
	
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
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
	public String getCatAccOper() {
		return CatAccOper;
	}
	public void setCatAccOper(String catAccOper) {
		CatAccOper = catAccOper;
	}
	public String getCatAccNm2() {
		return CatAccNm2;
	}
	public void setCatAccNm2(String catAccNm2) {
		CatAccNm2 = catAccNm2;
	}
	public String getCatAccAddr() {
		return CatAccAddr;
	}
	public void setCatAccAddr(String catAccAddr) {
		CatAccAddr = catAccAddr;
	}
	public String getCatAccNo1() {
		return CatAccNo1;
	}
	public void setCatAccNo1(String catAccNo1) {
		CatAccNo1 = catAccNo1;
	}
	public String getCatAccNo2() {
		return CatAccNo2;
	}
	public void setCatAccNo2(String catAccNo2) {
		CatAccNo2 = catAccNo2;
	}
	public String getCatAccPhone1() {
		return CatAccPhone1;
	}
	public void setCatAccPhone1(String catAccPhone1) {
		CatAccPhone1 = catAccPhone1;
	}
	public String getCatAccPhone2() {
		return CatAccPhone2;
	}
	public void setCatAccPhone2(String catAccPhone2) {
		CatAccPhone2 = catAccPhone2;
	}
	public String getCatAccPhone3() {
		return CatAccPhone3;
	}
	public void setCatAccPhone3(String catAccPhone3) {
		CatAccPhone3 = catAccPhone3;
	}
	public String getCatAccEmail() {
		return CatAccEmail;
	}
	public void setCatAccEmail(String catAccEmail) {
		CatAccEmail = catAccEmail;
	}
	public String getCatAccDt1() {
		return CatAccDt1;
	}
	public void setCatAccDt1(String catAccDt1) {
		CatAccDt1 = catAccDt1;
	}
	public String getCatAccApp() {
		return CatAccApp;
	}
	public void setCatAccApp(String catAccApp) {
		CatAccApp = catAccApp;
	}
	public String getManComNm1() {
		return ManComNm1;
	}
	public void setManComNm1(String manComNm1) {
		ManComNm1 = manComNm1;
	}
	public String getCatAccDt2() {
		return CatAccDt2;
	}
	public void setCatAccDt2(String catAccDt2) {
		CatAccDt2 = catAccDt2;
	}
	public String getCatAccCon() {
		return CatAccCon;
	}
	public void setCatAccCon(String catAccCon) {
		CatAccCon = catAccCon;
	}
	
	@Override
	public String toString() {
		return "CatAccount [CatAccCd=" + CatAccCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCityCd="
				+ AreaCityCd + ", AreaCd=" + AreaCd + ", ManComCd=" + ManComCd + ", CatAccNm1=" + CatAccNm1
				+ ", CatAccOper=" + CatAccOper + ", CatAccNm2=" + CatAccNm2 + ", CatAccAddr=" + CatAccAddr
				+ ", CatAccNo1=" + CatAccNo1 + ", CatAccNo2=" + CatAccNo2 + ", CatAccPhone1=" + CatAccPhone1
				+ ", CatAccPhone2=" + CatAccPhone2 + ", CatAccPhone3=" + CatAccPhone3 + ", CatAccEmail=" + CatAccEmail
				+ ", CatAccDt1=" + CatAccDt1 + ", CatAccApp=" + CatAccApp + ", ManComNm1=" + ManComNm1 + ", CatAccDt2="
				+ CatAccDt2 + ", CatAccCon=" + CatAccCon + "]";
	}

	
}
