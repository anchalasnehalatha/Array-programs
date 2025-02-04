package com.jsp.arraysandstrings;
import java.util.Scanner;

public class longestsubarray {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size:");
	        int size = sc.nextInt();
	        int a[] = new int[size];
	        int copy[]=new int[a.length];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < a.length; i++) {
	            a[i] = sc.nextInt();
	        }
	        int big=0;
	        int x=0;
	        int y=0;
	       for(int i=0;i<=size-1;i++) {
	        	int sum=0;
	        	for(int j=i;j<=size-1;j++) {
	        		sum+=a[j];
	        		for(int k=i;k<=j;k++) {
	        			System.out.print(a[k]+ " ");
	        			
	        		}
	        		System.out.println();
	        	
	        		if(big<sum) {
	        			big=sum;
	        			x=i;
	        			y=j;
	        		}
	        			
	        		}
	       }
	        	for(int i=x;i<=y;i++) {
	        		System.out.println(a[i]+ " ");
	        	}
	        	System.out.println();
	        
	        		 System.out.println("=>sum is "+ big);
	        	   
	        	
	        	
	        
	        
	        

	}
	}



