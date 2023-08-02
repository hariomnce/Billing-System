package com.itgarden.dto;

import javax.validation.constraints.NotEmpty;

public class OfferInfo extends BaseInfo {

	private String offerCode;

	@NotEmpty(message = "Offer name can't be empty")
	private String offerName;

	@NotEmpty(message = "Offer Description can't be empty")
	private String offerDescription;

	private String status;

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OfferInfo [offerCode=" + offerCode + ", offerName=" + offerName + ", offerDescription="
				+ offerDescription + ", status=" + status + "]";
	}

}
