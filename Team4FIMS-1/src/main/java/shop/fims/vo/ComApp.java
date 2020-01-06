package shop.fims.vo;

/**
 * @file shop.fims.vo.ComApp.java
 * @name ComApp
 * @brief 위원회 참가 신청서 관리
 * @author ksmart33 김동석
 */
public class ComApp {

	private String ComAppCd ; //위원회참가신청서관리 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String AreaCd ; //전국지역코드 
	private String FestCd ; //축제코드 
	private String FesAnnCd ; //모든축제공고코드 
	private String ManComCd ; //위원회코드 
	private String ComAppNm ; //이름 
	private String ComAppPhone ; //연락처 
	private String ComAppAdd ; //주소 
	private String ComAppJob ; //소속 
	private String ComAppEmail ; //이메일주소 
	private String ComAppEdu ; //최종학력 
	private String ComAppCar ; //경력 
	private String ComAppResult ; //위원회활동실적 
	private String ComAppDt1 ; //신청일 
	private String ComAppSel ; //합격여부 
	private String ComAppDt2 ; //합격일자 
	
	public String getComAppCd() {
		return ComAppCd;
	}
	public void setComAppCd(String comAppCd) {
		ComAppCd = comAppCd;
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
	public String getFestCd() {
		return FestCd;
	}
	public void setFestCd(String festCd) {
		FestCd = festCd;
	}
	public String getFesAnnCd() {
		return FesAnnCd;
	}
	public void setFesAnnCd(String fesAnnCd) {
		FesAnnCd = fesAnnCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getComAppNm() {
		return ComAppNm;
	}
	public void setComAppNm(String comAppNm) {
		ComAppNm = comAppNm;
	}
	public String getComAppPhone() {
		return ComAppPhone;
	}
	public void setComAppPhone(String comAppPhone) {
		ComAppPhone = comAppPhone;
	}
	public String getComAppAdd() {
		return ComAppAdd;
	}
	public void setComAppAdd(String comAppAdd) {
		ComAppAdd = comAppAdd;
	}
	public String getComAppJob() {
		return ComAppJob;
	}
	public void setComAppJob(String comAppJob) {
		ComAppJob = comAppJob;
	}
	public String getComAppEmail() {
		return ComAppEmail;
	}
	public void setComAppEmail(String comAppEmail) {
		ComAppEmail = comAppEmail;
	}
	public String getComAppEdu() {
		return ComAppEdu;
	}
	public void setComAppEdu(String comAppEdu) {
		ComAppEdu = comAppEdu;
	}
	public String getComAppCar() {
		return ComAppCar;
	}
	public void setComAppCar(String comAppCar) {
		ComAppCar = comAppCar;
	}
	public String getComAppResult() {
		return ComAppResult;
	}
	public void setComAppResult(String comAppResult) {
		ComAppResult = comAppResult;
	}
	public String getComAppDt1() {
		return ComAppDt1;
	}
	public void setComAppDt1(String comAppDt1) {
		ComAppDt1 = comAppDt1;
	}
	public String getComAppSel() {
		return ComAppSel;
	}
	public void setComAppSel(String comAppSel) {
		ComAppSel = comAppSel;
	}
	public String getComAppDt2() {
		return ComAppDt2;
	}
	public void setComAppDt2(String comAppDt2) {
		ComAppDt2 = comAppDt2;
	}
	
	@Override
	public String toString() {
		return "ComApp [ComAppCd=" + ComAppCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCityCd=" + AreaCityCd
				+ ", AreaCd=" + AreaCd + ", FestCd=" + FestCd + ", FesAnnCd=" + FesAnnCd + ", ManComCd=" + ManComCd
				+ ", ComAppNm=" + ComAppNm + ", ComAppPhone=" + ComAppPhone + ", ComAppAdd=" + ComAppAdd
				+ ", ComAppJob=" + ComAppJob + ", ComAppEmail=" + ComAppEmail + ", ComAppEdu=" + ComAppEdu
				+ ", ComAppCar=" + ComAppCar + ", ComAppResult=" + ComAppResult + ", ComAppDt1=" + ComAppDt1
				+ ", ComAppSel=" + ComAppSel + ", ComAppDt2=" + ComAppDt2 + "]";
	}

}
