package com.ey.ui;

import java.util.Scanner;
import com.ey.util.*;

public class Day2AssignmentDemo {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter a charcter:");
		String c=sc.next();
		System.out.print("The Colour is:  ");
		System.out.println(Day2Assignment.getColour(c));
		
		System.out.println("Enter the number of elements in the array:");
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element number"+i+":");
			System.out.println();
			a[i]=sc.nextInt();
		}
		
		System.out.print("Maximum of the array:  ");
		System.out.println(Day2Assignment.max_Array(a));
		
		System.out.print("Minimum of the array:  ");
		System.out.println(Day2Assignment.min_Array(a));
		
		System.out.print("Second Maximum of the array:  ");
		System.out.println(Day2Assignment.sec_Max(a));
		
		System.out.print("Second Mininimum of the array:  ");
		System.out.println(Day2Assignment.sec_Min(a));
		
		System.out.print("Sum of the array:  ");
		System.out.println(Day2Assignment.sum_Array(a));
		
		System.out.print("Average of the array:  ");
		System.out.println(Day2Assignment.avg_Array(a));
		
		System.out.print("Ascending Order of the array:  ");
		int b[]=Day2Assignment.ascending(a);
		for(int v:b)
			System.out.print(v+" ");
		System.out.println();
		
		System.out.print("Descending Order of the array:  ");
		int d[]=Day2Assignment.descending(a);
		for(int v:d)
			System.out.print(v+" ");
	}

}
