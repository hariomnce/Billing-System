package com.itgarden.entity;

import javax.persistence.*;

@Entity
@Table(name = "vendor")
public class Vendor extends BaseObject {

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "vendor_code", nullable = false)
	private String vendorCode;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Vendor [fullName=" + fullName + ", vendorCode=" + vendorCode + ", user=" + user + "]";
	}

}
