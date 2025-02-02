import java.util.Scanner;
public class sorttheele {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i <=a.length-1; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<=a.length-1;i++) {
        	for(int j=i+1;j<=a.length-1;j++) {
        		if(a[i]<a[j]) {
        			int temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        		
        	}
        	
        }
        System.out.println(a[1]);
        
	}
}
