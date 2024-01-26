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
		
		return "administration/ibio/memberRegistrationCheck";
	}
	
	@GetMapping("/dealerManager")
	public String dealerManager() {
		
		return "administration/ibio/dealerManager";
	}
	
	@GetMapping("/memberManager")
	public String memberManager() {
		
		return "administration/ibio/memberManager";
	}
	
	@GetMapping("/memberInquiryManager")
	public String memberInquiryManager() {
		
		return "administration/ibio/memberInquiryManager";
	}
	
	@GetMapping("/dealerInquiryManager")
	public String dealerInquiryManager() {
		
		return "administration/ibio/dealerInquiryManager";
	}
	
	@GetMapping("/refundManager")
	public String refundManager() {
		
		return "administration/ibio/refundManager";
	}
	
	@GetMapping("/couponManager")
	public String couponManager() {
		
		return "administration/ibio/couponManager";
	}
	
	@GetMapping("/siteManager")
	public String siteManager() {
		
		return "administration/ibio/siteManager";
	}
	
	@GetMapping("/eventManager")
	public String eventManager() {
		
		return "administration/ibio/eventManager";
	}
	
	@GetMapping("/noticeManager")
	public String noticeManager() {
		
		return "administration/ibio/noticeManager";
	}
	
	@GetMapping("/faqManager")
	public String faqManager() {
		
		return "administration/ibio/faqManager";
	}
	
	@GetMapping("/bannerManager")
	public String bannerManager() {
		
		return "administration/ibio/bannerManager";
	}
	
	@GetMapping("/accessManager")
	public String accessManager() {
		
		return "administration/ibio/accessManager";
	}
	
	@GetMapping("/logManager")
	public String logManager() {
		
		return "administration/ibio/logManager";
	}
	
	@GetMapping("/fileManager")
	public String fileManager() {
		
		return "administration/ibio/fileManager";
	}
	
	@GetMapping("/mamberCalculationManager")
	public String mamberCalculationManager() {
		
		return "administration/ibio/mamberCalculationManager";
	}
	
	@GetMapping("/memberSellingManager")
	public String memberSellingManager() {
		
		return "administration/ibio/memberSellingManager";
	}
	
	@GetMapping("/dealerSellingManager")
	public String dealerSellingManager() {
		
		return "administration/ibio/dealerSellingManager";
	}
	
	@GetMapping("/dealerCalculationManager")
	public String dealerCalculationManager() {
		
		return "administration/ibio/dealerCalculationManager";
	}
	
	@GetMapping("/billManager")
	public String billManager() {
		
		return "administration/ibio/billManager";
	}
	
	@GetMapping("/ibioProductManager")
	public String ibioProductManager() {
		
		return "administration/ibio/ibioProductManager";
	}
	
	@GetMapping("/ibioProductOverview")
	public String ibioProductOverview() {
		
		return "administration/ibio/ibioProductOverview";
	}
	
	@GetMapping("/dealerProductManager")
	public String dealerProductManager() {
		
		return "administration/ibio/dealerProductManager";
	}
	
	@GetMapping("/ibioProductInfoDumpManager")
	public String ibioProductInfoDumpManager() {
		
		return "administration/ibio/ibioProductInfoDumpManager";
	}
	
	@GetMapping("/ibioProductFileDumpManager")
	public String ibioProductFileDumpManager() {
		
		return "administration/ibio/ibioProductFileDumpManager";
	}
	
}
