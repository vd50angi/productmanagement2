package com.cogent.productmanagement.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.productmanagement.InvalidProductIdException;
import com.cogent.productmanagement.model.Product;




public class ProductRepositoryALImpl  {

private static ProductRepository productRepository;
	
	private ProductRepositoryALImpl() {
		
	}

   public static ProductRepository getInstance() {
	   if(productRepository==null) {
			productRepository = new ProductRepositoryALImpl();
			return productRepository;
		}
		return productRepository;
	}
	
	private ArrayList<Product> products = new ArrayList<>();
	
	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		boolean status = products.add(product);
		if(status)
		{
			return "success";
		}
		else
			return "failed";
	}

	@Override
	public String updateProduct(String productId, Product product) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(String Id) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		for (Product product : products) {
			if(product.getProductId().equals(Id))
			{
				return product;
			}
		}
		return null;
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductById(String Id) throws InvalidProductIdException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub

	}

}
 
	   
	   
	   
   


}





}
