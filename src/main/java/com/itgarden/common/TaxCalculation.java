package com.itgarden.common;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculation {

	private double unitPrice = 0d;
	private float taxPercentage = 0f;
	private double totalAmount = 0d;
	private double price = 0d;
	private double taxAmount = 0d;
	private int quantity;

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(float taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "TaxCalculation [unitPrice=" + unitPrice + ", taxPercentage=" + taxPercentage + ", totalAmount="
				+ totalAmount + ", price=" + price + ", taxAmount=" + taxAmount + ", quantity=" + quantity + "]";
	}

	public TaxCalculationResponse calculateTax(TaxCalculationInput calculationInput) {
		TaxCalculationResponse taxCalculationResponse = new TaxCalculationResponse();
		double unitPrice = calculationInput.getUnitPrice();
		float taxPercentage = calculationInput.getTaxPercentage();
		int quantity = calculationInput.getQuantity();
		double taxAmount = 0d;
		taxCalculationResponse.setTotalAmount(unitPrice * quantity);
		if (taxPercentage > 0) {
			taxAmount = (unitPrice * taxPercentage) / 100; // Tqx amount
			taxCalculationResponse.setTaxAmount(quantity * taxAmount);
			// getPrice return Unit Price with Tax and multiplying with quantity which is
			// tatal amount
			taxCalculationResponse.setTotalAmount(quantity * unitPrice);
			taxCalculationResponse
					.setGrandTotal(taxCalculationResponse.getTotalAmount() + taxCalculationResponse.getTaxAmount());
		}
		return taxCalculationResponse;
	}
}
