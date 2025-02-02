import java.util.Scanner;

public class missingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int big = a[0];
        int small = a[0];
        // Find the largest and smallest elements
        for (int i = 0; i < a.length; i++) {
            if (a[i] > big)
                big = a[i];
            
            if (a[i] < small)
                small = a[i];
            	
        }

        // Find and print the missing elements
        System.out.println("Missing elements:");
        for (int i = small; i < big; i++) { // Start from `small`
            boolean res = ismissing(i, a);
            if (res == true) 
                System.out.println(i);
        }
    }

    static boolean ismissing(int n, int a[]) {
        // Check if `n` exists in the array
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) 
                return false; // `n` is not missing
        }
        return true; // `n` is missing
    }
}
