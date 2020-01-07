package shop.fims.vo;

/**
 * @file shop.fims.vo.ExaReport.java
 * @name ExaReport
 * @brief 모든 심사 결과
 * @author ksmart33 김동석
 */
public class ExaReport {

	private String ExaRepCd ; //모든 심사 결과 
	private String AreacityAdminCd ; //모든 행정기관코드 
	private String AreaCd ; //전국지역코드 
	private String AreaCityCd ; //모든 지역 시군코드 
	private String FestCd ; //축제코드 
	private String MemCd ; //회원코드 
	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String FestProCd ; //하나의 축제내 여러개 프로그램 소개코드 
	private String EvaIndexCd ; //심사 평가지표명코드 
	private String ExaCondition ; //심사 유무 
	private String ExaDt ; //심사일자 
	private String ExaTotalScore ; //총점 
	
	public String getExaRepCd() {
		return ExaRepCd;
	}
	public void setExaRepCd(String exaRepCd) {
		ExaRepCd = exaRepCd;
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
	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		MemCd = memCd;
	}
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
	}
	public String getFestProCd() {
		return FestProCd;
	}
	public void setFestProCd(String festProCd) {
		FestProCd = festProCd;
	}
	public String getEvaIndexCd() {
		return EvaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		EvaIndexCd = evaIndexCd;
	}
	public String getExaCondition() {
		return ExaCondition;
	}
	public void setExaCondition(String exaCondition) {
		ExaCondition = exaCondition;
	}
	public String getExaDt() {
		return ExaDt;
	}
	public void setExaDt(String exaDt) {
		ExaDt = exaDt;
	}
	public String getExaTotalScore() {
		return ExaTotalScore;
	}
	public void setExaTotalScore(String exaTotalScore) {
		ExaTotalScore = exaTotalScore;
	}
	
	@Override
	public String toString() {
		return "ExaReport [ExaRepCd=" + ExaRepCd + ", AreacityAdminCd=" + AreacityAdminCd + ", AreaCd=" + AreaCd
				+ ", AreaCityCd=" + AreaCityCd + ", FestCd=" + FestCd + ", MemCd=" + MemCd + ", AccMemCd=" + AccMemCd
				+ ", FestProCd=" + FestProCd + ", EvaIndexCd=" + EvaIndexCd + ", ExaCondition=" + ExaCondition
				+ ", ExaDt=" + ExaDt + ", ExaTotalScore=" + ExaTotalScore + "]";
	}

}
