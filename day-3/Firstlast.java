package com.ey.day3;

import java.util.Scanner;

public class Firstlast {
	
	static void Program6(String s) {
		String s1[]=s.split(" ");
		
		if(s1[0].matches(s1[s1.length-1])) {
			System.out.println(s1[0].length());
		}
		else
			System.out.println(s1[s1.length-1].length()+s1[0].length());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		Program6(s);
	}
}
