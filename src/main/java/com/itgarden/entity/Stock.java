package com.itgarden.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stock")
public class Stock extends BaseObject {

	@Column(name = "stock_count", nullable = false)
	private long stockCount;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "vendor_id")
	private List<Vendor> vendors;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;

	public long getStockCount() {
		return stockCount;
	}

	public void setStockCount(long stockCount) {
		this.stockCount = stockCount;
	}

	public List<Vendor> getVendors() {
		return vendors;
	}

	public void setVendors(List<Vendor> vendors) {
		this.vendors = vendors;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Stock [stockCount=" + stockCount + ", vendors=" + vendors + ", product=" + product + "]";
	}

}
