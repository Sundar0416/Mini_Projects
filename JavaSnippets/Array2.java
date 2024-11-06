package pgm;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int[] res=showss(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(res[i]+" ");
        }
    }
    public static int[] showss(int[] arr) {
    	int[]res=new int[arr.length];
    	for (int i = 0; i < arr.length; i++) {
            
            res[i]=arr[i];
        }
    	return res;
       
    }
}
