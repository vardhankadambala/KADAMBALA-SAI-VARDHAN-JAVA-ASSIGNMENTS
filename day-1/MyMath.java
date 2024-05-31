package com.ey.util;

import java.util.Scanner;

import java.lang.Math;

public class MyMath {
	
	public static boolean isPerfectNumber(int n) {
		int sum=0;
		for(int i=1;i<n-1;i++) {
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static long factorial(int n) {
		int i,f=1;
		for(i=1;i<=n;i++)
			f=f*1;
		long fact=f;
		return fact;
	}
	public static boolean isPrime(int n) {
		boolean result=false;
		int i,m=0,f=0;
		m=n/2;
		if(n==1)
			result=false;
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					result=false;
					f=1;
					break;
				}
			}
			if(f==0)
				result=true;
		}
		
				
		return result;
	}
	public static long sumOfPrimes(int n) {
		int sum=0;
		for(int i=n;i>=1;i--) {
			boolean prime=isPrime(i);
			if(prime) 
				sum=sum+i;
		}
		long primesum=sum;
		return primesum;
	}
	
	public static boolean isArmstrongNumber(int n){
		boolean result=false;
		int t,d=0,l=0,sum=0;
		t=n;
		while(t>0) {
			t=t/10;
			d++;
		}
		t=n;
		while(t>0) {
			l=t%10;
			sum+=(Math.pow(l,d));
			t=t/10;
		}
		if(n==sum)
			result=true;
		else
			result=false;
		return result;		
	}
	
	public static int reverseNumber(int n) {
		int r=0,rem;
		while(n!=0) {
			rem=n%10;
			r=r*10+rem;
			n=n/10;		
		}
		return r;
	}
	
	public static int decimalTobinary(int n) {
		int bin=0,c=0;
		while(n!=0) {
			int rem=n%2;
			double d=Math.pow(10, c);
			bin+=rem*d;
			n/=2;
			c++;
		}
		return bin;
		
	}
	
	public static int binaryTodecimal(int n) {
		int num=n;
		int deci=0;
		int b=1;
		int temp=num;
		while(temp>0) {
			int last=temp%10;
			temp=temp/10;
			deci+=last*b;
			b=b*2;
		}
		return deci;
	}
	
	public static int getSumOfFibos(int n) {
		int a=0,b=1,c,i;
		int x=a+b;
		for(i=2;i<n;++i) {
			c=a+b;
			x=x+c;
			a=b;
			b=c;
		}
		return x;
	}
	
	public static boolean isPallendrome(int n){
		boolean result=false;
		int x=reverseNumber(n);
		if(n==x)
			result=true;
		else
			result=false;
		return result;
	}
		
	
	

}

