package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AMarketingService;

@Controller
public class AMarketingController {

	@Autowired
	private AMarketingService aMarketingService;
	/**
	 * @param 없음
	 * @file AMarketingController.java
	 * @name marketingInfo
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/marketing/marketingInfo
	 */
	@GetMapping("adminview/marketing/marketingInfo")
	public String designSkinList() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : marketingInfo AMarketingController.java-------");
		return "/adminview/marketing/marketingInfo";
	}
}
