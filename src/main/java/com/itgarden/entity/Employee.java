package com.itgarden.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends BaseObject {

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "employee_code", nullable = false)
	private String employeeCode;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", employeeCode=" + employeeCode + ", user=" + user + "]";
	}

}
