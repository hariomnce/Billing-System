package com.itgarden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tax")
public class Tax extends BaseObject {

	@Column(name = "hsn_code", nullable = false)
	private String hsnCode;

	@Column(name = "tax_percentage", nullable = false)
	private float taxPercentage;

	@Column(name = "tax_description", nullable = false)
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
		return "Tax [hsnCode=" + hsnCode + ", taxPercentage=" + taxPercentage + ", taxDescription=" + taxDescription
				+ "]";
	}

}
