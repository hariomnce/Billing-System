
package com.itgarden.entity;

import com.itgarden.common.staticdata.KitchenOrderStatus;

import javax.persistence.*;

import java.util.List;

@Entity
public class KitchenOrder extends BaseObject {

	@Column(name = "kitchen_order_code", nullable = false)
	private String kitchenOrderCode;

	@Column(name = "customer_id", nullable = false)
	private String customerId;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", nullable = false)
	private List<Product> productList;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "order_status", nullable = false)
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
		return "KitchenOrder [kitchenOrderCode=" + kitchenOrderCode + ", customerId=" + customerId + ", productList="
				+ productList + ", quantity=" + quantity + ", kitchenOrderStatus=" + kitchenOrderStatus + "]";
	}

}
