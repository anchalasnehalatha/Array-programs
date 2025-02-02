import java.util.Scanner;

public class freqofaneachelem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<=a.length-1;i++){
		 a[i]=sc.nextInt();
	}
		boolean b[]=new boolean[a.length];
		for(int i=0;i<=a.length-1;i++) {
			if(b[i]==false) {
				int count=1;
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i]==a[j]) {
					count++;
					b[j]=true;
				}
			}
		
				System.out.println(count);
		}
			
			
		}
	}

}
