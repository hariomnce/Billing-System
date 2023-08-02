package com.itgarden.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address extends BaseObject {

	@Column(name = "ADDRESS1", nullable = false)
	private String address1;

	@Column(name = "ADDRESS2", nullable = true)
	private String address2;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "STATE", nullable = false)
	private String state;

	@Column(name = "COUNTRY", nullable = false)
	private String country;

	@Column(name = "LANDMARK", nullable = true)
	private String landmark;

	@Column(name = "MOBILE", nullable = false)
	private String mobile;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID")
	private User user;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", landmark=" + landmark + ", mobile=" + mobile + ", user=" + user + "]";
	}

}
