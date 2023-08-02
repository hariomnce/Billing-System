package com.itgarden.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "system_codes")
public class SystemCodes extends BaseObject {

	@Column(name = "code_prefix", nullable = false)
	private String codePrefix;

	@Column(name = "code_type", nullable = false)
	private String codeType;

	public String getCodePrefix() {
		return codePrefix;
	}

	public void setCodePrefix(String codePrefix) {
		this.codePrefix = codePrefix;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	@Override
	public String toString() {
		return "SystemCodes [codePrefix=" + codePrefix + ", codeType=" + codeType + "]";
	}

}
