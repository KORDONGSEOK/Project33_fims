package shop.fims.vo;

/**
 * @file shop.fims.vo.BoothApp.java
 * @name BoothApp
 * @brief 부스 참가신청서관리
 * @author ksmart33 김동석
 */
public class BoothApp {

	private String BooAppCd ; //부스 참가신청서관리 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FesAnnCd ; //모든축제공고코드 
	private String ManComCd ; //위원회코드 
	private String BooAppNm1 ; //부스명 
	private String BooAppNm2 ; //신청자 
	private String BooAppPhone ; //신청자연락처 
	private String BooAppEmail ; //신청자메일주소 
	private String BooAppPur ; //운영목적 
	private String BooAppPlan ; //운영계획 
	private String BooAppDt1 ; //참가시작희망일 
	private String BooAppDt2 ; //참가종료희망일 
	private String BooAppAtt ; //참가인원리스트(첨부) 
	private String BooAppBooth ; //신청부스개수 
	private String BooAppTable ; //테이블개수 
	private String BooAppChair ; //의자개수 
	private String BooAppEle ; //전기사용여부 
	private String BooAppBanner ; //현수막문구 
	private String BooAppDt3 ; //신청일 
	private String BooAppSel ; //선정여부 
	private String BooAppDt4 ; //선정일자 
	
	public String getBooAppCd() {
		return BooAppCd;
	}
	public void setBooAppCd(String booAppCd) {
		BooAppCd = booAppCd;
	}
	public String getAreacityAdminCd() {
		return AreacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		AreacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return AreaCd;
	}
	public void setAreaCd(String areaCd) {
		AreaCd = areaCd;
	}
	public String getAreaCityCd() {
		return AreaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		AreaCityCd = areaCityCd;
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
	public String getBooAppNm1() {
		return BooAppNm1;
	}
	public void setBooAppNm1(String booAppNm1) {
		BooAppNm1 = booAppNm1;
	}
	public String getBooAppNm2() {
		return BooAppNm2;
	}
	public void setBooAppNm2(String booAppNm2) {
		BooAppNm2 = booAppNm2;
	}
	public String getBooAppPhone() {
		return BooAppPhone;
	}
	public void setBooAppPhone(String booAppPhone) {
		BooAppPhone = booAppPhone;
	}
	public String getBooAppEmail() {
		return BooAppEmail;
	}
	public void setBooAppEmail(String booAppEmail) {
		BooAppEmail = booAppEmail;
	}
	public String getBooAppPur() {
		return BooAppPur;
	}
	public void setBooAppPur(String booAppPur) {
		BooAppPur = booAppPur;
	}
	public String getBooAppPlan() {
		return BooAppPlan;
	}
	public void setBooAppPlan(String booAppPlan) {
		BooAppPlan = booAppPlan;
	}
	public String getBooAppDt1() {
		return BooAppDt1;
	}
	public void setBooAppDt1(String booAppDt1) {
		BooAppDt1 = booAppDt1;
	}
	public String getBooAppDt2() {
		return BooAppDt2;
	}
	public void setBooAppDt2(String booAppDt2) {
		BooAppDt2 = booAppDt2;
	}
	public String getBooAppAtt() {
		return BooAppAtt;
	}
	public void setBooAppAtt(String booAppAtt) {
		BooAppAtt = booAppAtt;
	}
	public String getBooAppBooth() {
		return BooAppBooth;
	}
	public void setBooAppBooth(String booAppBooth) {
		BooAppBooth = booAppBooth;
	}
	public String getBooAppTable() {
		return BooAppTable;
	}
	public void setBooAppTable(String booAppTable) {
		BooAppTable = booAppTable;
	}
	public String getBooAppChair() {
		return BooAppChair;
	}
	public void setBooAppChair(String booAppChair) {
		BooAppChair = booAppChair;
	}
	public String getBooAppEle() {
		return BooAppEle;
	}
	public void setBooAppEle(String booAppEle) {
		BooAppEle = booAppEle;
	}
	public String getBooAppBanner() {
		return BooAppBanner;
	}
	public void setBooAppBanner(String booAppBanner) {
		BooAppBanner = booAppBanner;
	}
	public String getBooAppDt3() {
		return BooAppDt3;
	}
	public void setBooAppDt3(String booAppDt3) {
		BooAppDt3 = booAppDt3;
	}
	public String getBooAppSel() {
		return BooAppSel;
	}
	public void setBooAppSel(String booAppSel) {
		BooAppSel = booAppSel;
	}
	public String getBooAppDt4() {
		return BooAppDt4;
	}
	public void setBooAppDt4(String booAppDt4) {
		BooAppDt4 = booAppDt4;
	}
	
	@Override
	public String toString() {
		return "BoothApp [BooAppCd=" + BooAppCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FesAnnCd=" + FesAnnCd + ", ManComCd="
				+ ManComCd + ", BooAppNm1=" + BooAppNm1 + ", BooAppNm2=" + BooAppNm2 + ", BooAppPhone=" + BooAppPhone
				+ ", BooAppEmail=" + BooAppEmail + ", BooAppPur=" + BooAppPur + ", BooAppPlan=" + BooAppPlan
				+ ", BooAppDt1=" + BooAppDt1 + ", BooAppDt2=" + BooAppDt2 + ", BooAppAtt=" + BooAppAtt
				+ ", BooAppBooth=" + BooAppBooth + ", BooAppTable=" + BooAppTable + ", BooAppChair=" + BooAppChair
				+ ", BooAppEle=" + BooAppEle + ", BooAppBanner=" + BooAppBanner + ", BooAppDt3=" + BooAppDt3
				+ ", BooAppSel=" + BooAppSel + ", BooAppDt4=" + BooAppDt4 + "]";
	}

	
}
