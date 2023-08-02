package com.itgarden.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class TaxInfo extends BaseInfo {

	@NotEmpty(message = "HSN Code can't be empty")
	private String hsnCode;

	private float taxPercentage;

	@NotEmpty(message = "Tax description can't be empty")
	private String taxDescription;

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public float getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(float taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public String getTaxDescription() {
		return taxDescription;
	}

	public void setTaxDescription(String taxDescription) {
		this.taxDescription = taxDescription;
	}

	@Override
	public String toString() {
		return "TaxInfo [hsnCode=" + hsnCode + ", taxPercentage=" + taxPercentage + ", taxDescription=" + taxDescription
				+ "]";
	}

}
