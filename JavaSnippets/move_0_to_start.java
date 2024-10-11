package palgm;

public class move_0_to_start {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 0, 12, 6, 0, 4, 0, 14};
        int nonZeroIndex = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
            	int temp=arr[i];
                arr[i]=arr[nonZeroIndex];
                arr[nonZeroIndex]=temp;
                nonZeroIndex--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
