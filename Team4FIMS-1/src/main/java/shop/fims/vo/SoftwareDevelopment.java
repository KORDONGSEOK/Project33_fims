package shop.fims.vo;

/**
 * @file shop.fims.vo.SoftwareDevelopment.java
 * @name SoftwareDevelopment
 * @brief sw개발사 관리
 * @author ksmart33 김동석
 */
public class SoftwareDevelopment {

	private String SofDevCd ; //sw개발사코드 
	private String SofDevNm ; //이름 
	private String SofDevBirth ; //생년월일 
	private String SofDevPhone ; //전화번호 
	private String SofDevAddress ; //주소 
	private String SofDevEmail ; //이메일 
	private String SofDevPart ; //역할 
	public String getSofDevCd() {
		return SofDevCd;
	}
	public void setSofDevCd(String sofDevCd) {
		SofDevCd = sofDevCd;
	}
	public String getSofDevNm() {
		return SofDevNm;
	}
	public void setSofDevNm(String sofDevNm) {
		SofDevNm = sofDevNm;
	}
	public String getSofDevBirth() {
		return SofDevBirth;
	}
	public void setSofDevBirth(String sofDevBirth) {
		SofDevBirth = sofDevBirth;
	}
	public String getSofDevPhone() {
		return SofDevPhone;
	}
	public void setSofDevPhone(String sofDevPhone) {
		SofDevPhone = sofDevPhone;
	}
	public String getSofDevAddress() {
		return SofDevAddress;
	}
	public void setSofDevAddress(String sofDevAddress) {
		SofDevAddress = sofDevAddress;
	}
	public String getSofDevEmail() {
		return SofDevEmail;
	}
	public void setSofDevEmail(String sofDevEmail) {
		SofDevEmail = sofDevEmail;
	}
	public String getSofDevPart() {
		return SofDevPart;
	}
	public void setSofDevPart(String sofDevPart) {
		SofDevPart = sofDevPart;
	}
	
	@Override
	public String toString() {
		return "SoftwareDevelopment [SofDevCd=" + SofDevCd + ", SofDevNm=" + SofDevNm + ", SofDevBirth=" + SofDevBirth
				+ ", SofDevPhone=" + SofDevPhone + ", SofDevAddress=" + SofDevAddress + ", SofDevEmail=" + SofDevEmail
				+ ", SofDevPart=" + SofDevPart + "]";
	}

}
