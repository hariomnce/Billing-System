package com.itgarden.common;

public class TaxCalculationResponse {

	private double totalAmount; // unit price * quantity (without Tax)
	private double taxAmount; // Only Tax Amount
	private double grandTotal; // Total amount with Tax

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "TaxCalculationResponse [totalAmount=" + totalAmount + ", taxAmount=" + taxAmount + ", grandTotal="
				+ grandTotal + "]";
	}

}
