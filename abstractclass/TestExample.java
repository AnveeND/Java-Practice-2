package org.tssm.internship.abstractclass;

import java.util.Scanner;

public class TestExample extends ExampleParent{

	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id, name , city and salary ");
		int id = sc.nextInt();
		String name=sc.next();
		String city = sc.next();
		float salary = sc.nextFloat();
		setId(id);
		setName(name);
		setCity(city);
		setSalary(salary);
		
		
		
	}
	void Display()
	{
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getCity());
		System.out.println(getSalary());
	}
	

}
