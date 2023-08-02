package com.itgarden.dto;

import com.itgarden.entity.BaseObject;
import com.itgarden.entity.Customer;
import com.itgarden.entity.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

public class BillerInfo extends BaseInfo {

	private String billNo;
	private CustomerInfo customer;
	private double grandTotal;
	private int quantity;
	private double totalTaxAmount;

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	@Override
	public String toString() {
		return "BillerInfo [billNo=" + billNo + ", customer=" + customer + ", grandTotal=" + grandTotal + ", quantity="
				+ quantity + ", totalTaxAmount=" + totalTaxAmount + "]";
	}

}
