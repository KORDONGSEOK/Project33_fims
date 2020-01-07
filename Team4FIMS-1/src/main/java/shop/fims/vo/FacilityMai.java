package shop.fims.vo;

/**
 * @file shop.fims.vo.FacilityMai.java
 * @name FacilityMai
 * @brief 시설물안전점검 후 지적관리
 * @author ksmart33 김동석
 */
public class FacilityMai {

	private String FacMaiCd ; //안전점검후지적관리코드 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String SafinsListCd ; //안전관리점검리스트코드 
	private String ManComCd ; //위원회코드 
	private String FacStaCd ; //모든보유시설코드 
	private String FestNm ; //축제명 
	private String FacStaNm ; //시설명 
	private String FacmaiCheDt ; //점검일자 
	private String FacMaiCad ; //지적사항 
	private String FacmaiInsIn ; //점검기관 
	private String FacmaiRecDt ; //재점검일 
	private String FacmaiSupDt ; //보완완료일 
	private String FacmaiResHuman ; //점검기관 담당자 
	private String ComMemNm2 ; //위원회명 
	private String FacmaiStaChe ; //점검상태 
	
	public String getFacMaiCd() {
		return FacMaiCd;
	}
	public void setFacMaiCd(String facMaiCd) {
		FacMaiCd = facMaiCd;
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
	public String getSafinsListCd() {
		return SafinsListCd;
	}
	public void setSafinsListCd(String safinsListCd) {
		SafinsListCd = safinsListCd;
	}
	public String getManComCd() {
		return ManComCd;
	}
	public void setManComCd(String manComCd) {
		ManComCd = manComCd;
	}
	public String getFacStaCd() {
		return FacStaCd;
	}
	public void setFacStaCd(String facStaCd) {
		FacStaCd = facStaCd;
	}
	public String getFestNm() {
		return FestNm;
	}
	public void setFestNm(String festNm) {
		FestNm = festNm;
	}
	public String getFacStaNm() {
		return FacStaNm;
	}
	public void setFacStaNm(String facStaNm) {
		FacStaNm = facStaNm;
	}
	public String getFacmaiCheDt() {
		return FacmaiCheDt;
	}
	public void setFacmaiCheDt(String facmaiCheDt) {
		FacmaiCheDt = facmaiCheDt;
	}
	public String getFacMaiCad() {
		return FacMaiCad;
	}
	public void setFacMaiCad(String facMaiCad) {
		FacMaiCad = facMaiCad;
	}
	public String getFacmaiInsIn() {
		return FacmaiInsIn;
	}
	public void setFacmaiInsIn(String facmaiInsIn) {
		FacmaiInsIn = facmaiInsIn;
	}
	public String getFacmaiRecDt() {
		return FacmaiRecDt;
	}
	public void setFacmaiRecDt(String facmaiRecDt) {
		FacmaiRecDt = facmaiRecDt;
	}
	public String getFacmaiSupDt() {
		return FacmaiSupDt;
	}
	public void setFacmaiSupDt(String facmaiSupDt) {
		FacmaiSupDt = facmaiSupDt;
	}
	public String getFacmaiResHuman() {
		return FacmaiResHuman;
	}
	public void setFacmaiResHuman(String facmaiResHuman) {
		FacmaiResHuman = facmaiResHuman;
	}
	public String getComMemNm2() {
		return ComMemNm2;
	}
	public void setComMemNm2(String comMemNm2) {
		ComMemNm2 = comMemNm2;
	}
	public String getFacmaiStaChe() {
		return FacmaiStaChe;
	}
	public void setFacmaiStaChe(String facmaiStaChe) {
		FacmaiStaChe = facmaiStaChe;
	}
	
	@Override
	public String toString() {
		return "FacilityMai [FacMaiCd=" + FacMaiCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", SafinsListCd=" + SafinsListCd + ", ManComCd="
				+ ManComCd + ", FacStaCd=" + FacStaCd + ", FestNm=" + FestNm + ", FacStaNm=" + FacStaNm
				+ ", FacmaiCheDt=" + FacmaiCheDt + ", FacMaiCad=" + FacMaiCad + ", FacmaiInsIn=" + FacmaiInsIn
				+ ", FacmaiRecDt=" + FacmaiRecDt + ", FacmaiSupDt=" + FacmaiSupDt + ", FacmaiResHuman=" + FacmaiResHuman
				+ ", ComMemNm2=" + ComMemNm2 + ", FacmaiStaChe=" + FacmaiStaChe + "]";
	}

}
