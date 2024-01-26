package com.dev.IBIOECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dealer")
public class DealerController {

	@GetMapping({"", "/index", "/"})
	public String dealerIndex() {
		
		return "administration/common/index";
	}
	
	@GetMapping("/memberInquiryManager")
	public String memberInquiryManager() {
		
		return "administration/dealer/memberInquiryManager";
	}
	
	@GetMapping("/refundManager")
	public String refundManager() {
		
		return "administration/dealer/refundManager";
	}
	
	@GetMapping("/couponManager")
	public String couponManager() {
		
		return "administration/dealer/couponManager";
	}
	
	@GetMapping("/dealerProductManager")
	public String dealerProductManager() {
		
		return "administration/dealer/dealerProductManager";
	}
	
	@GetMapping("/dealerProductDetail")
	public String dealerProductDetail() {
		
		return "administration/dealer/dealerProductDetail";
	}
	
	@GetMapping("/dealerProductInsert")
	public String dealerProductInsert() {
		
		return "administration/dealer/dealerProductInsert";
	}
	
	@PostMapping("/dealerProductUpdate")
	public String dealerProductUpdate() {
		
		return "administration/dealer/dealerProductManager";
	}
	
	@GetMapping("/dealerProductDelete")
	public String dealerProductDelete() {
		
		return "administration/dealer/dealerProductManager";
	}
	
	@GetMapping("/dealerProductInfoDumpManager")
	public String dealerProductInfoDumpManager() {
		
		return "administration/dealer/dealerProductInfoDumpManager";
	}

	@GetMapping("/dealerProductFileDumpManager")
	public String dealerProductFileDumpManager() {
		
		return "administration/dealer/dealerProductFileDumpManager";
	}
	
	@GetMapping("/dealerPaymentManager")
	public String dealerPaymentManager() {
		
		return "administration/dealer/dealerPaymentManager";
	}
	
	@GetMapping("/dealerSellingManager")
	public String dealerSellingManager() {
		
		return "administration/dealer/dealerSellingManager";
	}
	
	@GetMapping("/dealerCalculationManager")
	public String dealerCalculationManager() {
		
		return "administration/dealer/dealerCalculationManager";
	}
	
	@GetMapping("/dealerBillManager")
	public String dealerBillManager() {
		
		return "administration/dealer/dealerBillManager";
	}
}


























