package shop.fims.vo;

/**
 * @file shop.fims.vo.CatBusinessAccount.java
 * @name CatBusinessAccount
 * @brief 거래처 업종 분류
 * @author ksmart33 김동석
 */
public class CatBusinessAccount {

	private String CatbusAccCd ; //거래처 업종 분류코드 
	private String CatbusAccBus ; //거래처업종분류 
	
	public String getCatbusAccCd() {
		return CatbusAccCd;
	}
	public void setCatbusAccCd(String catbusAccCd) {
		CatbusAccCd = catbusAccCd;
	}
	public String getCatbusAccBus() {
		return CatbusAccBus;
	}
	public void setCatbusAccBus(String catbusAccBus) {
		CatbusAccBus = catbusAccBus;
	}
	
	@Override
	public String toString() {
		return "CatBusinessAccount [CatbusAccCd=" + CatbusAccCd + ", CatbusAccBus=" + CatbusAccBus + "]";
	}

	
	
}
