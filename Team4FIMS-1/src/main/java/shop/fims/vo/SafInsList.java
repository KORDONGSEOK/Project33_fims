package shop.fims.vo;

/**
 * @file shop.fims.vo.SafInsList.java
 * @name SafInsList
 * @brief 안전관리 점검리스트 점검표
 * @author ksmart33 김동석
 */
public class SafInsList {

	private String SafinsListCd ; //안전관리점검리스트코드 
	private String SafinsListCla ; //분류 
	private String SafinsListCon ; //점검내용 
	
	public String getSafinsListCd() {
		return SafinsListCd;
	}
	public void setSafinsListCd(String safinsListCd) {
		SafinsListCd = safinsListCd;
	}
	public String getSafinsListCla() {
		return SafinsListCla;
	}
	public void setSafinsListCla(String safinsListCla) {
		SafinsListCla = safinsListCla;
	}
	public String getSafinsListCon() {
		return SafinsListCon;
	}
	public void setSafinsListCon(String safinsListCon) {
		SafinsListCon = safinsListCon;
	}
	
	@Override
	public String toString() {
		return "SafInsList [SafinsListCd=" + SafinsListCd + ", SafinsListCla=" + SafinsListCla + ", SafinsListCon="
				+ SafinsListCon + "]";
	}

}
