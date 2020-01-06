package shop.fims.vo;

/**
 * @file shop.fims.vo.EvaIndex.java
 * @name EvaIndex
 * @brief 모든 축제 관련심사/평가지표명
 * @author ksmart33 김동석
 */
public class EvaIndex {

	private String EvaIndexCd ; //심사 평가지표명코드 
	private String EstClaCd ; //심사구분 
	private String AdmindepEmpCd ; //모든 행정기관 부서별 직원 관리코드 
	private String EvaNm ; //평가명 
	
	public String getEvaIndexCd() {
		return EvaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		EvaIndexCd = evaIndexCd;
	}
	public String getEstClaCd() {
		return EstClaCd;
	}
	public void setEstClaCd(String estClaCd) {
		EstClaCd = estClaCd;
	}
	public String getAdmindepEmpCd() {
		return AdmindepEmpCd;
	}
	public void setAdmindepEmpCd(String admindepEmpCd) {
		AdmindepEmpCd = admindepEmpCd;
	}
	public String getEvaNm() {
		return EvaNm;
	}
	public void setEvaNm(String evaNm) {
		EvaNm = evaNm;
	}
	@Override
	public String toString() {
		return "EvaIndex [EvaIndexCd=" + EvaIndexCd + ", EstClaCd=" + EstClaCd + ", AdmindepEmpCd=" + AdmindepEmpCd
				+ ", EvaNm=" + EvaNm + "]";
	}

}
