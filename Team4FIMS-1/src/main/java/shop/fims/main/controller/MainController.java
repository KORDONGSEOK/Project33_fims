package shop.fims.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name projectIntro
	 * @brief 국민프로젝트소개
	 * @author ksmart33 김동석
	 * @return index
	 */
	@GetMapping("/")
	public String projectIntro() {
		System.out.println("---국민 fims프로젝트소개 : projectIntro MainController.java-------");
		return "index";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukminMainView
	 * @brief 국민메인화면
	 * @author ksmart33 김동석
	 * @return index
	 */
	
	@GetMapping("/gukmin")
	public String gukmin() {
		System.out.println("---국민메인화면 : gukminMainView MainController.java-------");
		return "gukmin";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name siteMapView
	 * @brief 국민 사이트앱
	 * @author ksmart33 김동석
	 * @return gukminview/sitemap/projectIntro
	 */
	@GetMapping("gukminview/sitemap/siteMapView")
	public String siteMapView() {
		System.out.println("---국민 사이트앱 : siteMapView MainController.java-------");
		return "/gukminview/sitemap/siteMapView";
	}
	
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukminMainView
	 * @brief 국민메인화면
	 * @author ksmart33 김동석
	 * @return gukminview/gukminMainView
	 */
	@GetMapping("gukminview/gukminMainView")
	public String gukminMainView() {
		System.out.println("---국민메인화면 : gukminMainView MainController.java-------");
		return "/gukminview/gukminMainView";
	}
	
	/**
	 * @param 없음
	 * @file MainController.java
	 * @name adminMainView
	 * @brief 관리자 메인화면
	 * @author ksmart33 김동석
	 * @return adminview/adminMainView
	 */
	@GetMapping("adminview/adminMainView")
	public String adminMainView() {
		System.out.println("---국민메인화면 : adminMainView MainController.java-------");
		return "/adminview/adminMainView";
	}

	/**
	 * @param 없음
	 * @file MainController.java
	 * @name gukminMainView
	 * @brief test
	 * @author ksmart33 김동석
	 * @return index
	 */
	@GetMapping("/index2")
	public String test222() {
		System.out.println("---test222 : test222 MainController.java-------");
		return "index2";
	}
	
	

}
