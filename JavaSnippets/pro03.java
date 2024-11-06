package MDA;

public class pro03 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        traverse(arr);
    }
    public static void traverse(int[] x) {
    	for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
   }
}
