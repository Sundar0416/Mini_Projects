package palgm;
import java.util.Scanner;

public class multi_char_inv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");  //aabbbcccssddddd
        String s = sc.nextLine(); // Input string from user
        char[] ch = s.toCharArray(); // Convert string to character array

        char currentChar = ch[0]; // Start with the first character
        int count = 1; // Counter to keep track of character repetitions

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == currentChar) {
                count++; // If the current character repeats, increase the count
            } else {
                System.out.print(currentChar+""+""+count); // Print the character
//                if (count >= 1) {
//                    System.out.print(count); // Print the count if more than 1
//                }
             
                currentChar = ch[i]; // Move to the next character
                count=1; // Reset the count for the next character
            }
        }

        // Print the last character and its count
        System.out.print(currentChar+""+""+count);
//        if (count >= 1) {
//            System.out.print(count);
//        }
    }
}
