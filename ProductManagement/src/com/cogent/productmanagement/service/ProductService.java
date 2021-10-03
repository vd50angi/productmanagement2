package com.cogent.productmanagement.service;
import com.cogent.productmanagement.model.Product;

import com.cogent.productmanagement.InvalidProductPriceException;
import com.cogent.productmanagement.*;



public interface ProductService {
	
	        public String addProduct(Product product);
			public String updateProduct(String productId, Product product);
			public Product getProductById(String Id) throws InvalidProductPriceException;
			public Product[] getProducts();
			public String deleteProductById(String Id) throws InvalidProductPriceException;//need to change the class name with exception
			public void deleteAllProducts();
		}

		
	


