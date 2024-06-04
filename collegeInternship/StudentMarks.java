package com.collegeInternship;

import java.util.Scanner;

public class StudentMarks {
	
	int subjectCount;  // to store number of subjects 
	int sum =0;  // to store the sum of marks 
	float percentage ;  //to store the percentage of the student 
	String subjects[];
	int marks[];
	
	Scanner sc = new Scanner(System.in); 
	
	public void getData() {
		
		System.out.print("\nHow many subjects do you have :- ");
		subjectCount=sc.nextInt();
		
		subjects= new String[subjectCount] ; // array to store the names of the subjects 
		marks = new int[subjectCount];         // array to store the marks of the subject 
		
		System.out.println("\nEnter the names of the subjects : ");
		
		
		// loop to input names of all the subjects 
		for (int i =0;i<subjectCount;i++) {
			subjects[i]=sc.next();
		}
		
	
		System.out.println("\n*Enter marks out of 100 only ");
		//loop to input marks of all subjects 
		for (int i=0;i<subjectCount;i++) {
			System.out.print("\nEnter marks for "+subjects[i]+" : ");
			marks[i]=sc.nextInt();
			sum = sum+marks[i];
			
		}
		
	}
	
	public void calculate() {
		if(sum>(subjectCount*100)) {
			System.out.println("\nInvalid marks entered !!");
			
			}
		else {
			percentage=sum/subjectCount;
				
			}
	}
	
	public void display() {
		System.out.println("\n----------  SCORECARD ----------");
		for(int i=0;i<subjectCount;i++) {
			System.out.print("\n"+subjects[i]+" --> "+marks[i]);
			
		}
		System.out.println("\n\n~~~~~~~~~ RESULT ~~~~~~~~~~~~~~");
		System.out.println("\nTotal Marks = "+sum);
		System.out.println("\nPercentage : "+percentage);
	}

	public static void main(String[] args) {
		
		StudentMarks st=new StudentMarks();
		System.out.println("\n              RESULT CALCULATOR                    \n");
		st.getData();
		st.calculate();
		st.display();
		
		

	}

}
