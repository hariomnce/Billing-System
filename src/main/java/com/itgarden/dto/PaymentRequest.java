package com.itgarden.dto;

import java.util.List;

public class PaymentRequest {

	private List<String> productItemCode; // This is a Barcode
	private String customerMobileNo;
	private int quantity;

	public List<String> getProductItemCode() {
		return productItemCode;
	}

	public void setProductItemCode(List<String> productItemCode) {
		this.productItemCode = productItemCode;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PaymentRequest [productItemCode=" + productItemCode + ", customerMobileNo=" + customerMobileNo
				+ ", quantity=" + quantity + "]";
	}

}
