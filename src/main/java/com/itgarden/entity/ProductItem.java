package com.itgarden.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.itgarden.common.staticdata.StockStatus;

import javax.persistence.*;

@Entity
@Table(name = "product_item")
public class ProductItem extends BaseObject {

	@Column(name = "product_item_code", nullable = false)
	private String productItemCode;

	@JsonBackReference
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;

	@Column(name = "status", nullable = false)
	private StockStatus stockStatus;

	public String getProductItemCode() {
		return productItemCode;
	}

	public void setProductItemCode(String productItemCode) {
		this.productItemCode = productItemCode;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}

	@Override
	public String toString() {
		return "ProductItem [productItemCode=" + productItemCode + ", product=" + product + ", stockStatus="
				+ stockStatus + "]";
	}

}
