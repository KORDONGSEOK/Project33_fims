package shop.fims.ebudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.ebudget.service.ExecutionService;

@Controller
public class ExecutionController {

	@Autowired
	private ExecutionService executionService; 
	/**
	 * @param 없음
	 * @file ExecutionController.java
	 * @name revExpExecutionView
	 * @brief 세출현황->예산집행현현황
	 * @author ksmart33 김동석
	 * @return ebudgetview/execution/revExpExecutionView
	 */
	@GetMapping("ebudgetview/execution/revExpExecutionView")
	public String revExpExecutionView() {
		System.out.println("---세출현황->예산집행현현황: revExpExecutionView 메서드 ExecutionController.java---");
		return "/ebudgetview/execution/revExpExecutionView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpExecutionController.java
	 * @name expExecutionView
	 * @brief 세출현황->지출정보
	 * @author ksmart33 김동석
	 * @return ebudgetview/execution/expExecutionView
	 */
	@GetMapping("ebudgetview/execution/expExecutionView")
	public String expExecutionView() {
		System.out.println("---세출현황->지출정보 : expExecutionView 메서드 ExecutionController.java---");
		return "/ebudgetview/execution/expExecutionView";
	}
	
	/**
	 * @param 없음
	 * @file RevExpExecutionController.java
	 * @name fundManStatusView
	 * @brief 자금운용상태
	 * @author ksmart33 김동석
	 * @return ebudgetview/execution/fundManStatusView
	 */
	@GetMapping("ebudgetview/execution/fundManStatusView")
	public String fundManStatusView() {
		System.out.println("---자금운용상태 : fundManStatusView 메서드 ExecutionController.java---");
		return "/ebudgetview/execution/fundManStatusView";
	}
}
