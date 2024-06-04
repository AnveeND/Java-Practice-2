package com.collegetssm.internship;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		Address ad = new Address();

		e.setEmpId(101);
		e.setEmpNameString("Anvee");
		e.setDesignationString("Manager");
		e.setAddress(ad);
		ad.setFlatNo(801);
		ad.setAreaString("DSK");
		ad.setCityString("Pune");
		ad.setPincode(411041);
		ad.setStateString("Maharashtra");
		ad.setCountryString("India");



		System.out.println("Employee Id : "+e.getEmpId());
		System.out.println("Employee Name : "+e.getEmpNameString());
		System.out.println("Employee Designation : "+e.getDesignationString());
		//System.out.print("Employee Address :  Flat No-"+ad.getFlatNo());
		//System.out.print(", "+ad.getAreaString()+", "+ad.getPincode()+", "+ad.getCityString()+", "+ad.getStateString()+", "+ad.getCountryString());
		//using toString():-
		System.out.println("Address : "+e.getAddress().toString());		


	}

}
