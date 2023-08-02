
package com.itgarden.dto;

import com.itgarden.common.staticdata.KitchenOrderStatus;
import com.itgarden.entity.BaseObject;
import com.itgarden.entity.Product;

import java.util.List;

public class KitchenOrderInfo extends BaseObject {

	private String kitchenOrderCode;
	private String customerId;
	private List<Product> productList;
	private int quantity;
	private KitchenOrderStatus kitchenOrderStatus;

	public String getKitchenOrderCode() {
		return kitchenOrderCode;
	}

	public void setKitchenOrderCode(String kitchenOrderCode) {
		this.kitchenOrderCode = kitchenOrderCode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public KitchenOrderStatus getKitchenOrderStatus() {
		return kitchenOrderStatus;
	}

	public void setKitchenOrderStatus(KitchenOrderStatus kitchenOrderStatus) {
		this.kitchenOrderStatus = kitchenOrderStatus;
	}

	@Override
	public String toString() {
		return "KitchenOrderInfo [kitchenOrderCode=" + kitchenOrderCode + ", customerId=" + customerId
				+ ", productList=" + productList + ", quantity=" + quantity + ", kitchenOrderStatus="
				+ kitchenOrderStatus + "]";
	}

}
