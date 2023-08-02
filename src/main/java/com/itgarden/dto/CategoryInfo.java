package com.itgarden.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryInfo extends BaseInfo {

	private String categoryCode;
	@NotEmpty(message = "Category name can't be empty")
	private String name;

	@NotEmpty(message = "Category Description can't be empty")
	private String description;

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CategoryInfo [categoryCode=" + categoryCode + ", name=" + name + ", description=" + description + "]";
	}

}
