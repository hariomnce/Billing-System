package com.itgarden.entity;

import javax.persistence.*;

@Entity
@Table(name = "biller")
public class Biller extends BaseObject {

	@Column(name = "bill_no", nullable = false)
	private String billNo;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@Column(name = "grand_total", nullable = false)
	private double grandTotal;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "total_tax_amount", nullable = false)
	private double totalTaxAmount;

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
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
		return "Biller [billNo=" + billNo + ", customer=" + customer + ", grandTotal=" + grandTotal + ", quantity="
				+ quantity + ", totalTaxAmount=" + totalTaxAmount + "]";
	}

}
