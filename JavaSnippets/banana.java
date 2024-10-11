//package cheek;
//
//import java.util.*;
//
//public class banana {
//	public static void main(String[] args) {
//		String[] fruits= {"banana","apple","mango","banana","apple"};
//		String[] result=stall(fruits);
//		System.out.println(Arrays.toString(result));
//	}
//		public static String[] stall(String[] fruits){
//			Set<String>set=new HashSet<>();
//			for(int i=0;i<fruits.length;i++) {
//				set.add(fruits[i]);
//			}
//			List<String>List=new ArrayList<>(set);
//
//			Collections.sort(List);
//			String[] result=new String[List.size()];
//			int index=0;
//			for(String num:List) {
//				result[index++]=num;
//			}
//			return result;
//		}
//}


package cheek;

import java.util.*;

public class banana {
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple", "mango", "banana", "apple"};
        String[] result = removeDuplicatesAndSort(fruits);
        System.out.println(Arrays.toString(result));
    }

    public static String[] removeDuplicatesAndSort(String[] fruits) {
        Set<String> fruitSet = new HashSet<>(Arrays.asList(fruits)); // Convert array to set to remove duplicates
        List<String> fruitList = new ArrayList<>(fruitSet); // Convert set back to list for sorting
        Collections.sort(fruitList); // Sort the list alphabetically
        return fruitList.toArray(new String[0]); // Convert list back to array
    }
}
/*
input  -  {"banana", "apple", "mango", "banana", "apple"}
output -  [apple, banana, mango]
*/