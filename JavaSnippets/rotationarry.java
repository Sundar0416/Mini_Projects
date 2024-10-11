package interview;

public class rotationarry {
    public static void main(String[] args) {
        int n = 4;
        int size = n * 2 - 1;
        int[][] arr = new int[size][size];
        int front = 0;
        int last = size;
        while (n != 0) {
            for (int i = front; i < last; i++) {
                for (int j = front; j < last; j++) {
                    if (i == front || i == last - 1 || j == front || j == last - 1 ) {
                        arr[i][j] = n;
                    }
                }
            }
            front++;
            last--;
            n--;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

