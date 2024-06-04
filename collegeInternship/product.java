package com.collegeInternship;
//Business class --> only logic not main method 
public class product {
	private int id ;    // Through object also we should not access variable outside class so used private 
	private String name;
	private String desc;
	private String category;
	private float price;
	
	void getProductData(int id,String name,String desc,String category,float price) {
		 this.id =id;
		 this.name=name;
		 this.desc=desc;
		 this.category=category;
		 this.price=price;
		
	}
	void show() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Description : "+desc);
		System.out.println("Category : "+category);
		System.out.println("Price : "+price);
		
	}
}
