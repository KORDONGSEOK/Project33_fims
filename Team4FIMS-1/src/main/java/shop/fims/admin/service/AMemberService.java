package shop.fims.admin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	


	

	
	//페이징작업추가
	public Map<String, Object> getMemberListpage(int currentPage){
		//페이지 구성 할 행의 갯수
		final int ROW_PER_PAGE = 10;
		
		//보여줄 첫번째 페이지번호 초기화
		int startPageNum = 1;
		
		//보여줄 페이지번호의 갯수 초기화
		int lastPageNum = ROW_PER_PAGE;
		
		
		if(currentPage > (ROW_PER_PAGE/2)) {
			startPageNum = currentPage -((lastPageNum/2)-1);
			lastPageNum += (startPageNum-1); 
		}
		
		// limit 적용될 값 startRow, 상수ROW_PER_PAGE
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int startRow = (currentPage-1)*ROW_PER_PAGE;
		
		map.put("startRow", startRow);
		map.put("rowPerPage", ROW_PER_PAGE);
		
		// 전체행의 갯수를 가져오는 쿼리
		double memberCount = aMemberMapper.getMemberAllCount();
		
		int lastPage = (int)(Math.ceil(memberCount/ROW_PER_PAGE));
		
		if(currentPage >= (lastPage-4)) {
			lastPageNum = lastPage;
		}
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("list", aMemberMapper.getMemberListpage(map));
		resultMap.put("currentPage", currentPage);
		resultMap.put("lastPage", lastPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("lastPageNum", lastPageNum);
		
		return resultMap;
	}
}




























