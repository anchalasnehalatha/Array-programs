import java.util.Arrays;
import java.util.Scanner;

public class pairelements {
	public static void main(String[] args) {
			/*int a[]= {5,2,0,3,4,1,6};
			int n=6;*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sizeof 1st array");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
		 a[i]=sc.nextInt();
	}
		   int n=sc.nextInt();
			boolean b[]=new boolean[a.length];
	        for(int i=0;i<=a.length-1;i++) {
	        	if(b[i]==false) {
	        		for(int j=i+1;j<=a.length-1;j++) {
	        			if(a[i]+a[j]==n) {
	        				System.out.println(a[i]+ " "+a[j]);
	        				b[j]=true;
	        			}
	        		}
	        		
	        		
	        	}
	        }
}
} 
