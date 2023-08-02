package com.itgarden.entity;

import com.itgarden.common.staticdata.PurchaseOrderStatus;

import javax.naming.Name;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrder extends BaseObject {

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "product_description", nullable = false)
	private String productDescription;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "unit_price", nullable = false)
	private double unitPrice;

	@Column(name = "purchase_order_code", nullable = false)
	private String purchaseOrderCode;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "vendor_id")
	private Vendor vendor;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tax_id")
	private Tax tax;

	@Column(name = "tax_amount", nullable = false)
	private double taxAmount;

	@Column(name = "total_amount", nullable = false)
	private double totalAmount;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "grand_total", nullable = false)
	private double grandTotal;

	@Column(name = "status", nullable = false)
	private PurchaseOrderStatus purchaseOrderStatus;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getPurchaseOrderCode() {
		return purchaseOrderCode;
	}

	public void setPurchaseOrderCode(String purchaseOrderCode) {
		this.purchaseOrderCode = purchaseOrderCode;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public PurchaseOrderStatus getPurchaseOrderStatus() {
		return purchaseOrderStatus;
	}

	public void setPurchaseOrderStatus(PurchaseOrderStatus purchaseOrderStatus) {
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [productName=" + productName + ", productDescription=" + productDescription
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", purchaseOrderCode=" + purchaseOrderCode
				+ ", vendor=" + vendor + ", tax=" + tax + ", taxAmount=" + taxAmount + ", totalAmount=" + totalAmount
				+ ", category=" + category + ", grandTotal=" + grandTotal + ", purchaseOrderStatus="
				+ purchaseOrderStatus + "]";
	}

}
