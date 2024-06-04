package org.tssm.internship.constructor;

public class Test {

	public static void main(String[] args) {
		NewChild ch = new NewChild(); // Default of parent then child  
		//NewChild ch2= new NewChild(2);  -->(*before adding parametrs to super of parametarised of child) default of parent and parametarised of child 
		NewChild ch2= new NewChild(2);//-->after giving parameters to super parameterised of parent and parametarised of child 
		
	}

}
