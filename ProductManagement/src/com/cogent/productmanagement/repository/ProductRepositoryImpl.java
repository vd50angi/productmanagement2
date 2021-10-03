package com.cogent.productmanagement.repository;
import java.io.IOException;

import com.cogent.productmanagement.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;



public class ProductRepositoryImpl {


public static void main(String[]args) {
		
	private Product[] products = new Product[10];
	private static ProductRepositoryImpl productRepository;
	
	private ProductRepositoryImpl() {
		
	}
	
	public static ProductRepository getInstance() {
		
		if(productRepository==null) {
			productRepository = new ProductRepositoryImpl();
			return productRepository;
		
		}
		return productRepository;
	
	}
	static int counter = 0;
	
	
	
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		if(counter >=products.length) {
			return "array is full";
		}
		
		products[counter++] = product;
		return "done";
	}
	

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		Product product2 = this.getProductById(productId);
		if(product2!=null) 
		{
		int index = this.getIndex(product2);
		
		
		if(index!=-1)
		{
			products[index] = product;
			return "success";
		}
		else
		{
			return "not found";
		}
		}
		else
		{
			return "not found";
		}
	}

	@Override
	public Product getProductById(String Id) {
		// TODO Auto-generated method stub
		for(Product product : products) {
			if( product!=null && Id.equals(product.getProductId())) {
				return product;
			}
		}
		return null;
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public String deleteProductById(String Id) {
		// TODO Auto-generated method stub
		Product product = this.getProductById(Id);
		if(product!=null) 
		{
		int index = this.getIndex(product);
		
		
		if(index!=-1)
		{
			products[index] = null;
			return "success";
		}
		else
		{
			return "not found";
		}
		}
		else
		{
			return "not found";
		}
	}
	
	private int getIndex(Product employee) {
		for (int i = 0; i < products.length; i++) 
		{
			if(products[i].equals(employee))
			{
				return i;
			}
		}
		return -1;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		products = null;
	}
	
}



