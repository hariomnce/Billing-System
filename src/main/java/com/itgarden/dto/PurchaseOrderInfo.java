package com.itgarden.dto;

import com.itgarden.common.staticdata.PurchaseOrderStatus;
import com.itgarden.entity.BaseObject;

public class PurchaseOrderInfo extends BaseObject {

	private String productName;
	private String productDescription;
	private int quantity;
	private double unitPrice;
	private String purchaseOrderCode;
	private VendorInfo vendor;
	private TaxInfo tax;
	private double taxAmount;
	private double totalAmount;
	private CategoryInfo category;
	private double grandTotal;
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

	public VendorInfo getVendor() {
		return vendor;
	}

	public void setVendor(VendorInfo vendor) {
		this.vendor = vendor;
	}

	public TaxInfo getTax() {
		return tax;
	}

	public void setTax(TaxInfo tax) {
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

	public CategoryInfo getCategory() {
		return category;
	}

	public void setCategory(CategoryInfo category) {
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
		return "PurchaseOrderInfo [productName=" + productName + ", productDescription=" + productDescription
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", purchaseOrderCode=" + purchaseOrderCode
				+ ", vendor=" + vendor + ", tax=" + tax + ", taxAmount=" + taxAmount + ", totalAmount=" + totalAmount
				+ ", category=" + category + ", grandTotal=" + grandTotal + ", purchaseOrderStatus="
				+ purchaseOrderStatus + "]";
	}

}
