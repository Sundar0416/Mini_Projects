package sundar;

import java.util.Scanner;

public class SundarReverse {
	public static void main(String args[]) {
		System.out.println("*****REPEAT THE CONTENT*****");
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		String word = sc.nextLine();
		System.out.println("your value:"+word);
		char []ch = word.toCharArray();
		int revIndex = ch.length;
		char []chRev = new char[revIndex];
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"]:"+ch[i]);
			chRev[revIndex-1]=ch[i];
			revIndex--;
		}
		for(int i=0;i<chRev.length;i++) {
			System.out.println("chRev["+i+"]:"+ch[i]);
			sb.append(chRev[i]);
		}
		System.out.println("rev:"+sb.toString());
		
	}
	

}
