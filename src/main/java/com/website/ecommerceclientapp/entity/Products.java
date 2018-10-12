package com.website.ecommerceclientapp.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "products")
public class Products {
	@Id
	private int productId;
	private String productName;
	private double productPrice;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productCost) {
		this.productPrice = productCost;
	}

	@Override
	public String toString() {
		return "Orders [productId=" + productId + ", productName=" + productName + ", productCost=" + productPrice + "]";
	}

}
