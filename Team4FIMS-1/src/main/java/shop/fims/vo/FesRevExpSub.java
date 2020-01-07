package shop.fims.vo;

/**
 * @file shop.fims.vo.FesRevExpSub.java
 * @name FesRevExpSub
 * @brief 모든 축제 세입세출 소계및합계 예산관리
 * @author ksmart33 김동석
 */
public class FesRevExpSub {

	private String FesrevSubCd ; //모든축제세입세출 소계및합계 예산관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String ManComCd ; //위원회코드 
	private String FestCd ; //축제코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String AccsubLarCd ; //모든계정과목대분류코드 
	private String AdmAgeNm ; //행정기관명 
	private String FesNm ; //축제명 
	private String ComNm ; //위원회명 
	private String AccsubLargeNm ; //대분류명 
	private String BudgetCla ; //예산구분 
	private String FesYear ; //년도 
	private String Budget ; //예산액 
	
	public String getFesrevSubCd() {
		return FesrevSubCd;
	}
	public void setFesrevSubCd(String fesrevSubCd) {
		FesrevSubCd = fesrevSubCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
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
	public String getAccsubLarCd() {
		return AccsubLarCd;
	}
	public void setAccsubLarCd(String accsubLarCd) {
		AccsubLarCd = accsubLarCd;
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
	public String getBudgetCla() {
		return BudgetCla;
	}
	public void setBudgetCla(String budgetCla) {
		BudgetCla = budgetCla;
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
		return "FesRevExpSub [FesrevSubCd=" + FesrevSubCd + ", AreacityAdminCd=" + AreacityAdminCd + ", ManComCd="
				+ ManComCd + ", FestCd=" + FestCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", AccsubLarCd=" + AccsubLarCd + ", AdmAgeNm=" + AdmAgeNm + ", FesNm=" + FesNm + ", ComNm=" + ComNm
				+ ", AccsubLargeNm=" + AccsubLargeNm + ", BudgetCla=" + BudgetCla + ", FesYear=" + FesYear + ", Budget="
				+ Budget + "]";
	}

}
