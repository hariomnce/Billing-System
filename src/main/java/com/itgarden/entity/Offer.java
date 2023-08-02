package com.itgarden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer extends BaseObject {

	@Column(name = "offer_code", nullable = false)
	private String offerCode;

	@Column(name = "offer_name", nullable = false)
	private String offerName;

	@Column(name = "offer_description", nullable = false)
	private String offerDescription;

	@Column(name = "status", nullable = false)
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
		return "Offer [offerCode=" + offerCode + ", offerName=" + offerName + ", offerDescription=" + offerDescription
				+ ", status=" + status + "]";
	}

}
