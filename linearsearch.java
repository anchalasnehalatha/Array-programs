import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n=sc.nextInt();
        boolean found=false;
        for(int i=0;i<=a.length-1;i++) {
        	if(a[i]==n) {
        		System.out.println("found");
        		found=true;
        		break;
        	}
        	
        }
        if(found==false) {
        	System.out.println("not found");
        }
        	
        

}
}
