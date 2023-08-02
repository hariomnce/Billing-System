package com.itgarden.dto;

public class VendorInfo extends BaseInfo {

	private String fullName;
	private String vendorCode;
	private UserInfo user;

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

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "VendorInfo [fullName=" + fullName + ", vendorCode=" + vendorCode + ", user=" + user + "]";
	}

}
