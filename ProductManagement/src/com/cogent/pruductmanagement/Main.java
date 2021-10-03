package com.cogent.pruductmanagement;

import java.io.IOException;
import java.util.Date;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;


public class Main {
	
	public static void main(String[] args) throws InvalidProductIdException, IOException {
		
		 ProductService service = new ServiceImpl();
		 
		 String result = null;
		 
		 try {
			 result = service.addProduct(new Product("123tv", "SamsungTv", 1002,1002));
		 } 
			
		 catch(InvalidProductException e)
		 {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		
		if("success".equals(result))
			
		{
			System.out.println("added");
		}
		
		try
		{
			System.out.println(service.getProductById("123tv").getProductName());
			
		}
		
		catch(InvalidProductIdException e)
	{
			e.printStackTrace();
			
		
	                   }
	             }
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String Id ="ang001";
		//String name = "Angie";
		//float productPrice;
		//long qty;
		//Date createdDate;
		//Date expiryDate;
		//String batchNo;
		//ProductService productService = ProductServiceImpl.getInstance();
		//ProductService productService = ProductServiceImpl.getInstance();
		//Product product1 = new Product(Id, name, productPrice, qty, null,null,batchNo);
		//Product[] products = productService.getProducts();
		//Product productId = productService.getProductById(Id);
		
		//Update am record
		//productService.updateProduct(Id,product1);
		
		//delete a product record
		//productService.deleteProductById(Id);
		
		//print out the products listed
		
		//for (Product p : products) {
			//System.out.println(p);
			
	
		
			
		

	
	
	
	
	
	


	
	

}
