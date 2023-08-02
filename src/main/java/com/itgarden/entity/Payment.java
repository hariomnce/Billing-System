package com.itgarden.entity;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment extends BaseObject {

//    id bigint NOT NULL AUTO_INCREMENT,
//    is_deleted bit(1) DEFAULT NULL,
//    biller_id bigint NOT NULL,
//    product_item_id bigint NOT NULL,
//    date_created datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
//    date_modified datetime DEFAULT NULL,
//    KEY payments_fk_biller (biller_id),

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "biller_id")
	Biller biller;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_item_id")
	private ProductItem productItem;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tax_id")
	private Tax tax;

	@Column(name = "price", nullable = false)
	private double price;

	@Column(name = "total_price", nullable = false)
	private double totalPrice;

	@Column(name = "tax_amount", nullable = false)
	private double taxAmount;

	@Column(name = "product_id")
	private long productId;

	public Biller getBiller() {
		return biller;
	}

	public void setBiller(Biller biller) {
		this.biller = biller;
	}

	public ProductItem getProductItem() {
		return productItem;
	}

	public void setProductItem(ProductItem productItem) {
		this.productItem = productItem;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Payment [biller=" + biller + ", productItem=" + productItem + ", tax=" + tax + ", price=" + price
				+ ", totalPrice=" + totalPrice + ", taxAmount=" + taxAmount + ", productId=" + productId + "]";
	}

}
