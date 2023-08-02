package com.itgarden.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class ProductInfo extends BaseInfo {

	@NotEmpty(message = "Product name can't be empty")
	private String name;

	@NotEmpty(message = "Product description can't be empty")
	private String description;
	private String productCode;

//    @NotEmpty(message = "Product Price can't be empty")
	@Min(value = 1, message = "Product price can't be less than 0")
	private double price;

	private TaxInfo tax;
	private List<OfferInfo> offers;
	private List<VendorInfo> vendors;
	private CategoryInfo category;
	private Integer stockCount;

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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TaxInfo getTax() {
		return tax;
	}

	public void setTax(TaxInfo tax) {
		this.tax = tax;
	}

	public List<OfferInfo> getOffers() {
		return offers;
	}

	public void setOffers(List<OfferInfo> offers) {
		this.offers = offers;
	}

	public List<VendorInfo> getVendors() {
		return vendors;
	}

	public void setVendors(List<VendorInfo> vendors) {
		this.vendors = vendors;
	}

	public CategoryInfo getCategory() {
		return category;
	}

	public void setCategory(CategoryInfo category) {
		this.category = category;
	}

	public Integer getStockCount() {
		return stockCount;
	}

	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}

	@Override
	public String toString() {
		return "ProductInfo [name=" + name + ", description=" + description + ", productCode=" + productCode
				+ ", price=" + price + ", tax=" + tax + ", offers=" + offers + ", vendors=" + vendors + ", category="
				+ category + ", stockCount=" + stockCount + "]";
	}

}
