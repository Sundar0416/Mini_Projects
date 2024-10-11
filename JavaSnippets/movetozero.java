package interview;
import java.util.Scanner;

public class movetozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }

        // Move zeros to the end while keeping the order of non-zero digits unchanged
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        // Print the result
        for (int num : arr) {
            System.out.print(num);
        }
    }
}

