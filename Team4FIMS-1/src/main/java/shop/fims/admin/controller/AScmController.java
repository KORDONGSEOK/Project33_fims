package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AScmService;

@Controller
public class AScmController {

	@Autowired
	private AScmService aScmService;
	/**
	 * @param 없음
	 * @file AScmController.java
	 * @name scmList
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/scm/promotionCouponList
	 */
	@GetMapping("adminview/scm/scmList")
	public String mobileApp() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : scmList AScmController.java-------");
		return "/adminview/scm/scmList";
	}
}
