package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AOrderController {

	/**
	 * @param 없음
	 * @file AOrderController.java
	 * @name orderListAll
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/order/mobileConfig
	 */
	@GetMapping("adminview/order/orderListAll")
	public String mobileApp() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : orderListAll AOrderController.java-------");
		return "/adminview/order/orderListAll";
	}
}
