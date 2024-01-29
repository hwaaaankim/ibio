package com.dev.IBIOECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping({"" , "/", "/index"})
	public String adminIndex() {
		
		return "administration/common/index";
	} 
	
	@GetMapping("/memberRegistrationCheck")
	public String memberRegistrationCheck() {
		
		return "administration/ibio/member/select/memberRegistrationCheck";
	}
	
	@GetMapping("/memberRegistrationCheckDetail")
	public String memberRegistrationCheckDetail() {
		
		return "administration/ibio/member/detail/memberRegistrationCheckDetail";
	}
	
	
	@GetMapping("/dealerManager")
	public String dealerManager() {
		
		return "administration/ibio/member/select/dealerManager";
	}
	
	@GetMapping("/dealerManagerDetail")
	public String dealerManagerDetail() {
		
		return "administration/ibio/member/detail/dealerManagerDetail";
	}
	
	
	@GetMapping("/memberManager")
	public String memberManager() {
		
		return "administration/ibio/member/select/memberManager";
	}
	
	@GetMapping("/memberManagerDetail")
	public String memberManagerDetail() {
		
		return "administration/ibio/member/detail/memberManagerDetail";
	}
	
	@GetMapping("/memberInquiryManager")
	public String memberInquiryManager() {
		
		return "administration/ibio/member/select/memberInquiryManager";
	}
	
	@GetMapping("/memberInquiryManagerDetail")
	public String memberInquiryManagerDetail() {
		
		return "administration/ibio/member/detail/memberInquiryManagerDetail";
	}
	
	@GetMapping("/dealerInquiryManager")
	public String dealerInquiryManager() {
		
		return "administration/ibio/member/select/dealerInquiryManager";
	}
	
	@GetMapping("/dealerInquiryManagerDetail")
	public String dealerInquiryManagerDetail() {
		
		return "administration/ibio/member/detail/dealerInquiryManagerDetail";
	}
	
	@GetMapping("/refundManager")
	public String refundManager() {
		
		return "administration/ibio/member/select/refundManager";
	}
	
	@GetMapping("/refundManagerDetail")
	public String refundManagerDetail() {
		
		return "administration/ibio/member/detail/refundManagerDetail";
	}
	
	
	@GetMapping("/couponManager")
	public String couponManager() {
		
		return "administration/ibio/member/select/couponManager";
	}
	
	@GetMapping("/couponManagerInsert")
	public String couponManagerInsert() {
		
		return "administration/ibio/member/insert/couponManagerInsert";
	}
	
	@GetMapping("/couponManagerDetail")
	public String couponManagerDetail() {
		
		return "administration/ibio/member/detail/couponManagerDetail";
	}
	
	@GetMapping("/siteManager")
	public String siteManager() {
		
		return "administration/ibio/basic/select/siteManager";
	}
	
	@GetMapping("/eventManager")
	public String eventManager() {
		
		return "administration/ibio/basic/select/eventManager";
	}
	
	@GetMapping("/eventManagerInsert")
	public String eventManagerInsert() {
		
		return "administration/ibio/basic/insert/eventManagerInsert";
	}
	
	@GetMapping("/eventManagerDetail")
	public String eventManagerDetail() {
		
		return "administration/ibio/basic/detail/eventManagerDetail";
	}
	
	@GetMapping("/noticeManager")
	public String noticeManager() {
		
		return "administration/ibio/basic/select/noticeManager";
	}
	
	@GetMapping("/noticeManagerInsert")
	public String noticeManagerInsert() {
		
		return "administration/ibio/basic/insert/noticeManagerInsert";
	}
	
	@GetMapping("/noticeManagerDetail")
	public String noticeManagerDetail() {
		
		return "administration/ibio/basic/detail/noticeManagerDetail";
	}
	
	@GetMapping("/faqManager")
	public String faqManager() {
		
		return "administration/ibio/basic/select/faqManager";
	}
	
	@GetMapping("/faqManagerInsert")
	public String faqManagerInsert() {
		
		return "administration/ibio/basic/select/faqManagerInsert";
	}
	
	@GetMapping("/faqManagerDetail")
	public String faqManagerDetail() {
		
		return "administration/ibio/basic/detail/faqManagerDetail";
	}
	
	@GetMapping("/bannerManager")
	public String bannerManager() {
		
		return "administration/ibio/basic/select/bannerManager";
	}
	
	@GetMapping("/accessManager")
	public String accessManager() {
		
		return "administration/ibio/advanced/select/accessManager";
	}
	
	@GetMapping("/accessManagerDetail")
	public String accessManagerDetail() {
		
		return "administration/ibio/advanced/detail/accessManagerDetail";
	}
	
	@GetMapping("/logManager")
	public String logManager() {
		
		return "administration/ibio/advanced/select/logManager";
	}
	
	@GetMapping("/logManagerDetail")
	public String logManagerDetail() {
		
		return "administration/ibio/advanced/detail/logManagerDetail";
	}
	
	@GetMapping("/fileManager")
	public String fileManager() {
		
		return "administration/ibio/advanced/select/fileManager";
	}
	
	@GetMapping("/fileManagerDetail")
	public String fileManagerDetail() {
		
		return "administration/ibio/advanced/select/fileManagerDetail";
	}
	
	@GetMapping("/mamberCalculationManager")
	public String mamberCalculationManager() {
		
		return "administration/ibio/basic/select/mamberCalculationManager";
	}
	
	@GetMapping("/dealerCalculationManager")
	public String dealerCalculationManager() {
		
		return "administration/ibio/basic/select/dealerCalculationManager";
	}
	
	@GetMapping("/memberSellingManager")
	public String memberSellingManager() {
		
		return "administration/ibio/basic/select/memberSellingManager";
	}
	
	@GetMapping("/dealerSellingManager")
	public String dealerSellingManager() {
		
		return "administration/ibio/basic/select/dealerSellingManager";
	}
	
	
	@GetMapping("/billManager")
	public String billManager() {
		
		return "administration/ibio/basic/select/billManager";
	}
	
	@GetMapping("/ibioProductManager")
	public String ibioProductManager() {
		
		return "administration/ibio/product/select/ibioProductManager";
	}
	
	@GetMapping("/ibioProductManagerInsert")
	public String ibioProductManagerInsert() {
		
		return "administration/ibio/product/insert/ibioProductManagerInsert";
	}
	
	@GetMapping("/ibioProductManagerDetail")
	public String ibioProductManagerDetail() {
		
		return "administration/ibio/product/detail/ibioProductManagerDetail";
	}
	
	@GetMapping("/ibioProductCategoryManager")
	public String ibioProductCategoryManager() {
		
		return "administration/ibio/product/select/ibioProductCategoryManager";
	}
	
	@GetMapping("/dealerProductManager")
	public String dealerProductManager() {
		
		return "administration/ibio/product/select/dealerProductManager";
	}
	
	@GetMapping("/dealerProductManagerDetail")
	public String dealerProductManagerDetail() {
		
		return "administration/ibio/product/detail/dealerProductManagerDetail";
	}
	
	@GetMapping("/ibioProductInfoDumpManager")
	public String ibioProductInfoDumpManager() {
		
		return "administration/ibio/product/select/ibioProductInfoDumpManager";
	}
	
	@GetMapping("/ibioProductFileDumpManager")
	public String ibioProductFileDumpManager() {
		
		return "administration/ibio/product/select/ibioProductFileDumpManager";
	}
	
}
