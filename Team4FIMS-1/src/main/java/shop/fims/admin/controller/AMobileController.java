package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AMobileService;

@Controller
public class AMobileController {

	@Autowired
	private AMobileService aMobileService;
	/**
	 * @param 없음
	 * @file AMobileController.java
	 * @name mobileConfig
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/mobile/mobileConfig
	 */
	@GetMapping("adminview/mobile/mobileConfig")
	public String mobileApp() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : mobileConfig AMobileController.java-------");
		return "/adminview/mobile/mobileConfig";
	}
}
