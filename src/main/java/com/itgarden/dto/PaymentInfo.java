package com.itgarden.dto;

import com.itgarden.entity.BaseObject;
import com.itgarden.entity.Biller;
import com.itgarden.entity.ProductItem;
import com.itgarden.entity.Tax;

import javax.persistence.*;

public class PaymentInfo extends BaseObject {

	private BillerInfo biller;
	private ProductItemInfo productItem;
	private Tax tax;
	private double price;
	private double totalPrice;
	private double taxAmount;
	private long productId;

	public BillerInfo getBiller() {
		return biller;
	}

	public void setBiller(BillerInfo biller) {
		this.biller = biller;
	}

	public ProductItemInfo getProductItem() {
		return productItem;
	}

	public void setProductItem(ProductItemInfo productItem) {
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
		return "PaymentInfo [biller=" + biller + ", productItem=" + productItem + ", tax=" + tax + ", price=" + price
				+ ", totalPrice=" + totalPrice + ", taxAmount=" + taxAmount + ", productId=" + productId + "]";
	}

}
