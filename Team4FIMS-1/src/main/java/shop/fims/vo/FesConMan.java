package shop.fims.vo;

/**
 * @file shop.fims.vo.FesConMan.java
 * @name FesConMan
 * @brief 모든 축제 계약관리
 * @author ksmart33 김동석
 */
public class FesConMan {

	private String FesconManCd ; //모든축제계약관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String ConcodManCd ; //계약코드관리 
	private String CatAccCd ; //거래처코드 
	private String CatappAccCd ; //거래처별 승인 업종 코드 
	private String FesrevBudCd ; //모든축제세입세출예산관리코드', 
	private String FestCd ; //축제코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String ContractNm ; //계약코드명 
	private String ConDetails ; //계약내용 
	private String ConAttFil ; //계약서첨부파일 
	private String AdmAgeNm ; //행정기관명 
	private String FesNm ; //축제명 
	private String ConAnnNm ; //계약공고명 
	private String CatAccNm1 ; //거래처명 
	private String CatAccNm2 ; //거래처대표자 
	private String ConAmo ; //계약금액 
	private String ConComDt ; //계약서작성일 
	private String ConStaDt ; //계약시작일자 
	private String ConExpDt ; //계약만료일자 
	private String ConNorCom ; //계약정상완료일자 
	private String ConPrePer ; //계약서작성한담당자 
	private String Belong ; //소속 
	private String ConSta1 ; //계약상태1 
	private String ConSta2 ; //계약상태2 
	
	public String getFesconManCd() {
		return FesconManCd;
	}
	public void setFesconManCd(String fesconManCd) {
		FesconManCd = fesconManCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getConcodManCd() {
		return ConcodManCd;
	}
	public void setConcodManCd(String concodManCd) {
		ConcodManCd = concodManCd;
	}
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getCatappAccCd() {
		return CatappAccCd;
	}
	public void setCatappAccCd(String catappAccCd) {
		CatappAccCd = catappAccCd;
	}
	public String getFesrevBudCd() {
		return FesrevBudCd;
	}
	public void setFesrevBudCd(String fesrevBudCd) {
		FesrevBudCd = fesrevBudCd;
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
	public String getContractNm() {
		return ContractNm;
	}
	public void setContractNm(String contractNm) {
		ContractNm = contractNm;
	}
	public String getConDetails() {
		return ConDetails;
	}
	public void setConDetails(String conDetails) {
		ConDetails = conDetails;
	}
	public String getConAttFil() {
		return ConAttFil;
	}
	public void setConAttFil(String conAttFil) {
		ConAttFil = conAttFil;
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
	public String getConAnnNm() {
		return ConAnnNm;
	}
	public void setConAnnNm(String conAnnNm) {
		ConAnnNm = conAnnNm;
	}
	public String getCatAccNm1() {
		return CatAccNm1;
	}
	public void setCatAccNm1(String catAccNm1) {
		CatAccNm1 = catAccNm1;
	}
	public String getCatAccNm2() {
		return CatAccNm2;
	}
	public void setCatAccNm2(String catAccNm2) {
		CatAccNm2 = catAccNm2;
	}
	public String getConAmo() {
		return ConAmo;
	}
	public void setConAmo(String conAmo) {
		ConAmo = conAmo;
	}
	public String getConComDt() {
		return ConComDt;
	}
	public void setConComDt(String conComDt) {
		ConComDt = conComDt;
	}
	public String getConStaDt() {
		return ConStaDt;
	}
	public void setConStaDt(String conStaDt) {
		ConStaDt = conStaDt;
	}
	public String getConExpDt() {
		return ConExpDt;
	}
	public void setConExpDt(String conExpDt) {
		ConExpDt = conExpDt;
	}
	public String getConNorCom() {
		return ConNorCom;
	}
	public void setConNorCom(String conNorCom) {
		ConNorCom = conNorCom;
	}
	public String getConPrePer() {
		return ConPrePer;
	}
	public void setConPrePer(String conPrePer) {
		ConPrePer = conPrePer;
	}
	public String getBelong() {
		return Belong;
	}
	public void setBelong(String belong) {
		Belong = belong;
	}
	public String getConSta1() {
		return ConSta1;
	}
	public void setConSta1(String conSta1) {
		ConSta1 = conSta1;
	}
	public String getConSta2() {
		return ConSta2;
	}
	public void setConSta2(String conSta2) {
		ConSta2 = conSta2;
	}
	
	@Override
	public String toString() {
		return "FesConMan [FesconManCd=" + FesconManCd + ", AreacityAdminCd=" + AreacityAdminCd + ", ConcodManCd="
				+ ConcodManCd + ", CatAccCd=" + CatAccCd + ", CatappAccCd=" + CatappAccCd + ", FesrevBudCd="
				+ FesrevBudCd + ", FestCd=" + FestCd + ", AreaCityCd=" + AreaCityCd + ", AreaCd=" + AreaCd
				+ ", ContractNm=" + ContractNm + ", ConDetails=" + ConDetails + ", ConAttFil=" + ConAttFil
				+ ", AdmAgeNm=" + AdmAgeNm + ", FesNm=" + FesNm + ", ConAnnNm=" + ConAnnNm + ", CatAccNm1=" + CatAccNm1
				+ ", CatAccNm2=" + CatAccNm2 + ", ConAmo=" + ConAmo + ", ConComDt=" + ConComDt + ", ConStaDt="
				+ ConStaDt + ", ConExpDt=" + ConExpDt + ", ConNorCom=" + ConNorCom + ", ConPrePer=" + ConPrePer
				+ ", Belong=" + Belong + ", ConSta1=" + ConSta1 + ", ConSta2=" + ConSta2 + "]";
	}

}
