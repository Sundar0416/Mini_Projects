package cheek;
import java.util.*;
public class eliminate_duplicate {
    

   
    public static char findSingle(char[] arr) {
        char result = 0; // Initializing result
        for (char element : arr) {
            result ^= element; // XOR operation
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }
        

        char singleElement = findSingle(arr);
        System.out.println(singleElement);
    }
}

