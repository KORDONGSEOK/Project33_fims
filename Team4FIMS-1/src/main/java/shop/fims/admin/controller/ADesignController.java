package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ADesignController {

	/**
	 * @param 없음
	 * @file ADesignController.java
	 * @name designSkinList
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/design/designSkinList
	 */
	@GetMapping("adminview/design/designSkinList")
	public String designSkinList() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : designSkinList ADesignController.java-------");
		return "/adminview/design/designSkinList";
	}
}
