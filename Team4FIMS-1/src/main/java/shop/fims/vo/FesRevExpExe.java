package shop.fims.vo;

/**
 * @file shop.fims.vo.FesRevExpExe.java
 * @name FesRevExpExe
 * @brief 모든 축제 세입세출 집행관리
 * @author ksmart33 김동석
 */
public class FesRevExpExe {

	private String FesrevExeCd ; //모든축제세입세출집행관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AccsubManCd ; //모든계정과목코드 
	private String ManComCd ; //위원회코드 
	private String FestCd ; //축제코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String GroupCd ; //상세세입세출그룹코드 
	private String DettaxPaycontabNm ; //상세세입세출 
	private String AdmAgeNm ; //행정기관명 
	private String FesNm ; //축제명 
	private String ComNm ; //위원회명 
	private String LarCatNm ; //대분류명 
	private String AccsubMediumNm ; //중분류명 
	private String BudCla ; //예산구분 
	private String AccsubNm ; //모든계정과목명 
	private String ExpDetails ; //세부내용 
	private String FesYear ; //년도 
	private String Expenditure ; //집행액 
	
	public String getFesrevExeCd() {
		return FesrevExeCd;
	}
	public void setFesrevExeCd(String fesrevExeCd) {
		FesrevExeCd = fesrevExeCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
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
	public String getGroupCd() {
		return GroupCd;
	}
	public void setGroupCd(String groupCd) {
		GroupCd = groupCd;
	}
	public String getDettaxPaycontabNm() {
		return DettaxPaycontabNm;
	}
	public void setDettaxPaycontabNm(String dettaxPaycontabNm) {
		DettaxPaycontabNm = dettaxPaycontabNm;
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
	public String getLarCatNm() {
		return LarCatNm;
	}
	public void setLarCatNm(String larCatNm) {
		LarCatNm = larCatNm;
	}
	public String getAccsubMediumNm() {
		return AccsubMediumNm;
	}
	public void setAccsubMediumNm(String accsubMediumNm) {
		AccsubMediumNm = accsubMediumNm;
	}
	public String getBudCla() {
		return BudCla;
	}
	public void setBudCla(String budCla) {
		BudCla = budCla;
	}
	public String getAccsubNm() {
		return AccsubNm;
	}
	public void setAccsubNm(String accsubNm) {
		AccsubNm = accsubNm;
	}
	public String getExpDetails() {
		return ExpDetails;
	}
	public void setExpDetails(String expDetails) {
		ExpDetails = expDetails;
	}
	public String getFesYear() {
		return FesYear;
	}
	public void setFesYear(String fesYear) {
		FesYear = fesYear;
	}
	public String getExpenditure() {
		return Expenditure;
	}
	public void setExpenditure(String expenditure) {
		Expenditure = expenditure;
	}
	
	@Override
	public String toString() {
		return "FesRevExpExe [FesrevExeCd=" + FesrevExeCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AccsubManCd="
				+ AccsubManCd + ", ManComCd=" + ManComCd + ", FestCd=" + FestCd + ", AreaCityCd=" + AreaCityCd
				+ ", AreaCd=" + AreaCd + ", GroupCd=" + GroupCd + ", DettaxPaycontabNm=" + DettaxPaycontabNm
				+ ", AdmAgeNm=" + AdmAgeNm + ", FesNm=" + FesNm + ", ComNm=" + ComNm + ", LarCatNm=" + LarCatNm
				+ ", AccsubMediumNm=" + AccsubMediumNm + ", BudCla=" + BudCla + ", AccsubNm=" + AccsubNm
				+ ", ExpDetails=" + ExpDetails + ", FesYear=" + FesYear + ", Expenditure=" + Expenditure + "]";
	}

}
