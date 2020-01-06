package shop.fims.vo;

/**
 * @file shop.fims.vo.MemberLev.java
 * @name MemberLev
 * @brief 모든 회원 레벨관리
 * @author ksmart33 김동석
 */
public class MemberLev {

	private String MemLevCd ; //모든 회원 레벨코드 
	private String MemLevNm ; //레벨명 
	
	public String getMemLevCd() {
		return MemLevCd;
	}
	public void setMemLevCd(String memLevCd) {
		MemLevCd = memLevCd;
	}
	public String getMemLevNm() {
		return MemLevNm;
	}
	public void setMemLevNm(String memLevNm) {
		MemLevNm = memLevNm;
	}
	
	@Override
	public String toString() {
		return "MemberLev [MemLevCd=" + MemLevCd + ", MemLevNm=" + MemLevNm + "]";
	}

}
