import java.util.Scanner;

public class Palindrome {
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
		if(ispalindrome(a[i])) {
			count++;
		}
		
	}
		System.out.println(count);
	}
	static boolean ispalindrome(int n) {
		int rev=0;
		int temp=n;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return temp==rev;
	}

}
