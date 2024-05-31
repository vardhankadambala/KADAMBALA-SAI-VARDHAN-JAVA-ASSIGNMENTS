package com.ey.day3;

import java.util.Scanner;

public class First_letter_capital {
	
	static void firstlettercapital(String s) {
		char[] c=s.toCharArray();
		boolean f=true;

		for(int i=0;i<c.length;i++) {
			if(Character.isLetter(c[i])) {
				if(f) {
					c[i]=Character.toUpperCase(c[i]);
					f=false;
				}
			}
			else {
				f=true;
			}
		}
		s=String.valueOf(c);
		System.out.println(c);
	}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		firstlettercapital(s);
		
		
		
	}

}
