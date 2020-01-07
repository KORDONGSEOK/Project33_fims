package shop.fims.acontract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.acontract.service.GeneralContractService;

@Controller
public class GeneralContractController {

	@Autowired
	private GeneralContractService generalContractService;
	
	/**
	 * @param 없음
	 * @file GeneralContractController.java
	 * @name generalContractOrdPlan
	 * @brief 일반계약->발주계획
	 * @author ksmart33 김동석
	 * @return acontractview/general/generalContractOrdPlan
	 */
	@GetMapping("/acontractview/general/generalContractOrdPlan")
	public String generalContractOrdPlan() {
		System.out.println("---일반계약->발주계획 : generalContractOrdPlan 메서드 GeneralContractController.java---");
		return "acontractview/general/generalContractOrdPlan";
	}
	
	/**
	 * @param 없음
	 * @file ContractController.java
	 * @name generalContractView
	 * @brief 일반계약현황
	 * @author ksmart33 김동석
	 * @return acontractview/general/generalContractView
	 */
	@GetMapping("/acontractview/general/generalContractView")
	public String generalContractView() {
		System.out.println("---일반계약현황 : generalContractView 메서드 GeneralContractController.java---");
		return "acontractview/general/generalContractView";
	}
}
