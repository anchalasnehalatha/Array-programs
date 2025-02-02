import java.util.Arrays;
import java.util.Scanner;

public class mergingtwoarrays {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sizeof 1st array");
	int size1=sc.nextInt();
	int a[]=new int[size1];
	System.out.println("Enter array elements");
	for(int i=0;i<=a.length-1;i++){
	 a[i]=sc.nextInt();
}
	System.out.println("enter sizeof 1st array");
	int size2=sc.nextInt();
	int b[]=new int[size2];
	System.out.println("Enter array elements");
	for(int i=0;i<=b.length-1;i++){
	 b[i]=sc.nextInt();
	 }
	int c[]=ismerge(a,b);
			System.out.println(Arrays.toString(c));
	}
	static int[] ismerge(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i];
		
	}
		for(int i=0;i<=b.length-1;i++) {
			c[a.length+i]=b[i];
		}
		return c;
	

}
}
