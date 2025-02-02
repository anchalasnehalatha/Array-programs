import java.util.Scanner;

public class subarraysinanarray {
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
	        
	        for(int i=0;i<=size-1;i++) {
	        	int sum=0;
	        	for(int j=i;j<=size-1;j++) {
	        		sum+=a[j];
	        		for(int k=i;k<=j;k++) {
	        			System.out.print(a[k]+ " ");
	        			
	        		}
	        		System.out.println("=>sum is "+ sum);
	        	}
	        }
	        
	        

	}
	}



