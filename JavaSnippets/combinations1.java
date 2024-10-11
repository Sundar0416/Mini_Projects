package cheek;
import java.util.*;
import java.util.Set;

public class combinations1 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,2,3};
		Set <Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		List<Integer>List=new ArrayList<>(set);
		int n=List.size();
		System.out.print(fact(n));
	}
		public static int fact(int n) {
			if (n==0||n==1) {
				return 1;
			}
			return n*fact(n-1);
			
		}
}
/*
input - {2,3,4,5,6,7,8,2,3}
output - 5040
*/
