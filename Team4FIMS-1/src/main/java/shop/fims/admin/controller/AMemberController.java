package shop.fims.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.fims.admin.service.AMemberService;
import shop.fims.vo.Member;

@Controller
public class AMemberController {

	@Autowired
	private AMemberService aMemberService;
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name getMemberList
	 * @brief 관리자 회원리스트
	 * @author ksmart33 김동석
	 * @return adminview/member/loginForm
	 */
	@GetMapping("adminview/member/memberList")
	public String memberList(Model model) {
		System.out.println("---관리자 회원리스트 : getMemberList 메서드 AMemberController.java-------");
		System.out.println(model + "<--model getMemberList 메서드 AMemberController.java-------");
		
		List<Member> list = aMemberService.getMemberList();
		
		model.addAttribute("memberList", list);
		
		return "/adminview/member/memberList";
	}
	
	@GetMapping("adminview/member/memberListpage")
	public String memberListpageing(Model model
							,@RequestParam(value="currentPage"
							, required = false
							, defaultValue = "1") int currentPage) {
		Map<String, Object> map = aMemberService.getMemberListpage(currentPage);
		
		model.addAttribute("memberListpageing", map.get("list"));
		model.addAttribute("currentPage", map.get("currentPage"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("startPageNum", map.get("startPageNum"));
		model.addAttribute("lastPageNum", map.get("lastPageNum"));
		return "/adminview/member/memberList";
	}
	
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberRegister
	 * @brief 관리자 회원등록
	 * @author ksmart33 김동석
	 * @return adminview/member/memberRegister
	 */
	@GetMapping("adminview/member/memberRegister")
	public String memberRegister() {
		System.out.println("---관리자 회원등록 : memberRegister AMemberController.java-------");
		return "/adminview/member/memberRegister";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name excelMemberUp
	 * @brief 관리자 엑셀회원업로드
	 * @author ksmart33 김동석
	 * @return adminview/member/excelMemberUp
	 */
	@GetMapping("adminview/member/excelMemberUp")
	public String excelMemberUp() {
		System.out.println("---관리자 엑셀회원업로드 : excelMemberUp AMemberController.java-------");
		return "/adminview/member/excelMemberUp";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberJoinPolicy
	 * @brief 관리자 회원가입정책관리
	 * @author ksmart33 김동석
	 * @return adminview/member/memberJoinPolicy
	 */
	@GetMapping("adminview/member/memberJoinPolicy")
	public String memberJoinPolicy() {
		System.out.println("---관리자 회원가입정책관리 : memberJoinPolicy AMemberController.java-------");
		return "/adminview/member/memberJoinPolicy";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberJoinItem
	 * @brief 관리자 회원가입항목관리
	 * @author ksmart33 김동석
	 * @return adminview/member/memberJoinItem
	 */
	@GetMapping("adminview/member/memberJoinItem")
	public String memberJoinItem() {
		System.out.println("---관리자 회원가입항목관리 : memberJoinItem AMemberController.java-------");
		return "/adminview/member/memberJoinItem";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberGrade
	 * @brief 관리자 회원등급관리
	 * @author ksmart33 김동석
	 * @return adminview/member/memberGrade
	 */
	@GetMapping("adminview/member/memberGrade")
	public String memberGrade() {
		System.out.println("---관리자 회원등급관리 : memberGrade AMemberController.java-------");
		return "/adminview/member/memberGrade";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberGradeAppraisal
	 * @brief 관리자 회원등급평가방법설정
	 * @author ksmart33 김동석
	 * @return adminview/member/memberGradeAppraisal
	 */
	@GetMapping("adminview/member/memberGradeAppraisal")
	public String memberGradeAppraisal() {
		System.out.println("---관리자 회원등급평가방법설정 : memberGradeAppraisal AMemberController.java-------");
		return "/adminview/member/memberGradeAppraisal";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberBatchApprovalModify
	 * @brief 관리자 회원 가입승인/등급변경
	 * @author ksmart33 김동석
	 * @return adminview/member/memberBatchApprovalModify
	 */
	@GetMapping("adminview/member/memberBatchApprovalModify")
	public String memberBatchApprovalModify() {
		System.out.println("---관리자 회원 가입승인/등급변경 : memberBatchApprovalModify AMemberController.java-------");
		return "/adminview/member/memberBatchApprovalModify";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberDataEvent
	 * @brief 관리자 회원정보 이벤트
	 * @author ksmart33 김동석
	 * @return adminview/member/memberDataEvent
	 */
	@GetMapping("adminview/member/memberDataEvent")
	public String memberDataEvent() {
		System.out.println("---관리자 회원정보 이벤트 : memberDataEvent AMemberController.java-------");
		return "/adminview/member/memberDataEvent";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberJoinEvent
	 * @brief 관리자 회원가입 이벤트
	 * @author ksmart33 김동석
	 * @return adminview/member/memberJoinEvent
	 */
	@GetMapping("adminview/member/memberJoinEvent")
	public String memberJoinEvent() {
		System.out.println("---관리자 회원가입 이벤트 : memberJoinEvent AMemberController.java-------");
		return "/adminview/member/memberJoinEvent";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberSleepPolicy
	 * @brief 관리자 휴먼회원 정책
	 * @author ksmart33 김동석
	 * @return adminview/member/memberSleepPolicy
	 */
	@GetMapping("adminview/member/memberSleepPolicy")
	public String memberSleepPolicy() {
		System.out.println("---관리자 휴먼회원 정책 : memberSleepPolicy AMemberController.java-------");
		return "/adminview/member/memberSleepPolicy";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberSleep
	 * @brief 관리자 휴먼회원 관리
	 * @author ksmart33 김동석
	 * @return adminview/member/memberSleep
	 */
	@GetMapping("adminview/member/memberSleep")
	public String memberSleep() {
		System.out.println("---관리자 휴먼회원 관리 : memberSleep AMemberController.java-------");
		return "/adminview/member/memberSleep";
	}
	
	/**
	 * @param 없음
	 * @file AMemberController.java
	 * @name memberWithdraw
	 * @brief 관리자 회원탈퇴/삭제관리
	 * @author ksmart33 김동석
	 * @return adminview/member/memberWithdraw
	 */
	@GetMapping("adminview/member/memberWithdraw")
	public String memberWithdraw() {
		System.out.println("---관리자 회원탈퇴/삭제관리 : memberWithdraw AMemberController.java-------");
		return "/adminview/member/memberWithdraw";
	}
}


































