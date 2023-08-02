package com.itgarden.dto;

public class OrganizationInfo extends BaseInfo {

	private String orgCode;
	private String orgName;
	private UserInfo user;

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

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrganizationInfo [orgCode=" + orgCode + ", orgName=" + orgName + ", user=" + user + "]";
	}

}
