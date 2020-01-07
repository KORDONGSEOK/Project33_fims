package shop.fims.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import shop.fims.admin.service.AGoodsService;

@Controller
public class AGoodsController {
	
	@Autowired
	private AGoodsService aGoodsService; 
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name GoodsList
	 * @brief 관리자 상품리스트
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsList
	 */
	@GetMapping("adminview/goods/goodsList")
	public String goodsList() {
		System.out.println("---관리자 상품리스트 : goodsList AGoodsController.java-------");
		return "/adminview/goods/goodsList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsRegister
	 * @brief 관리자 상품등록
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsRegister
	 */
	@GetMapping("adminview/goods/goodsRegister")
	public String goodsRegister() {
		System.out.println("---관리자 상품등록 : goodsRegister AGoodsController.java-------");
		return "/adminview/goods/goodsRegister";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsOptionList
	 * @brief 관리자 상품 자주쓰는 옵션관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsOptionList
	 */
	@GetMapping("adminview/goods/goodsOptionList")
	public String goodsOptionList() {
		System.out.println("---관리자 상품 자주쓰는 옵션관리 : goodsOptionList AGoodsController.java-------");
		return "/adminview/goods/goodsOptionList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsIconList
	 * @brief 관리자 상품 아이콘관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsIconList
	 */
	@GetMapping("adminview/goods/goodsIconList")
	public String goodsIconList() {
		System.out.println("---관리자 상품 아이콘관리 : goodsIconList AGoodsController.java-------");
		return "/adminview/goods/goodsIconList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsMustInfoList
	 * @brief 관리자 상품필수정보관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsMustInfoList
	 */
	@GetMapping("adminview/goods/goodsMustInfoList")
	public String goodsMustInfoList() {
		System.out.println("---관리자 상품필수정보관리 : goodsMustInfoList AGoodsController.java-------");
		return "/adminview/goods/goodsMustInfoList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDeleteList
	 * @brief 관리자 상품삭제관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsDeleteList
	 */
	@GetMapping("adminview/goods/goodsDeleteList")
	public String goodsDeleteList() {
		System.out.println("---관리자 상품삭제관리 : goodsDeleteList AGoodsController.java-------");
		return "/adminview/goods/goodsDeleteList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDeleteList
	 * @brief 관리자 상품재입고 알림신청관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsRestock
	 */
	@GetMapping("adminview/goods/goodsRestock")
	public String goodsRestock() {
		System.out.println("---관리자 상품재입고 알림신청관리 : goodsRestock AGoodsController.java-------");
		return "/adminview/goods/goodsRestock";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchPrice
	 * @brief 관리자 상품가격관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchPrice
	 */
	@GetMapping("adminview/goods/goodsBatchPrice")
	public String goodsBatchPrice() {
		System.out.println("---관리자 상품가격관리 : goodsBatchPrice AGoodsController.java-------");
		return "/adminview/goods/goodsBatchPrice";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchMileage
	 * @brief 관리자 상품마일리지/혜택관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchMileage
	 */
	@GetMapping("adminview/goods/goodsBatchMileage")
	public String goodsBatchMileage() {
		System.out.println("---관리자 상품마일리지/혜택관리 : goodsBatchMileage AGoodsController.java-------");
		return "/adminview/goods/goodsBatchMileage";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchStock
	 * @brief 관리자 상품품절/노출/재고관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchStock
	 */
	@GetMapping("adminview/goods/goodsBatchStock")
	public String goodsBatchStock() {
		System.out.println("---관리자 상품품절/노출/재고관리 : goodsBatchStock AGoodsController.java-------");
		return "/adminview/goods/goodsBatchStock";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchLink
	 * @brief 관리자 상품이동/복사/삭제관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchLink
	 */
	@GetMapping("adminview/goods/goodsBatchLink")
	public String goodsBatchLink() {
		System.out.println("---관리자 상품이동/복사/삭제관리 : goodsBatchLink AGoodsController.java-------");
		return "/adminview/goods/goodsBatchLink";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchIcon
	 * @brief 관리자 상품아이콘/대표색상관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchIcon
	 */
	@GetMapping("adminview/goods/goodsBatchIcon")
	public String goodsBatchIcon() {
		System.out.println("---관리자 상품아이콘/대표색상관리 : goodsBatchIcon AGoodsController.java-------");
		return "/adminview/goods/goodsBatchIcon";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchDelivery
	 * @brief 관리자 상품배송비관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchDelivery
	 */
	@GetMapping("adminview/goods/goodsBatchDelivery")
	public String goodsBatchDelivery() {
		System.out.println("---관리자 상품배송비관리 : goodsBatchDelivery AGoodsController.java-------");
		return "/adminview/goods/goodsBatchDelivery";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchImage
	 * @brief 관리자 상품이미지일괄처리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchImage
	 */
	@GetMapping("adminview/goods/goodsBatchImage")
	public String goodsBatchImage() {
		System.out.println("---관리자 상품이미지일괄처리 : goodsBatchImage AGoodsController.java-------");
		return "/adminview/goods/goodsBatchImage";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsBatchImageHostingReplace
	 * @brief 관리자 상품이미지호스팅일괄처리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsBatchImageHostingReplace
	 */
	@GetMapping("adminview/goods/goodsBatchImageHostingReplace")
	public String goodsBatchImageHostingReplace() {
		System.out.println("---관리자 상품이미지호스팅일괄처리 : goodsBatchImageHostingReplace AGoodsController.java-------");
		return "/adminview/goods/goodsBatchImageHostingReplace";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDisplayMainList
	 * @brief 관리자 : 상품>상품 진열 관리>메인페이지 상품진열
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsDisplayMainList
	 */
	@GetMapping("adminview/goods/goodsDisplayMainList")
	public String goodsDisplayMainList() {
		System.out.println("---관리자 : 상품>상품 진열 관리>메인페이지 상품진열 : goodsDisplayMainList AGoodsController.java-------");
		return "/adminview/goods/goodsDisplayMainList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDisplayCategory
	 * @brief 관리자 : 상품>상품 진열 관리>카테고리페이지 상품진열
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsDisplayCategory
	 */
	@GetMapping("adminview/goods/goodsDispalyCategory")
	public String goodsDisplayCategory() {
		System.out.println("---관리자 : 상품>상품 진열 관리>카테고리페이지 상품진열 : goodsDisplayCategory AGoodsController.java-------");
		return "/adminview/goods/goodsDisplayCategory";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDisplayBrand
	 * @brief 관리자 : 상품>상품 진열 관리>브랜드페이지 상품진열
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsDisplayBrand
	 */
	@GetMapping("adminview/goods/goodsDisplayBrand")
	public String goodsDisplayBrand() {
		System.out.println("---관리자 : 상품>상품 진열 관리>브랜드페이지 상품진열 : goodsDisplayBrand AGoodsController.java-------");
		return "/adminview/goods/goodsDisplayBrand";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDisplaySearch
	 * @brief 관리자 : 상품>상품 진열 관리>검색페이지 상품진열
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsDisplayBrand
	 */
	@GetMapping("adminview/goods/goodsDisplaySearch")
	public String goodsDisplaySearch() {
		System.out.println("---관리자 : 상품>상품 진열 관리>검색페이지 상품진열 : goodsDisplaySearch AGoodsController.java-------");
		return "/adminview/goods/goodsDisplaySearch";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsDisplaySoldout
	 * @brief 관리자 : 상품>상품 진열 관리>품절상품 상품진열
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsDisplaySoldout
	 */
	@GetMapping("adminview/goods/goodsDisplaySoldout")
	public String goodsDisplaySoldout() {
		System.out.println("---관리자 : 상품>상품 진열 관리>품절상품 상품진열 : goodsDisplaySoldout AGoodsController.java-------");
		return "/adminview/goods/goodsDisplaySoldout";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsSortConfigNavi
	 * @brief 관리자 : 상품>상품 분류 관리>분류 설정 관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsSortConfigNavi
	 */
	@GetMapping("adminview/goods/goodsSortConfigNavi")
	public String goodsSortConfigNavi() {
		System.out.println("---관리자 : 상품>상품 분류 관리>분류 설정 관리 : goodsSortConfigNavi AGoodsController.java-------");
		return "/adminview/goods/goodsSortConfigNavi";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsSortCategoryTree
	 * @brief 관리자 : 상품>상품 분류 관리>카테고리 관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsSortCategoryTree
	 */
	@GetMapping("adminview/goods/goodsSortCategoryTree")
	public String goodsSortCategoryTree() {
		System.out.println("---관리자 : 상품>상품 분류 관리>카테고리 관리 : goodsSortCategoryTree AGoodsController.java-------");
		return "/adminview/goods/goodsSortCategoryTree";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsSortPurchaseList
	 * @brief 관리자 : 상품>상품 분류 관리>매입처 관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsSortPurchaseList
	 */
	@GetMapping("adminview/goods/goodsSortPurchaseList")
	public String goodsSortPurchaseList() {
		System.out.println("---관리자 : 상품>상품 분류 관리>매입처 관리 : goodsSortPurchaseList AGoodsController.java-------");
		return "/adminview/goods/goodsSortPurchaseList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsExposureThemeList
	 * @brief 관리자 : 상품>상품 노출형태 관리>테마관리
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsExposureThemeList
	 */
	@GetMapping("adminview/goods/goodsExposureThemeList")
	public String goodsExposureThemeList() {
		System.out.println("---관리자 : 상품>상품 노출형태 관리>테마관리 : goodsExposureThemeList AGoodsController.java-------");
		return "/adminview/goods/goodsExposureThemeList";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsExposureSearchSettings
	 * @brief 관리자 : 상품>상품 노출형태 관리>검색창 관련 설정
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsExposureSearchSettings
	 */
	@GetMapping("adminview/goods/goodsExposureSearchSettings")
	public String goodsExposureSearchSettings() {
		System.out.println("---관리자 : 상품>상품 노출형태 관리>검색창 관련 설정 : goodsExposureSearchSettings AGoodsController.java-------");
		return "/adminview/goods/goodsExposureSearchSettings";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsExcelDown
	 * @brief 관리자 : 상품>상품 엑셀 관리>상품 다운로드
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsExcelDown
	 */
	@GetMapping("adminview/goods/goodsExcelDown")
	public String goodsExcelDown() {
		System.out.println("---관리자 : 상품>상품 엑셀 관리>상품 다운로드 : goodsExcelDown AGoodsController.java-------");
		return "/adminview/goods/goodsExcelDown";
	}
	
	/**
	 * @param 없음
	 * @file AGoodsController.java
	 * @name goodsExcelUpload
	 * @brief 관리자 : 상품>상품 엑셀 관리>상품 업로드
	 * @author ksmart33 김동석
	 * @return adminview/goods/goodsExcelUpload
	 */
	@GetMapping("adminview/goods/goodsExcelUpload")
	public String goodsExcelUpload() {
		System.out.println("---관리자 : 상품>상품 엑셀 관리>상품 업로드 : goodsExcelUpload AGoodsController.java-------");
		return "/adminview/goods/goodsExcelUpload";
	}

}



















