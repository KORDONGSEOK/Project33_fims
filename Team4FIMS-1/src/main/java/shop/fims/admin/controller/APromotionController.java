package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class APromotionController {

	/**
	 * @param 없음
	 * @file APromotionController.java
	 * @name promotionCouponList
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/promotion/promotionCouponList
	 */
	@GetMapping("adminview/promotion/promotionCouponList")
	public String mobileApp() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : promotionCouponList APromotionController.java-------");
		return "/adminview/promotion/promotionCouponList";
	}
}
