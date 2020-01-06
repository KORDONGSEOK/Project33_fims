package shop.fims.vo;

/**
 * @file shop.fims.vo.ManCom.java
 * @name ManCom
 * @brief 위원회 관리
 * @author ksmart33 김동석
 */
public class ManCom {

	private String ManComCd ; //위원회코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String MemCd ; //회원코드 
	private String MemLevCd ; //모든 회원 레벨코드 
	private String FestCd ; //축제코드 
	private String ExaRepCd ; //모든 심사 결과 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestNm ; //축제명 
	private String ManComCat ; //위원회 분류 
	private String ManComNm1 ; //위원회명 
	private String ManComDep ; //위원회부서 
	private String ManComRank ; //직급 
	private String ComMemNm2 ; //이름 
	private String ManComJob ; //소속 
	private String ManComDt1 ; //작성일자 
	private String ManComApp ; //승인자 
	private String ManComDt2 ; //승인일자 
	private String ManComCon ; //승인 상태 
	
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		MemCd = memCd;
	}
	public String getMemLevCd() {
		return MemLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		MemLevCd = memLevCd;
	}
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getExaRepCd() {
		return ExaRepCd;
	}
	public void setExaRepCd(String exaRepCd) {
		ExaRepCd = exaRepCd;
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
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getManComCat() {
		return ManComCat;
	}
	public void setManComCat(String manComCat) {
		ManComCat = manComCat;
	}
	public String getManComNm1() {
		return ManComNm1;
	}
	public void setManComNm1(String manComNm1) {
		ManComNm1 = manComNm1;
	}
	public String getManComDep() {
		return ManComDep;
	}
	public void setManComDep(String manComDep) {
		ManComDep = manComDep;
	}
	public String getManComRank() {
		return ManComRank;
	}
	public void setManComRank(String manComRank) {
		ManComRank = manComRank;
	}
	public String getComMemNm2() {
		return ComMemNm2;
	}
	public void setComMemNm2(String comMemNm2) {
		ComMemNm2 = comMemNm2;
	}
	public String getManComJob() {
		return ManComJob;
	}
	public void setManComJob(String manComJob) {
		ManComJob = manComJob;
	}
	public String getManComDt1() {
		return ManComDt1;
	}
	public void setManComDt1(String manComDt1) {
		ManComDt1 = manComDt1;
	}
	public String getManComApp() {
		return ManComApp;
	}
	public void setManComApp(String manComApp) {
		ManComApp = manComApp;
	}
	public String getManComDt2() {
		return ManComDt2;
	}
	public void setManComDt2(String manComDt2) {
		ManComDt2 = manComDt2;
	}
	public String getManComCon() {
		return ManComCon;
	}
	public void setManComCon(String manComCon) {
		ManComCon = manComCon;
	}
	
	@Override
	public String toString() {
		return "ManCom [ManComCd=" + ManComCd + ", AreacityAdminCd=" + AreacityAdminCd + ", MemCd=" + MemCd
				+ ", MemLevCd=" + MemLevCd + ", FestCd=" + FestCd + ", ExaRepCd=" + ExaRepCd + ", AreaCityCd="
				+ AreaCityCd + ", AreaCd=" + AreaCd + ", FestNm=" + FestNm + ", ManComCat=" + ManComCat + ", ManComNm1="
				+ ManComNm1 + ", ManComDep=" + ManComDep + ", ManComRank=" + ManComRank + ", ComMemNm2=" + ComMemNm2
				+ ", ManComJob=" + ManComJob + ", ManComDt1=" + ManComDt1 + ", ManComApp=" + ManComApp + ", ManComDt2="
				+ ManComDt2 + ", ManComCon=" + ManComCon + "]";
	}

}
