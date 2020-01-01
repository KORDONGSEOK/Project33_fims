package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AMobileController {

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
