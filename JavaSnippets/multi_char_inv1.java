package palgm;
import java.util.Scanner;

public class multi_char_inv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");  //ip--aabbbcccssddddd==>op--a2b3c3s2d4
        String s = sc.nextLine(); 
        char[] arr = s.toCharArray(); 
        char currentChar = arr[0]; 
        int count = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentChar) {
                count++; 
            } else {
                System.out.print(currentChar+""+""+count);          
                currentChar = arr[i]; 
                count=1; 
            }
        }
          System.out.print(currentChar+""+""+count);
    }
}

