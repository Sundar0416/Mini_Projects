package palgm;
import java.util.*;
public class SubStringLong {
	public static void main(String[] args) {
		String str="abacefgdab";           //abcdab
		System.out.print(longest(str));
	}
	public static String longest(String str) {
		HashSet<Character>set=new HashSet<>();
		String longestTillNow="";
		String longestOverall="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(set.contains(c)) {
				set.clear();
				longestTillNow="";
			}
			set.add(c);
			longestTillNow=longestTillNow+c;
			if(longestTillNow.length() > longestOverall.length()) {
				longestOverall=longestTillNow;
			}
		}
		return longestOverall;
	}
}
