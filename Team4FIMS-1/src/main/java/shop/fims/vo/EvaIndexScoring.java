package shop.fims.vo;

/**
 * @file shop.fims.vo.EvaIndexScoring.java
 * @name EvaIndexScoring
 * @brief 객관식문항점수표
 * @author ksmart33 김동석
 */
public class EvaIndexScoring {

	private String EvaindexScoCd ; //객관식문항점수표 코드 
	private String EvaIndexCd ; //심사 평가지표명코드 
	private String EvaindexItemCd ; //항목코드 
	private String ScoringCriteria ; //배점기준 
	private String Scoring ; //배점 
	
	public String getEvaindexScoCd() {
		return EvaindexScoCd;
	}
	public void setEvaindexScoCd(String evaindexScoCd) {
		EvaindexScoCd = evaindexScoCd;
	}
	public String getEvaIndexCd() {
		return EvaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		EvaIndexCd = evaIndexCd;
	}
	public String getEvaindexItemCd() {
		return EvaindexItemCd;
	}
	public void setEvaindexItemCd(String evaindexItemCd) {
		EvaindexItemCd = evaindexItemCd;
	}
	public String getScoringCriteria() {
		return ScoringCriteria;
	}
	public void setScoringCriteria(String scoringCriteria) {
		ScoringCriteria = scoringCriteria;
	}
	public String getScoring() {
		return Scoring;
	}
	public void setScoring(String scoring) {
		Scoring = scoring;
	}
	
	@Override
	public String toString() {
		return "EvaIndexScoring [EvaindexScoCd=" + EvaindexScoCd + ", EvaIndexCd=" + EvaIndexCd + ", EvaindexItemCd="
				+ EvaindexItemCd + ", ScoringCriteria=" + ScoringCriteria + ", Scoring=" + Scoring + "]";
	}

}
