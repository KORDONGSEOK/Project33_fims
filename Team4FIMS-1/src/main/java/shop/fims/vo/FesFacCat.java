package shop.fims.vo;

/**
 * @file shop.fims.vo.FesFacCat.java
 * @name FesFacCat
 * @brief 모든 시설 분류
 * @author ksmart33 김동석
 */
public class FesFacCat {

	private String FesfacCatCd ; //모든시설분류코드 
	private String FesfacCatNm ; //모든시설분류 
	
	public String getFesfacCatCd() {
		return FesfacCatCd;
	}
	public void setFesfacCatCd(String fesfacCatCd) {
		FesfacCatCd = fesfacCatCd;
	}
	public String getFesfacCatNm() {
		return FesfacCatNm;
	}
	public void setFesfacCatNm(String fesfacCatNm) {
		FesfacCatNm = fesfacCatNm;
	}
	
	@Override
	public String toString() {
		return "FesFacCat [FesfacCatCd=" + FesfacCatCd + ", FesfacCatNm=" + FesfacCatNm + "]";
	}

}
