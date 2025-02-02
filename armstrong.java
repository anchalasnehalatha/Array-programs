package com.jsp.arraysandstrings;
import java.util.Scanner;
public class armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
		 a[i]=sc.nextInt();
	}
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
		if(isarmstrong(a[i])) {
			count++;
		}
		
	}
		System.out.println(count);
	}
	static boolean isarmstrong(int n) {
		int cd=iscount(n);
		int sum=0;
		int temp=n;
		while(n!=0) {
			int rem=n%10;
			int pow=(int)Math.pow(rem, cd);
			sum+=pow;
			n/=10;
		}
		return temp==sum;
		
	}
	static int iscount(int n) {
		int count=0;
		while(n!=0) {
			int rem=n%10;
			count++;
			n/=10;
		}
		return count;
	}

}
