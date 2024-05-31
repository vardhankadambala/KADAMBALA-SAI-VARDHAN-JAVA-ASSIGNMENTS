package com.ey.day3;

import java.util.Scanner;

public class Indexdiff {
	
	static void indDiff(int...a) {
		int b=0;
		int c=0;
		for(int i=0;i<=a.length;i++) {
			if(i+1<a.length) {
				if(a[i]>a[i+1]) {
					if(a[i]-a[i+1]>b) {
						b=a[i]-a[i+1];
						c=i;
					}
				}
				else {
					if(a[i+1]-a[i]>b) {
						b=a[i]-a[i+1];
						c=i+1;
					}
				}
				
			}
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array:");
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the element number"+i+":");
			System.out.println();
			a[i]=sc.nextInt();
		}
		indDiff(a);
	}

}
