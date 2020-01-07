package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AMobileappService;

@Controller
public class AMobileappController {

	@Autowired
	private AMobileappService aMobileappService;
	
	/**
	 * @param 없음
	 * @file AMobileappController.java
	 * @name mobileApp
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/mobileapp/mobileApp
	 */
	@GetMapping("adminview/mobileapp/mobileApp")
	public String mobileApp() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : mobileApp AMobileappController.java-------");
		return "/adminview/mobileapp/mobileApp";
	}
}
