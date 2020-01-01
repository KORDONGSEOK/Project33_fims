package shop.fims.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ABoardController {

	/**
	 * @param 없음
	 * @file ABoardController.java
	 * @name boardList
	 * @brief 관리자 : 기본설정>기본정책>기본 정보 설정
	 * @author ksmart33 김동석
	 * @return adminview/board/boardList
	 */
	@GetMapping("adminview/board/boardList")
	public String boardList() {
		System.out.println("---관리자 : 기본설정>기본정책>기본 정보 설정 : boardList ABoardController.java-------");
		return "/adminview/board/boardList";
	}
}
