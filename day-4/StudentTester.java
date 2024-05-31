package com.student.pro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentTester {
	
	public static void main(String[] args) {
		
		Student students[]=new Student[5];
		Integer a[]= {99,100,98};
		Integer b[]= {67,78,89};
		Integer c[]= {67,78,89};
		Integer d[]= {67,78,89};
		Integer e[]= {55,66,77};
		
		String date="09-02-2024";
		SimpleDateFormat d1=new SimpleDateFormat("dd-mm-yyyy"); 
		
		
		students[0]=new Student(101, "sai", new Date(), a, "First");
		students[1]=new Student(102, "raj", new Date(), b, "Second");
		students[2]=new Student(103, "ram", new Date(), c, "Third");
		students[3]=new Student(104, "max1", new Date(), d, "Fourth");
		students[4]=new Student(105, "mark", new Date(), e, "Fifth");
		
		Studentservice sc=new Studentservice();
		sc.displayStudents(students);
		
		Studentvalidator sv=new Studentvalidator();
		sv.isValidDate(students[0]);
		//valid name
		System.out.println(sv.isValidStudentname(students[0]));
		System.out.println(sv.isValidStudentname(students[1]));
		System.out.println(sv.isValidStudentname(students[2]));
		System.out.println(sv.isValidStudentname(students[3]));
		System.out.println(sv.isValidStudentname(students[4]));
		
		//valid student
		System.out.println(sv.isValidStudent(students[0]));
		System.out.println(sv.isValidStudent(students[1]));
		System.out.println(sv.isValidStudent(students[2]));
		System.out.println(sv.isValidStudent(students[3]));
		System.out.println(sv.isValidStudent(students[4]));
		
		//valid marks
		System.out.println(sv.isValidMarks(a));
		System.out.println(sv.isValidMarks(b));
		System.out.println(sv.isValidMarks(c));
		System.out.println(sv.isValidMarks(d));
		System.out.println(sv.isValidMarks(e));
		
	}

}
