package com.ey.day3;

import java.util.Scanner;

public class Formatxx {
	static void Program7(String s) {
		String s1="[0-9]{3}-[0-9]{3}-[0-9]{4}";
		boolean x=s.matches(s1);
		
		if(x) {
			String s2=s.replace("-", "");
			//System.out.println(s2);
			String s3[]=s2.split("");
			for(int i=0;i<s3.length;i++) {
				if(i==1||i==3||i==6)
					System.out.print(s3[i]+"-");
				else
					System.out.print(s3[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");	//444-111-1234
		String s=sc.nextLine();
		Program7(s);
	}

}
