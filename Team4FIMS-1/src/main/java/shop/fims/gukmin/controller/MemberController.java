package shop.fims.gukmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name gukminMainLogin
	 * @brief 국민로그인
	 * @author ksmart33 김동석
	 * @return gukminview/login/loginForm
	 */
	@GetMapping("gukminview/login/loginForm")
	public String gukminLogin() {
		System.out.println("---국민로그인 : gukminLogin MemberController.java-------");
		return "/gukminview/login/loginForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name memberRegister
	 * @brief 국민회원가입
	 * @author ksmart33 김동석
	 * @return gukminview/member/memberRegisterForm
	 */
	@GetMapping("gukminview/member/memberRegisterForm")
	public String memberRegister() {
		System.out.println("---국민회원가입 : memberRegister MemberController.java-------");
		return "/gukminview/member/memberRegisterForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myPageView
	 * @brief 국민 마이페이지 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myPageView
	 */
	@GetMapping("gukminview/member/myPageView")
	public String myPageView() {
		System.out.println("---국민 마이페이지 화면 : myPageView MemberController.java-------");
		return "/gukminview/member/myPageView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myInfoEditForm
	 * @brief 국민 회원정보관리 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myInfoEditForm
	 */
	@GetMapping("gukminview/member/myInfoEditForm")
	public String myInfoEditForm() {
		System.out.println("---국민 회원정보관리 화면 : myInfoEditForm MemberController.java-------");
		return "/gukminview/member/myInfoEditForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name secedeForm
	 * @brief 국민 회원탈퇴 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/secedeForm
	 */
	@GetMapping("gukminview/member/secedeForm")
	public String secedeForm() {
		System.out.println("---국민 회원정보관리 화면 : secedeForm MemberController.java-------");
		return "/gukminview/member/secedeForm";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myBookmarkView
	 * @brief 국민 나의찜목록 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myBookmarkView
	 */
	@GetMapping("gukminview/member/myBookmarkView")
	public String myBookmarkView() {
		System.out.println("---국민 나의찜목록 화면 : myBookmarkView MemberController.java-------");
		return "/gukminview/member/myBookmarkView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myBookmarkSpotView
	 * @brief 국민  핫스팟찜록 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myBookmarkSpotView
	 */
	@GetMapping("gukminview/member/myBookmarkSpotView")
	public String myBookmarkSpotView() {
		System.out.println("---국민 핫스팟찜록 화면 : myBookmarkSpotView MemberController.java-------");
		return "/gukminview/member/myBookmarkSpotView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myInquiryView
	 * @brief 국민  나의문의내역 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myInquiryView
	 */
	@GetMapping("gukminview/member/myInquiryView")
	public String myInquiryView() {
		System.out.println("---국민 나의문의내역 화면 : myInquiryView MemberController.java-------");
		return "/gukminview/member/myInquiryView";
	}
	
	/**
	 * @param 없음
	 * @file MemberController.java
	 * @name myReviewView
	 * @brief 국민  나의리뷰내역 화면
	 * @author ksmart33 김동석
	 * @return gukminview/member/myReviewView
	 */
	@GetMapping("gukminview/member/myReviewView")
	public String myReviewView() {
		System.out.println("---국민 나의리뷰내역 화면 : myReviewView MemberController.java-------");
		return "/gukminview/member/myReviewView";
	}
	

	
	
}













