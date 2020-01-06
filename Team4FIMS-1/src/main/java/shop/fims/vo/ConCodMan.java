package shop.fims.vo;

/**
 * @file shop.fims.vo.ConCodMan.java
 * @name ConCodMan
 * @brief 계약 코드관리
 * @author ksmart33 김동석
 */
public class ConCodMan {

	private String ConcodManCd ; //계약코드관리 
	private String ConCodNm ; //계약코드명 
	
	public String getConcodManCd() {
		return ConcodManCd;
	}
	public void setConcodManCd(String concodManCd) {
		ConcodManCd = concodManCd;
	}
	public String getConCodNm() {
		return ConCodNm;
	}
	public void setConCodNm(String conCodNm) {
		ConCodNm = conCodNm;
	}
	
	@Override
	public String toString() {
		return "ConCodMan [ConcodManCd=" + ConcodManCd + ", ConCodNm=" + ConCodNm + "]";
	}

}
