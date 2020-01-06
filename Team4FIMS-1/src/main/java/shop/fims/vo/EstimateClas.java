package shop.fims.vo;

/**
 * @file shop.fims.vo.EstimateClas.java
 * @name EstimateClas
 * @brief 심사 분류
 * @author ksmart33 김동석
 */
public class EstimateClas {

	private String EstClaCd ; //심사구분 
	private String Classification ; //분류 
	
	public String getEstClaCd() {
		return EstClaCd;
	}
	public void setEstClaCd(String estClaCd) {
		EstClaCd = estClaCd;
	}
	public String getClassification() {
		return Classification;
	}
	public void setClassification(String classification) {
		Classification = classification;
	}
	
	@Override
	public String toString() {
		return "EstimateClas [EstClaCd=" + EstClaCd + ", Classification=" + Classification + "]";
	}

}
