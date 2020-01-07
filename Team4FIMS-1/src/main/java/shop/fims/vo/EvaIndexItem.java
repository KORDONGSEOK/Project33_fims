package shop.fims.vo;

/**
 * @file shop.fims.vo.EvaIndexItem.java
 * @name EvaIndexItem
 * @brief 심사/평가항목
 * @author ksmart33 김동석
 */
public class EvaIndexItem {

	private String EvaindexItemCd ; //항목코드 
	private String EstClaCd ; //심사구분 
	private String EvaIndexCd ; //심사 평가지표명코드 
	private String LCriteria ; //대평가항목 
	private String MCriteria ; //중평가항목 
	private String SCriteria ; //소평가항목 
	private String MultipleChoice ; //객 주관식
	
	public String getEvaindexItemCd() {
		return EvaindexItemCd;
	}
	public void setEvaindexItemCd(String evaindexItemCd) {
		EvaindexItemCd = evaindexItemCd;
	}
	public String getEstClaCd() {
		return EstClaCd;
	}
	public void setEstClaCd(String estClaCd) {
		EstClaCd = estClaCd;
	}
	public String getEvaIndexCd() {
		return EvaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		EvaIndexCd = evaIndexCd;
	}
	public String getLCriteria() {
		return LCriteria;
	}
	public void setLCriteria(String lCriteria) {
		LCriteria = lCriteria;
	}
	public String getMCriteria() {
		return MCriteria;
	}
	public void setMCriteria(String mCriteria) {
		MCriteria = mCriteria;
	}
	public String getSCriteria() {
		return SCriteria;
	}
	public void setSCriteria(String sCriteria) {
		SCriteria = sCriteria;
	}
	public String getMultipleChoice() {
		return MultipleChoice;
	}
	public void setMultipleChoice(String multipleChoice) {
		MultipleChoice = multipleChoice;
	}
	@Override
	public String toString() {
		return "EvaIndexItem [EvaindexItemCd=" + EvaindexItemCd + ", EstClaCd=" + EstClaCd + ", EvaIndexCd="
				+ EvaIndexCd + ", LCriteria=" + LCriteria + ", MCriteria=" + MCriteria + ", SCriteria=" + SCriteria
				+ ", MultipleChoice=" + MultipleChoice + "]";
	}

}
