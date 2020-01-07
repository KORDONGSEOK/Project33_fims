package shop.fims.vo;

/**
 * @file shop.fims.vo.FestivalAnn.java
 * @name FestivalAnn
 * @brief 모든 축제 공고관리
 * @author ksmart33 김동석
 */
public class FestivalAnn {

	private String FesAnnCd ; //모든축제공고코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String ManComCd ; //위원회코드 
	private String FestNm ; //축제명 
	private String ManComNm1 ; //위원회명 
	private String FestAnnNm ; //공고명 
	private String FestAnnDt1 ; //용역시작일 
	private String FestAnnDt2 ; //용역종료일 
	private String FestAnnDt3 ; //공고마감일 
	private String FestAnnCon ; //공고내용 
	private String FestAnnAtt ; //신청서양식첨부 
	private String FestAnnDt4 ; //작성일 
	private String FestAnnHits ; //조회수
	
	public String getFesAnnCd() {
		return FesAnnCd;
	}
	public void setFesAnnCd(String fesAnnCd) {
		FesAnnCd = fesAnnCd;
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
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getManComNm1() {
		return ManComNm1;
	}
	public void setManComNm1(String manComNm1) {
		ManComNm1 = manComNm1;
	}
	public String getFestAnnNm() {
		return FestAnnNm;
	}
	public void setFestAnnNm(String festAnnNm) {
		FestAnnNm = festAnnNm;
	}
	public String getFestAnnDt1() {
		return FestAnnDt1;
	}
	public void setFestAnnDt1(String festAnnDt1) {
		FestAnnDt1 = festAnnDt1;
	}
	public String getFestAnnDt2() {
		return FestAnnDt2;
	}
	public void setFestAnnDt2(String festAnnDt2) {
		FestAnnDt2 = festAnnDt2;
	}
	public String getFestAnnDt3() {
		return FestAnnDt3;
	}
	public void setFestAnnDt3(String festAnnDt3) {
		FestAnnDt3 = festAnnDt3;
	}
	public String getFestAnnCon() {
		return FestAnnCon;
	}
	public void setFestAnnCon(String festAnnCon) {
		FestAnnCon = festAnnCon;
	}
	public String getFestAnnAtt() {
		return FestAnnAtt;
	}
	public void setFestAnnAtt(String festAnnAtt) {
		FestAnnAtt = festAnnAtt;
	}
	public String getFestAnnDt4() {
		return FestAnnDt4;
	}
	public void setFestAnnDt4(String festAnnDt4) {
		FestAnnDt4 = festAnnDt4;
	}
	public String getFestAnnHits() {
		return FestAnnHits;
	}
	public void setFestAnnHits(String festAnnHits) {
		FestAnnHits = festAnnHits;
	}
	
	@Override
	public String toString() {
		return "FestivalAnn [FesAnnCd=" + FesAnnCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", ManComCd=" + ManComCd + ", FestNm=" + FestNm
				+ ", ManComNm1=" + ManComNm1 + ", FestAnnNm=" + FestAnnNm + ", FestAnnDt1=" + FestAnnDt1
				+ ", FestAnnDt2=" + FestAnnDt2 + ", FestAnnDt3=" + FestAnnDt3 + ", FestAnnCon=" + FestAnnCon
				+ ", FestAnnAtt=" + FestAnnAtt + ", FestAnnDt4=" + FestAnnDt4 + ", FestAnnHits=" + FestAnnHits + "]";
	}

}
