package shop.fims.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Member;

@Mapper
public interface AMemberMapper {

	public List<Member> getMemberList();
	
	public int addMember(Member member);
	
	public Member getMemberById(String memberId);
	
	public int modifyMember (Member member);
	
	public int delMember(String memberId, String memberPw);
	
	public Member getMemberLogin(Member member);
	
	public List<Member> getMemberSearchList (String sk, String sv);	

}
