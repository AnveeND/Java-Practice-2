package com.collegetssm.internship;

public class Abstraction_product {
	//Business class --> only logic not main method 
		private int id ;    // Through object also we should not access variable outside class so used private 
		private String name;
		private String desc;
		private String category;
		private float price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		
	

	
}
