package com.itgarden;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties("system")
@PropertySource(value = "classpath:systemcode.yml", factory = YamlPropertySourceFactory.class)
public class SystemCodeConfiguration {

	public String empCodePrefix;
	public String empCodeType;

	public String cusCodePrefix;
	public String cusCodeType;

	public String venCodePrefix;
	public String venCodeType;

	public String catCodePrefix;
	public String catCodeType;

	public String ofrCodePrefix;
	public String ofrCodeType;

	public String prdCodePrefix;
	public String prdCodeType;

	public String bcdCodePrefix;
	public String bcdCodeType;

	public String orgCodePrefix;
	public String orgCodeType;

	public String purCodePrefix;
	public String purCodeType;

	public String bilCodePrefix;
	public String bilCodeType;

	public String kotCodePrefix;
	public String kotCodeType;

	public String getEmpCodePrefix() {
		return empCodePrefix;
	}

	public void setEmpCodePrefix(String empCodePrefix) {
		this.empCodePrefix = empCodePrefix;
	}

	public String getEmpCodeType() {
		return empCodeType;
	}

	public void setEmpCodeType(String empCodeType) {
		this.empCodeType = empCodeType;
	}

	public String getCusCodePrefix() {
		return cusCodePrefix;
	}

	public void setCusCodePrefix(String cusCodePrefix) {
		this.cusCodePrefix = cusCodePrefix;
	}

	public String getCusCodeType() {
		return cusCodeType;
	}

	public void setCusCodeType(String cusCodeType) {
		this.cusCodeType = cusCodeType;
	}

	public String getVenCodePrefix() {
		return venCodePrefix;
	}

	public void setVenCodePrefix(String venCodePrefix) {
		this.venCodePrefix = venCodePrefix;
	}

	public String getVenCodeType() {
		return venCodeType;
	}

	public void setVenCodeType(String venCodeType) {
		this.venCodeType = venCodeType;
	}

	public String getCatCodePrefix() {
		return catCodePrefix;
	}

	public void setCatCodePrefix(String catCodePrefix) {
		this.catCodePrefix = catCodePrefix;
	}

	public String getCatCodeType() {
		return catCodeType;
	}

	public void setCatCodeType(String catCodeType) {
		this.catCodeType = catCodeType;
	}

	public String getOfrCodePrefix() {
		return ofrCodePrefix;
	}

	public void setOfrCodePrefix(String ofrCodePrefix) {
		this.ofrCodePrefix = ofrCodePrefix;
	}

	public String getOfrCodeType() {
		return ofrCodeType;
	}

	public void setOfrCodeType(String ofrCodeType) {
		this.ofrCodeType = ofrCodeType;
	}

	public String getPrdCodePrefix() {
		return prdCodePrefix;
	}

	public void setPrdCodePrefix(String prdCodePrefix) {
		this.prdCodePrefix = prdCodePrefix;
	}

	public String getPrdCodeType() {
		return prdCodeType;
	}

	public void setPrdCodeType(String prdCodeType) {
		this.prdCodeType = prdCodeType;
	}

	public String getBcdCodePrefix() {
		return bcdCodePrefix;
	}

	public void setBcdCodePrefix(String bcdCodePrefix) {
		this.bcdCodePrefix = bcdCodePrefix;
	}

	public String getBcdCodeType() {
		return bcdCodeType;
	}

	public void setBcdCodeType(String bcdCodeType) {
		this.bcdCodeType = bcdCodeType;
	}

	public String getOrgCodePrefix() {
		return orgCodePrefix;
	}

	public void setOrgCodePrefix(String orgCodePrefix) {
		this.orgCodePrefix = orgCodePrefix;
	}

	public String getOrgCodeType() {
		return orgCodeType;
	}

	public void setOrgCodeType(String orgCodeType) {
		this.orgCodeType = orgCodeType;
	}

	public String getPurCodePrefix() {
		return purCodePrefix;
	}

	public void setPurCodePrefix(String purCodePrefix) {
		this.purCodePrefix = purCodePrefix;
	}

	public String getPurCodeType() {
		return purCodeType;
	}

	public void setPurCodeType(String purCodeType) {
		this.purCodeType = purCodeType;
	}

	public String getBilCodePrefix() {
		return bilCodePrefix;
	}

	public void setBilCodePrefix(String bilCodePrefix) {
		this.bilCodePrefix = bilCodePrefix;
	}

	public String getBilCodeType() {
		return bilCodeType;
	}

	public void setBilCodeType(String bilCodeType) {
		this.bilCodeType = bilCodeType;
	}

	public String getKotCodePrefix() {
		return kotCodePrefix;
	}

	public void setKotCodePrefix(String kotCodePrefix) {
		this.kotCodePrefix = kotCodePrefix;
	}

	public String getKotCodeType() {
		return kotCodeType;
	}

	public void setKotCodeType(String kotCodeType) {
		this.kotCodeType = kotCodeType;
	}

	@Override
	public String toString() {
		return "SystemCodeConfiguration [empCodePrefix=" + empCodePrefix + ", empCodeType=" + empCodeType
				+ ", cusCodePrefix=" + cusCodePrefix + ", cusCodeType=" + cusCodeType + ", venCodePrefix="
				+ venCodePrefix + ", venCodeType=" + venCodeType + ", catCodePrefix=" + catCodePrefix + ", catCodeType="
				+ catCodeType + ", ofrCodePrefix=" + ofrCodePrefix + ", ofrCodeType=" + ofrCodeType + ", prdCodePrefix="
				+ prdCodePrefix + ", prdCodeType=" + prdCodeType + ", bcdCodePrefix=" + bcdCodePrefix + ", bcdCodeType="
				+ bcdCodeType + ", orgCodePrefix=" + orgCodePrefix + ", orgCodeType=" + orgCodeType + ", purCodePrefix="
				+ purCodePrefix + ", purCodeType=" + purCodeType + ", bilCodePrefix=" + bilCodePrefix + ", bilCodeType="
				+ bilCodeType + ", kotCodePrefix=" + kotCodePrefix + ", kotCodeType=" + kotCodeType + "]";
	}

}
