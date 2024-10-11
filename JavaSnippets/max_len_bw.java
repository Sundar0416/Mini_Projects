package palgm;
import java.util.Scanner;
public class max_len_bw {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter a string: ");
		String str=sc.nextLine();
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		for(int i=1;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[i-1]+""+""+ch[j+1]);
				}
			}
		}
	}
}