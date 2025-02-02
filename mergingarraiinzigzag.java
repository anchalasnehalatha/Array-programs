import java.util.Scanner;
import java.util.Arrays;

public class mergingarraysinzigzag {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sizeof 1st array");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
		 a[i]=sc.nextInt();
	}
		System.out.println("enter sizeof 2nd array");
		int size2=sc.nextInt();
		int b[]=new int[size2];
		System.out.println("Enter array elements");
		for(int i=0;i<=b.length-1;i++){
		 b[i]=sc.nextInt();
		 }
	       int[] newarr=zigzag(a,b);
	       System.out.println(Arrays.toString(newarr));
	    
		
	}
		static int[] zigzag(int a[],int b[]) {
			int in=0;
			int c[]=new int[a.length+b.length];
			for(int i=0;i<=c.length-1/2;i++) {
				if(i<a.length) {
				c[in]=a[i];
				in++;
				}
				if(i<b.length) {
					c[in]=b[i];
					in++;
				}
				
			}
			return c;
			
		}

}
