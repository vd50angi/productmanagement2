package com.cogent.productmanagement.service;

import java.io.IOException;

import com.cogent.productmanagement.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.repository.ProductRepository;
import com.cogent.productmanagement.repository.ProductRepositoryALImpl;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;



public class ProductServiceImpl {
ProductRepository productRepository = ProductRepositoryImpl.getInstance();
	
	private static ProductService productService;
	
	public static ProductService getInstance() {
			
		if(productService==null) {
			
			productService = new ProductServiceImpl();
			return productService;
		}
		return productService;
	}
	
	
	
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.addProduct(product);
	}

	
	
	@Override
	public String updateProduct(String productId, Product product) {
		// TODO Auto-generated method stub
		return productRepository.updateProduct(productId, product);
	}

	
	
	@Override
	public Product getProductById(String Id)  throws InvalidProductIdException,IOException {
		// TODO Auto-generated method stub
		return productRepository.getProductById(Id);
	}

	
	
	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	
	
	@Override
	public String deleteProductById(String Id) {
		// TODO Auto-generated method stub
		return productRepository.deleteProductById(Id);
	}

	
	
	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		productRepository.deleteAllProducts();
	}
}

//@Override
   // public Product getProductPrice (String price) throws InvalidProductPriceException {
	 //    return productRepository.getProductPrice(price);
	//

	

	
	
	
	

}
