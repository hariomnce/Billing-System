package com.itgarden.entity;

import com.itgarden.common.staticdata.CodeType;

import javax.persistence.*;

@Entity
@Table(name = "app_entity_code")
public class AppEntityCode extends BaseObject {

	@Column(name = "code", nullable = false)
	private String code;

	@Column(name = "code_type", nullable = false)
	@Enumerated(EnumType.STRING)
	private CodeType codeType;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CodeType getCodeType() {
		return codeType;
	}

	public void setCodeType(CodeType codeType) {
		this.codeType = codeType;
	}

	@Override
	public String toString() {
		return "AppEntityCode [code=" + code + ", codeType=" + codeType + "]";
	}

}
