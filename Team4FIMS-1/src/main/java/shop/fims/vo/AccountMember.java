package shop.fims.vo;

/**
 * @file shop.fims.vo.AccountMember.java
 * @name AccountMember
 * @brief 하나의 거래처별 소속 회원관리
 * @author ksmart33 김동석
 */
public class AccountMember {

	private String AccMemCd ; //하나의 거래처별 소속 회원코드 
	private String MemCd ; //회원코드 
	private String MemLevCd ; //모든 회원 레벨코드 
	private String CatAccCd ; //거래처코드 
	private String CatbusAccCd ; //거래처 업종 분류코드 
	private String CatappAccCd ; //거래처별 승인 업종 코드 
	private String CatAccNm1 ; //거래처명 
	private String CatbusAccBus ; //거래처업종분류 
	private String AccMemNm ; //거래처 소속 회원이름 
	private String AccMemAddr ; //주소 
	private String AccMemPhone ; //전화번호 
	private String AccMemEmail ; //이메일 
	private String AccMemDt1 ; //생년월일 
	private String AccMemDt2 ; //가입일자 
	
	public String getAccMemCd() {
		return AccMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		AccMemCd = accMemCd;
	}
	public String getMemCd() {
		return MemCd;
	}
	public void setMemCd(String memCd) {
		MemCd = memCd;
	}
	public String getMemLevCd() {
		return MemLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		MemLevCd = memLevCd;
	}
	public String getCatAccCd() {
		return CatAccCd;
	}
	public void setCatAccCd(String catAccCd) {
		CatAccCd = catAccCd;
	}
	public String getCatbusAccCd() {
		return CatbusAccCd;
	}
	public void setCatbusAccCd(String catbusAccCd) {
		CatbusAccCd = catbusAccCd;
	}
	public String getCatappAccCd() {
		return CatappAccCd;
	}
	public void setCatappAccCd(String catappAccCd) {
		CatappAccCd = catappAccCd;
	}
	public String getCatAccNm1() {
		return CatAccNm1;
	}
	public void setCatAccNm1(String catAccNm1) {
		CatAccNm1 = catAccNm1;
	}
	public String getCatbusAccBus() {
		return CatbusAccBus;
	}
	public void setCatbusAccBus(String catbusAccBus) {
		CatbusAccBus = catbusAccBus;
	}
	public String getAccMemNm() {
		return AccMemNm;
	}
	public void setAccMemNm(String accMemNm) {
		AccMemNm = accMemNm;
	}
	public String getAccMemAddr() {
		return AccMemAddr;
	}
	public void setAccMemAddr(String accMemAddr) {
		AccMemAddr = accMemAddr;
	}
	public String getAccMemPhone() {
		return AccMemPhone;
	}
	public void setAccMemPhone(String accMemPhone) {
		AccMemPhone = accMemPhone;
	}
	public String getAccMemEmail() {
		return AccMemEmail;
	}
	public void setAccMemEmail(String accMemEmail) {
		AccMemEmail = accMemEmail;
	}
	public String getAccMemDt1() {
		return AccMemDt1;
	}
	public void setAccMemDt1(String accMemDt1) {
		AccMemDt1 = accMemDt1;
	}
	public String getAccMemDt2() {
		return AccMemDt2;
	}
	public void setAccMemDt2(String accMemDt2) {
		AccMemDt2 = accMemDt2;
	}
	
	@Override
	public String toString() {
		return "AccountMember [AccMemCd=" + AccMemCd + ", MemCd=" + MemCd + ", MemLevCd=" + MemLevCd + ", CatAccCd="
				+ CatAccCd + ", CatbusAccCd=" + CatbusAccCd + ", CatappAccCd=" + CatappAccCd + ", CatAccNm1="
				+ CatAccNm1 + ", CatbusAccBus=" + CatbusAccBus + ", AccMemNm=" + AccMemNm + ", AccMemAddr=" + AccMemAddr
				+ ", AccMemPhone=" + AccMemPhone + ", AccMemEmail=" + AccMemEmail + ", AccMemDt1=" + AccMemDt1
				+ ", AccMemDt2=" + AccMemDt2 + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
