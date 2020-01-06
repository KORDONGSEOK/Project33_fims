package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AServiceService;

@Controller
public class AServiceController {

	@Autowired
	private AServiceService aServiceService;
	/**
	 * @param 없음
	 * @file AServiceController.java
	 * @name serviceInfo
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/promotion/serviceInfo
	 */
	@GetMapping("adminview/service/serviceInfo")
	public String serviceInfo() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : serviceInfo AServiceController.java-------");
		return "/adminview/service/serviceInfo";
	}
}
