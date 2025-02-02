import java.util.Arrays;
import java.util.Scanner;

public class rotatethearrayrightshift {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size:");
	    int size = sc.nextInt();
	    int a[] = new int[size];
	    System.out.println("Enter array elements:");
	    for (int i = 0; i <=a.length-1; i++) {
	        a[i] = sc.nextInt();
	   }
	   int d=sc.nextInt();
	    a=rotate(a,d);
	   System.out.println(Arrays.toString(a));
	   
	}
	   static int[] rotate(int[] a,int d) {
		 for (int j = 0; j < d; j++) {
			 int temp=a[a.length-1];
			 for(int i=a.length-1;i>0;i--) {
				 a[i]=a[i-1];
			 }
			 a[0]=temp;
			 
			 
		 }
		 return a;

}
}
