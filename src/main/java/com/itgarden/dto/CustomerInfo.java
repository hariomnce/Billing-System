package com.itgarden.dto;

public class CustomerInfo extends BaseInfo {

	private String fullName;
	private String customerCode;
	private UserInfo user;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CustomerInfo [fullName=" + fullName + ", customerCode=" + customerCode + ", user=" + user + "]";
	}

}
