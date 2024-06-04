package com.college.internship.inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		
		FullTimeEmployee fe = new FullTimeEmployee();
		PartTimeEmployee pe = new PartTimeEmployee();
		
		
		fe.setId(1);
		fe.setNameString("Anvee");
		fe.setCityString("Pune");
		fe.setDesignationString("Manager");
		fe.setMonthlySalary(100000);
		
		pe.setId(12);
		pe.setNameString("Sam");
		pe.setCityString("Banglore");
		pe.setDesignationString("Software Tester");
		pe.setHrsSalary(10000);
		
		System.out.println("\n\nFull-Time Employee :- \n------------------");
		System.out.println("ID : "+fe.getId());
		System.out.println("Name : "+fe.getNameString());
		System.out.println("Designation : "+fe.getDesignationString());
		System.out.println("City : "+fe.getCityString());
		System.out.println("Salary : "+fe.getMonthlySalary());
		
		
		System.out.println("\n\n\nPart-Time Employee :- \n-------------------");
		System.out.println("ID : "+pe.getId());
		System.out.println("Name : "+pe.getNameString());
		System.out.println("Designation : "+pe.getDesignationString());
		System.out.println("City : "+pe.getCityString());
		System.out.println("Salary : "+pe.getHrsSalary());

	}

}
