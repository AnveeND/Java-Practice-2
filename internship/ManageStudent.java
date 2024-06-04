package com.collegetssm.internship;

public class ManageStudent {

	public static void main(String[] args) {
		student objStudent = new student();
		objStudent.setroll(1);
		objStudent.setNameString("Anvee");
		objStudent.setCourseString("Computer Science ");

		System.out.println("Roll no. - "+objStudent.getroll());
		System.out.println("Name - "+objStudent.getNameString());
		System.out.println("Course - "+objStudent.getCourseString());


	}

}
