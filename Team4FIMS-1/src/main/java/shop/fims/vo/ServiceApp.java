package shop.fims.vo;

/**
 * @file shop.fims.vo.Service_App.java
 * @name Service_App
 * @brief 용역참가신청서관리
 * @author ksmart33 김동석
 */
public class ServiceApp {

	private String SerAppCd ; //용역 참가신청서관리 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String FesAnnCd ; //모든축제공고코드 
	private String ManComCd ; //위원회코드 
	private String SerAppNm1 ; //거래처명 
	private String SerAppNo1 ; //거래처사업자등록번호 
	private String SerAppNo2 ; //거래처법인등록번호 
	private String SerAppAdd ; //거래처사업장주소 
	private String SerAppPhone ; //거래처대표번호 
	private String SerAppNm2 ; //거래처대표자명 
	private String SerAppNo3 ; //대표자 주민번호 
	private String SerAppAtt ; //관련서류첨부 
	
	public String getSerAppCd() {
		return SerAppCd;
	}
	public void setSerAppCd(String serAppCd) {
		SerAppCd = serAppCd;
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
	public String getSerAppNm1() {
		return SerAppNm1;
	}
	public void setSerAppNm1(String serAppNm1) {
		SerAppNm1 = serAppNm1;
	}
	public String getSerAppNo1() {
		return SerAppNo1;
	}
	public void setSerAppNo1(String serAppNo1) {
		SerAppNo1 = serAppNo1;
	}
	public String getSerAppNo2() {
		return SerAppNo2;
	}
	public void setSerAppNo2(String serAppNo2) {
		SerAppNo2 = serAppNo2;
	}
	public String getSerAppAdd() {
		return SerAppAdd;
	}
	public void setSerAppAdd(String serAppAdd) {
		SerAppAdd = serAppAdd;
	}
	public String getSerAppPhone() {
		return SerAppPhone;
	}
	public void setSerAppPhone(String serAppPhone) {
		SerAppPhone = serAppPhone;
	}
	public String getSerAppNm2() {
		return SerAppNm2;
	}
	public void setSerAppNm2(String serAppNm2) {
		SerAppNm2 = serAppNm2;
	}
	public String getSerAppNo3() {
		return SerAppNo3;
	}
	public void setSerAppNo3(String serAppNo3) {
		SerAppNo3 = serAppNo3;
	}
	public String getSerAppAtt() {
		return SerAppAtt;
	}
	public void setSerAppAtt(String serAppAtt) {
		SerAppAtt = serAppAtt;
	}
	
	@Override
	public String toString() {
		return "ServiceApp [SerAppCd=" + SerAppCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", FesAnnCd=" + FesAnnCd + ", ManComCd="
				+ ManComCd + ", SerAppNm1=" + SerAppNm1 + ", SerAppNo1=" + SerAppNo1 + ", SerAppNo2=" + SerAppNo2
				+ ", SerAppAdd=" + SerAppAdd + ", SerAppPhone=" + SerAppPhone + ", SerAppNm2=" + SerAppNm2
				+ ", SerAppNo3=" + SerAppNo3 + ", SerAppAtt=" + SerAppAtt + "]";
	}

}
