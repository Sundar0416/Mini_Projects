
package pgm;
import java.util.*;

public class nthSmallnthLar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 8, 6, 4, 9, 6, 3, 5, 9, 6, 3, 2, 3, 1, 6, 7};
        
        // Mark duplicates with Integer.MAX_VALUE
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = Integer.MAX_VALUE;
                }
            }
        }

        // Sort the array
        Arrays.sort(a);

        // Print unique sorted elements and count them
        System.out.print("Unique sorted elements: ");
        int countUniqueElements = 0;
        for (int value : a) {
            if (value != Integer.MAX_VALUE) {
                System.out.print(value + " ");
                countUniqueElements++;
            }
        }
        System.out.println("\nTotal unique elements: " + countUniqueElements);

        // Choosing nth largest or nth smallest
        System.out.println("1. nth largest\n2. nth smallest");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (choice == 1) { // nth largest
            if (n > 0 && n <= countUniqueElements) {
                System.out.println(n + " largest number is " + a[a.length - n]);
            } else {
                System.out.println("Invalid input for n");
            }
        } else if (choice == 2) { // nth smallest
            if (n > 0 && n <= countUniqueElements) {
                System.out.println(n + " smallest number is " + a[n - 1]);
            } else {
                System.out.println("Invalid input for n");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
}
