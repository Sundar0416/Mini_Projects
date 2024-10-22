package palgm;
import java.util.*;
public class shocks {
	public static void main(String[] args) {
		int[] arr= {10,20,10,30,10,50,20,10};
		int res=shocks(arr);
		System.out.println(res);
	}
	public static int shocks(int[] arr) {
		int pair=0;
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
				if(map.get(arr[i])>=2) {
					map.put(arr[i], map.get(arr[i])-2);
					pair++;
				}
			}
			else {
				map.put(arr[i], 1);
			}
		}
		return pair;
	}

}