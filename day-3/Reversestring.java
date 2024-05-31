package com.ey.day3;

import java.util.Scanner;

public class Reversestring {
	static void reshape(String s) {
		String n = "";
		char c;
		
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			n=c+"-"+n;
				
				
			
		}
		String s1=n.substring(0,n.length()-1);
		System.out.println(s1);
			
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		reshape(s);
	}

}
