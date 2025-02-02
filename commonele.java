import java.util.Scanner;

public class commoneleinanarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
		 a[i]=sc.nextInt();
	}
		System.out.println("enter size1");
		int size1=sc.nextInt();
		int b[]=new int[size1];
		System.out.println("Enter array elements");
		for(int i=0;i<=b.length-1;i++){
		 b[i]=sc.nextInt();
	}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
		

}
}
