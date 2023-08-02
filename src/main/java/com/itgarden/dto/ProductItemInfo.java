package com.itgarden.dto;

import com.itgarden.common.staticdata.StockStatus;

public class ProductItemInfo extends BaseInfo {

	private String productItemCode;
	private ProductInfo productInfo;
	private StockStatus stockStatus;

	public String getProductItemCode() {
		return productItemCode;
	}

	public void setProductItemCode(String productItemCode) {
		this.productItemCode = productItemCode;
	}

	public ProductInfo getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	public StockStatus getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(StockStatus stockStatus) {
		this.stockStatus = stockStatus;
	}

	@Override
	public String toString() {
		return "ProductItemInfo [productItemCode=" + productItemCode + ", productInfo=" + productInfo + ", stockStatus="
				+ stockStatus + "]";
	}

}
