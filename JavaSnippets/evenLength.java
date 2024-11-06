package palgm;

public class evenLength {
	public static void main(String[] args) {
		String str="java program to print even length of words";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			String word=s[i];
			if(word.length()%2==0) {
				System.out.print(word+" ");
			}
		}
	}
}