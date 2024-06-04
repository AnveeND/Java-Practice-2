package com.collegetssm.internship;

public class TestProduct {

	public static void main(String[] args) {
		
		Abstraction_product product=new Abstraction_product();
		
		product.setId(1);
		product.setName("Chips");
		product.setDesc("Junk Food");
		product.setCategory("snacks");
		product.setPrice(10);
		
		System.out.println("ID : "+product.getId());
		System.out.println("Product : "+product.getName());
		System.out.println("Category : "+product.getCategory());
		System.out.println("Description : "+product.getDesc());
		System.out.println("Price : "+product.getPrice());
		
		
	}

}
