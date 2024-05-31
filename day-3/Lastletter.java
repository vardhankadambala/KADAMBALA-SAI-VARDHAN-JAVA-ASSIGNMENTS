package com.ey.day3;

import java.util.Scanner;

	
public class Lastletter {
	static void last(String s) {	
		s=s+" ";
		char[] c=s.toCharArray();
		boolean f=true;

		for(int i=0;i<c.length;i++) {
			if(Character.isLetter(c[i])) {
				if(f) {
					
					f=false;
				}
			}
			else {
				c[i-1]=Character.toUpperCase(c[i-1]);
				f=true;
			}
		}
		s=String.valueOf(c);
		System.out.println(c);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		last(s);
	}
	

}
//String n="";
//for(int i=0;i<s.length()+1;i++) {
//	if(s.charAt(i)==' ')
//		n=n+s.charAt(i-1);
//		
//}
//System.out.println(n);
