package com.itgarden.entity;

import javax.persistence.*;

@Entity
@Table(name = "organization")
public class Organization extends BaseObject {

	@Column(name = "org_code", nullable = false)
	private String orgCode;

	@Column(name = "org_name", nullable = false)
	private String orgName;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Organization [orgCode=" + orgCode + ", orgName=" + orgName + ", user=" + user + "]";
	}

}
