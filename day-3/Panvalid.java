package com.ey.day3;

import java.util.Scanner;

public class Panvalid {
	static void panValid(String s) {
		String p="[A-Z]{3}[0-9]{4}[A-z]{1}";
		boolean x=s.matches(p);
		if(x) {
			System.out.println("Valid");
		}
		else
			System.out.println("Not Valid");
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the PAN Number: ");
		String s=sc.nextLine();
		panValid(s);
	}

}
