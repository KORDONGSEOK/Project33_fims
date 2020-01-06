package shop.fims.vo;

/**
 * @file shop.fims.vo.FesRevExpBud.java
 * @name FesRevExpBud
 * @brief 모든 축제 세입세출 예산관리
 * @author ksmart33 김동석
 */
public class FesRevExpBud {

	private String FesrevBudCd ; //모든축제세입세출예산관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String FesrevSubCd ; //모든축제세입세출 소계및합계 예산관리코드 
	private String AccsubManCd ; //모든계정과목코드 
	private String ManComCd ; //위원회코드 
	private String FestCd ; //축제코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String AdmAgeNm ; //행정기관명 
	private String FesNm ; //축제명 
	private String ComNm ; //위원회명 
	private String AccsubLargeNm ; //대분류명 
	private String AccsubMediumNm ; //중분류명 
	private String BudgetCla ; //예산구분 
	private String AccsubNm ; //모든계정과목명 
	private String BudgetDetails ; //세부내용 
	private String FesYear ; //년도 
	private String Budget ; //예산액 
	
	public String getFesrevBudCd() {
		return FesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		FesrevBudCd = fesrevBudCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getFesrevSubCd() {
		return FesrevSubCd;
	}
	public void setFesrevSubCd(String fesrevSubCd) {
		FesrevSubCd = fesrevSubCd;
	}
	public String getAccsubManCd() {
		return AccsubManCd;
	}
	public void setAccsubManCd(String accsubManCd) {
		AccsubManCd = accsubManCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
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
	public String getAdmAgeNm() {
		return AdmAgeNm;
	}
	public void setAdmAgeNm(String admAgeNm) {
		AdmAgeNm = admAgeNm;
	}
	public String getFesNm() {
		return FesNm;
	}
	public void setFesNm(String fesNm) {
		FesNm = fesNm;
	}
	public String getComNm() {
		return ComNm;
	}
	public void setComNm(String comNm) {
		ComNm = comNm;
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
	public String getBudgetDetails() {
		return BudgetDetails;
	}
	public void setBudgetDetails(String budgetDetails) {
		BudgetDetails = budgetDetails;
	}
	public String getFesYear() {
		return FesYear;
	}
	public void setFesYear(String fesYear) {
		FesYear = fesYear;
	}
	public String getBudget() {
		return Budget;
	}
	public void setBudget(String budget) {
		Budget = budget;
	}
	
	@Override
	public String toString() {
		return "FesRevExpBud [FesrevBudCd=" + FesrevBudCd + ", AreacityAdminCd=" + AreacityAdminCd + ", FesrevSubCd="
				+ FesrevSubCd + ", AccsubManCd=" + AccsubManCd + ", ManComCd=" + ManComCd + ", FestCd=" + FestCd
				+ ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd + ", AdmAgeNm=" + AdmAgeNm + ", FesNm=" + FesNm
				+ ", ComNm=" + ComNm + ", AccsubLargeNm=" + AccsubLargeNm + ", AccsubMediumNm=" + AccsubMediumNm
				+ ", BudgetCla=" + BudgetCla + ", AccsubNm=" + AccsubNm + ", BudgetDetails=" + BudgetDetails
				+ ", FesYear=" + FesYear + ", Budget=" + Budget + "]";
	}

}
