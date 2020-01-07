package shop.fims.vo;

/**
 * @file shop.fims.vo.AccsubMan.java
 * @name AccsubMan
 * @brief 모든 계정과목관리
 * @author ksmart33 김동석
 */
public class AccsubMan {

	private String AccsubManCd ; //모든계정과목코드 
	private String AccsubLarCd ; //대분류코드 
	private String AccsubMedCd ; //중분류코드 
	private String AccsubLargeNm ; //대분류명 
	private String AccsubMediumNm ; //중분류명 
	private String BudgetCla ; //예산구분 
	private String AccsubNm ; //모든계정과목명 
	
	public String getAccsubManCd() {
		return AccsubManCd;
	}
	public void setAccsubManCd(String accsubManCd) {
		AccsubManCd = accsubManCd;
	}
	public String getAccsubLarCd() {
		return AccsubLarCd;
	}
	public void setAccsubLarCd(String accsubLarCd) {
		AccsubLarCd = accsubLarCd;
	}
	public String getAccsubMedCd() {
		return AccsubMedCd;
	}
	public void setAccsubMedCd(String accsubMedCd) {
		AccsubMedCd = accsubMedCd;
	}
	public String getAccsubLargeNm() {
		return AccsubLargeNm;
	}
	public void setAccsubLargeNm(String accsubLargeNm) {
		AccsubLargeNm = accsubLargeNm;
	}
	public String getAccsubMediumNm() {
		return AccsubMediumNm;
	}
	public void setAccsubMediumNm(String accsubMediumNm) {
		AccsubMediumNm = accsubMediumNm;
	}
	public String getBudgetCla() {
		return BudgetCla;
	}
	public void setBudgetCla(String budgetCla) {
		BudgetCla = budgetCla;
	}
	public String getAccsubNm() {
		return AccsubNm;
	}
	public void setAccsubNm(String accsubNm) {
		AccsubNm = accsubNm;
	}
	
	@Override
	public String toString() {
		return "AccsubMan [AccsubManCd=" + AccsubManCd + ", AccsubLarCd=" + AccsubLarCd + ", AccsubMedCd=" + AccsubMedCd
				+ ", AccsubLargeNm=" + AccsubLargeNm + ", AccsubMediumNm=" + AccsubMediumNm + ", BudgetCla=" + BudgetCla
				+ ", AccsubNm=" + AccsubNm + "]";
	}

	
}
