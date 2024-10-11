package interview;
import java.util.Scanner;
public class freq {
	public static void main(String[] args) {
		int[] arr=new int[26];
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			arr[c-'a']++;
		}
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if (arr[c-'a']>0)
				System.out.print(c+""+arr[c-'a']);
			arr[c-'a']=0;
		}
	}

}

