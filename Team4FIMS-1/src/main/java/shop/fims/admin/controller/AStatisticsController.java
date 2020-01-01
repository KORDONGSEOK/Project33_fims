package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AStatisticsController {

	/**
	 * @param 없음
	 * @file AStatisticsController.java
	 * @name statisticsVisitToday
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/statistics/statisticsVisitToday
	 */
	@GetMapping("adminview/statistics/statisticsVisitToday")
	public String mobileApp() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : statisticsVisitToday AStatisticsController.java-------");
		return "/adminview/statistics/statisticsVisitToday";
	}
}
