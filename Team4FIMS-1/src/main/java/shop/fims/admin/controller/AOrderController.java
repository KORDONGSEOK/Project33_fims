package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AOrderService;

@Controller
public class AOrderController {

	@Autowired
	private AOrderService aOrderService;
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
