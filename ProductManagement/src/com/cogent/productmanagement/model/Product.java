package com.cogent.productmanagement.model;

import java.util.Date;
import com.cogent.productmanagement.InvalidProductPriceException;
import lombok.AllArgsConstructor;
import lombok.Data;



public class Product {

	private String productId;
	private String productName;
	private float productPrice;
	private long qty;
	private Date createdDate;
	private Date expiryDate;
	private String batchNo;
	
	public Product()
	
	{
		this.productId = " ";
		
	     }
	
	public Product(String productId, String productName, float productPrice, long qty) throws InvalidProductPriceException {
		super();
		this.productId = productId;
		this.productName = productName;
		this.setProductPrice(productPrice);
		this.qty = qty;
		
	}
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() throws InvalidProductPriceException 
	{
		if(productPrice > 0)
		{
		return productPrice;
		}
		else
			throw new InvalidProductPriceException("price cant be negative");
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public long getQty() {
		return qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	
	
}
	
	
	
	
	
	






}
