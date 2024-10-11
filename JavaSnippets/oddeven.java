package cheek;
import java.util.*;
public class oddeven {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		
		int[] result=sortoddeven(arr);
		   System.out.print(Arrays.toString(result));
		}
	public static int[] sortoddeven(int[] arr) {
		List <Integer> odd=new ArrayList<>();
		List <Integer> even=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd.add(arr[i]);
			}
			else {
				even.add(arr[i]);
			}
		}
		Collections.sort(odd,Collections.reverseOrder());
		Collections.sort(even);
		int[] result=new int[arr.length];
		int index=0;
		for(int num:odd) {
			result[index++]=num;
		}
		for(int num:even) {
			result[index++]=num;
		}
		return result;
	}
	}