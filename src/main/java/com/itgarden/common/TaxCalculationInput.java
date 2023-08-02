package com.itgarden.common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TaxCalculationInput {

	private double unitPrice;
	private float taxPercentage;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "TaxCalculationInput [unitPrice=" + unitPrice + ", taxPercentage=" + taxPercentage + ", quantity="
				+ quantity + "]";
	}

}
