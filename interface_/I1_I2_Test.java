package org.tssm.internship.interface_;


public class I1_I2_Test {

	public static void main(String[] args) {
		//To differentiate between both the interfaces having exactly same method , we have to create reference of that interfaces . 
		
		I1 i1=new I1_I2_implementation();
		I2 i2 = new I1_I2_implementation();
		i1.demo();
		i2.demo();
		
		I1_I2_implementation obj = new I1_I2_implementation();
		obj.demo();
		
		//all the demo() calls will give same output

	}

}
