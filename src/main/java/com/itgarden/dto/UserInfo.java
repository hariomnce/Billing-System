package com.itgarden.dto;

import java.util.List;

//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo extends BaseInfo {

	private String emailId;
	private String password;
	private String rePassword;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNo;
	private List<AddressInfo> addressList;
	private List<RoleInfo> roles;
	private EmployeeInfo employee;
	private String userType;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public List<AddressInfo> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressInfo> addressList) {
		this.addressList = addressList;
	}

	public List<RoleInfo> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleInfo> roles) {
		this.roles = roles;
	}

	public EmployeeInfo getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeInfo employee) {
		this.employee = employee;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "UserInfo [emailId=" + emailId + ", password=" + password + ", rePassword=" + rePassword + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", mobileNo=" + mobileNo
				+ ", addressList=" + addressList + ", roles=" + roles + ", employee=" + employee + ", userType="
				+ userType + "]";
	}

}
