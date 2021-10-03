package com.cogent.productmanagementexception;

import lombok.ToString;

@ToString


public class InvalidProductPriceException extends Exception{

public InvalidProductPriceException (String message) {
		
		super(message);
	}

}

	
		
	

