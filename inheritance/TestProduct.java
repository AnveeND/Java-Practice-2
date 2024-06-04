package com.college.internship.inheritance;

public class TestProduct {

	public static void main(String[] args) {
		ElectronicProducts ep = new ElectronicProducts();
		FashionProducts fp = new FashionProducts();
		CosmaticProducts cp= new CosmaticProducts();
		
		ep.setId(1);
		ep.setName("Television");
		ep.setPrice(95000);
		ep.setDecs("Smart Tv");
		ep.setWarrenty("1 year");
		
		fp.setId(2);
		fp.setName("Hoodie");
		fp.setPrice(2000);
		fp.setDecs("Black coloured");
		fp.setQuality("Best");
		
		cp.setId(3);
		cp.setName("Conceler");
		cp.setPrice(1000);
		cp.setDecs("Lakme Product");
		cp.setExpiry("1 year from date of Manufacture ");
		
		System.out.println("\n\nElectronic :-\n--------------");
		System.out.println("Product Id : "+ep.getId());
		System.out.println("Product name : "+ep.getName());
		System.out.println("Product Price : "+ep.getPrice());
		System.out.println("Product Description : "+ep.getDecs());
		System.out.println("Product Warrenty : "+ep.getWarrenty());
		
		System.out.println("\n\nFashion :-\n--------------");
		System.out.println("Product Id : "+fp.getId());
		System.out.println("Product name : "+fp.getName());
		System.out.println("Product Price : "+fp.getPrice());
		System.out.println("Product Description : "+fp.getDecs());
		System.out.println("Product Quality : "+fp.getQuality());
		
		
		System.out.println("\n\nCosmatics :-\n--------------");
		System.out.println("Product Id : "+cp.getId());
		System.out.println("Product name : "+cp.getName());
		System.out.println("Product Price : "+cp.getPrice());
		System.out.println("Product Description : "+cp.getDecs());
		System.out.println("Product Expiry : "+cp.getExpiry());
		
		

	}

}
