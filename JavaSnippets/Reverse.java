package sundar;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		String word = sc.nextLine();
		System.out.println("your value:"+word);
		char []ch = word.toCharArray();
		int revIndex = ch.length;
		char []chRev = new char[revIndex];
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"]="+ch[i]);
			chRev[revIndex-1] = ch[i];
			revIndex--;
			}
	}

}
