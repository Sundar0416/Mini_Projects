package cheek;
import java.util.*;
public class dis {
	public static void main(String[] args) {
		int[] nums= {1293, 456, 789};                 //op-->[1,2,3,5,6,7,9]
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			while(nums[i]>0) {
				set.add(nums[i]%10);
				nums[i]=nums[i]/10;
			}
		}
		int[] result=new int[set.size()];
		int index=0;
		for(int element:set) {
			result[index++]=element;
			
		}
		System.out.println(Arrays.toString(result));
	}
}