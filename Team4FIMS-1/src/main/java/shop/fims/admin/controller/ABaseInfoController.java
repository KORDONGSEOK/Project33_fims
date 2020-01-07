package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.ABaseInfoService;

@Controller
public class ABaseInfoController {

	@Autowired
	private ABaseInfoService aBaseInfoService;
	/**
	 * @param 없음
	 * @file ABaseInfoController.java
	 * @name baseInfo
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/basicsetting/baseInfo
	 */
	@GetMapping("adminview/basicsetting/baseInfo")
	public String baseInfo() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : baseInfo ABaseInfoController.java-------");
		return "/adminview/basicsetting/baseInfo";
	}
}
