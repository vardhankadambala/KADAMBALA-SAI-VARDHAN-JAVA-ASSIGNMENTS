package com.ey.q1;

public class Studenttest {
	public static void main(String[] args) {
		Studentservice ss= new Studentservice();
		
		
		Address a1=new Address("hyd");
		Student s1=new Student("sai","vardhan",a1);
		
		Address a2=new Address("hyd");
		Student s2=new Student("sai","vardhan",a2);
		
		System.out.println(ss.addProduct(s1));
		System.out.println(ss.addProduct(s2));

		ss.listStudents();
		
		System.out.println(ss.isvalidStudent(s1, s2));
		
	}

}
