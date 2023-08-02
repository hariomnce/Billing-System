package com.itgarden.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer extends BaseObject {

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "customer_code", nullable = false)
	private String customerCode;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Customer [fullName=" + fullName + ", customerCode=" + customerCode + ", user=" + user + "]";
	}

}
