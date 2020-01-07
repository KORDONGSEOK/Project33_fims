package shop.fims.acontract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.acontract.service.PrivateContractService;

@Controller
public class PrivateContractController {

	@Autowired
	private PrivateContractService privateContractService;
	/**
	 * @param 없음
	 * @file PrivateContractController.java
	 * @name orderingPlanView
	 * @brief 수의계약->발주계획
	 * @author ksmart33 김동석
	 * @return acontractview/private/orderingPlanView
	 */
	@GetMapping("/acontractview/private/orderingPlanView")
	public String orderingPlanView() {
		System.out.println("---수의계약->발주계획 : orderingPlanView 메서드 PrivateContractController.java---");
		return "acontractview/private/orderingPlanView";
	}

	/**
	 * @param 없음
	 * @file PrivateContractController.java
	 * @name privateContractView
	 * @brief 수의계약현황
	 * @author ksmart33 김동석
	 * @return acontractview/private/privateContractView
	 */
	@GetMapping("/acontractview/private/privateContractView")
	public String privateContractView() {
		System.out.println("---수의계약현황 : privateContractView 메서드 PrivateContractController.java---");
		return "acontractview/private/privateContractView";
	}
	
	/**
	 * @param 없음
	 * @file PrivateContractController.java
	 * @name contractComReceipt
	 * @brief 수의계약->계약희망업체접수
	 * @author ksmart33 김동석
	 * @return acontractview/private/contractComReceipt
	 */
	@GetMapping("/acontractview/private/contractComReceipt")
	public String contractComReceipt() {
		System.out.println("---수의계약->계약희망업체접수 : contractComReceipt 메서드 PrivateContractController.java---");
		return "acontractview/private/contractComReceipt";
	}
	

}
