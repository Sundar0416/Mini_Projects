package pgm;
import java.util.Arrays;
import java.util.Scanner;
public class RemDup {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {84, 65, 20, 40, 20, 74, 65, 76, 91, 84};
        int[] ans = removeDup(a);
        System.out.println(Arrays.toString(ans));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("1. nth largest\n2. nth smallest");
        int input = sc.nextInt();
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        if (input == 1) {
            if (n <= ans.length) {
                System.out.println(n + " largest is " + ans[ans.length - n]);
            } else {
                System.out.println("Invalid input");
            }
        } else if (input == 2) {
            if (n <= ans.length) {
                System.out.println(n + " smallest is " + ans[n - 1]);
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }
    public static int[] removeDup(int[] a) {
        Arrays.sort(a);
        int[] res = new int[a.length];
        int x = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                res[x++] = a[i];
            }
        }
        
        res[x++] = a[a.length - 1]; // Add the last unique element
        int[] ans = new int[x];
        for(int i=0;i<ans.length;i++){
        	ans[i]=res[i];            // Copy only unique elements
        }
        return ans;
    }
}