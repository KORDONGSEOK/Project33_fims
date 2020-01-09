package shop.fims.gukmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shop.fims.gukmin.service.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	/**
	 * @param 없음
	 * @file CommunityController.java
	 * @name communityView
	 * @brief 국민 커뮤니티화면
	 * @author ksmart33 김동석
	 * @return gukminview/community/communityView
	 */
	@GetMapping("gukminview/community/communityView")
	public String communityView() {
		System.out.println("---국민 커뮤니티화면 : communityView CommunityController.java-------");
		return "/gukminview/community/communityView";
	}
	
	/**
	 * @param 없음
	 * @file CommunityController.java
	 * @name faqView
	 * @brief 국민 FAQ화면
	 * @author ksmart33 김동석
	 * @return gukminview/community/faqView
	 */
	@GetMapping("gukminview/community/faqView")
	public String faqView() {
		System.out.println("---국민 FAQ화면 : faqView CommunityController.java-------");
		return "/gukminview/community/faqView";
	}
	
	/**
	 * @param 없음
	 * @file CommunityController.java
	 * @name noticeView
	 * @brief 국민 공지사항화면
	 * @author ksmart33 김동석
	 * @return gukminview/community/noticeView
	 */
	@GetMapping("gukminview/community/noticeView")
	public String noticeView() {
		System.out.println("---국민 공지사항화면 : noticeView CommunityController.java-------");
		return "/gukminview/community/noticeDetailView.html";
	}
	
	/**
	 * @param 없음
	 * @file CommunityController.java
	 * @name noticeDetailView
	 * @brief 국민 공지사항 상세화면
	 * @author ksmart33 김동석
	 * @return gukminview/community/noticeDetailView
	 */
	@GetMapping("gukminview/community/noticeDetailView")
	public String noticeDetail() {
		System.out.println("---국민 공지사항 상세화면 : noticeDetailView CommunityController.java-------");
		return "/gukminview/community/noticeDetailView";
	}
	
	/**
	 * @param 없음
	 * @file CommunityController.java
	 * @name eventView
	 * @brief 국민 이벤트화면
	 * @author ksmart33 김동석
	 * @return gukminview/community/faqView
	 */
	@GetMapping("gukminview/community/eventView")
	public String eventView() {
		System.out.println("---국민 이벤트화면 : eventView CommunityController.java-------");
		return "/gukminview/community/eventView";
	}
	
	/**
	 * @param 없음
	 * @file CommunityController.java
	 * @name eventDetailView
	 * @brief 국민 이벤트 상세화면
	 * @author ksmart33 김동석
	 * @return gukminview/community/eventDetailView
	 */
	@GetMapping("gukminview/community/eventDetailView")
	public String eventDetailView() {
		System.out.println("---국민 이벤트 상세화면 : eventDetailView CommunityController.java-------");
		return "/gukminview/community/eventDetailView";
	}
	

	@RequestMapping("/test/test")
	public String test() {
		System.out.println("ajax json test");
		return "/gukmin";
	}
}




















