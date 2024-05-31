package com.ey.util;

import java.util.Arrays;

public class Day2Assignment {
	public static String getColour(String c) {
		return switch(c){
		case "r"->"Red";
		case "b"->"Blue";
		case "g"->"Green";
		case "v"->"Violet";
		case "o"->"Orange";
		case "s"->"Silver";
		case "p"->"Purple";
		default -> "Unknown";
		};
		
	}
	
	public static int max_Array(int...a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	
	public static int min_Array(int...a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	
	public static int sec_Max(int...a) {
		int max=max_Array(a);
		int smax;
		if(a[0]==max)
			smax=a[1];
		else
			smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=max) {
				if(a[i]>smax)
					smax=a[i];
			}
		}
		return smax;
	}
	
	public static int sec_Min(int...a) {
		int min=min_Array(a);
		int smin;
		if(a[0]==min)
			smin=a[1];
		else
			smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=min) {
				if(a[i]<smin)
					smin=a[i];
			}
		}
		return smin;
	}
	public static int sum_Array(int...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static float avg_Array(int...a) {
		int sum= sum_Array(a);
		int len=a.length;
		float avg=sum/len;
		return avg;	
	}
	
	public static int[] ascending(int...a) {
		Arrays.sort(a);
		return a;
	}
	public static int[] descending(int...a) {
		Arrays.sort(a);
		int b[]=new int[a.length];
		int j=a.length;
		for(int i=0;i<a.length;i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		return b;
	}
}
