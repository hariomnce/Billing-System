package com.itgarden.entity;

import javax.persistence.Column;

public class EntityCode extends BaseObject {

	@Column(name = "code", unique = true, nullable = false)
	String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "EntityCode [code=" + code + "]";
	}

}
