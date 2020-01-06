package shop.fims.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.admin.mapper.AMemberMapper;
import shop.fims.vo.Member;

@Service
public class AMemberService {

	@Autowired
	private AMemberMapper aMemberMapper;
	
	/*
	 * public Map<String, Object> getMemberLogin(Member member) {
	 * 
	 * String result = "";
	 * 
	 * Map<String, Object> map = new HashMap<String,Object>();
	 * 
	 * Member memberCheck = aMemberMapper.getMemberLogin(member);
	 * 
	 * if(memberCheck == null) { Member memberIdCheck = aMemberMapper.getMemberById(
	 * member.getMemberId()); if(memberIdCheck == null) { result =
	 * "등록된 아이디의 정보가 없습니다."; }else { result = "비밀번호가 일치하지 않습니다."; }
	 * 
	 * }else { result = "로그인 성공"; map.put("loginMember", memberCheck); }
	 * 
	 * map.put("result", result);
	 * 
	 * return map; }
	 */
	
	public List<Member> getMemberList(){
		System.out.println("getMemberList 메서드 AMemberService.java ");
		List<Member> list = aMemberMapper.getMemberList();
		System.out.println(list + "<--list getMemberList 메서드 AMemberService.java ");
		return list;
	}
	
	public List<Member> getMemberSearchList(String sk, String sv){
		
		List<Member> list = aMemberMapper.getMemberSearchList(sk, sv);
		
		return list;
	}
	
	public int addMember(Member member) {
		int result = aMemberMapper.addMember(member);
		return result;
	}
	
	public Member getMemberById(String memberId) {
		
		return aMemberMapper.getMemberById(memberId);
	}
	
	public int modifyMember(Member member) {
		return aMemberMapper.modifyMember(member);
	}
	
	public int deleteMember(String memberId, String memberPw) {
		return aMemberMapper.delMember(memberId, memberPw);
	}
	
}
