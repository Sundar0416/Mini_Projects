package interview;

import java.util.Scanner;

public class movetozerostr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++) {
        	arr[i]=Character.getNumericValue(s.charAt(i));
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
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]);
        }
    }

}

