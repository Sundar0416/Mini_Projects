package palgm;
import java.util.Scanner;
public class Roman_Inte {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a roman value:");
		String s=sc.nextLine();
		Roman_Inte rm=new Roman_Inte();
		int res=rm.rom_int(s.toUpperCase());
		System.out.print(res);
	}
	public int rom_int(String s) {
		int total=0;
		for(int i=0;i<s.length();i++) {
			int s1=value(s.charAt(i));
			if(i+1<s.length()) {
				int s2= value(s.charAt(i+1));
				if(s1>=s2) {
					total=total+s1;
				}
				else {
					total=total-s1;
				}
			}
			else {
				total=total+s1;
			}
		}
		return total;
	}
	public int value(char ch) {
		if(ch=='I') 
			return 1;
		if(ch=='V')
			return 5;
		if(ch=='X')
			return 10;
		if(ch=='L')
			return 50;
		if(ch=='C')
			return 100;
		if(ch=='D')
			return 500;
		if(ch=='M')
			return 1000;
		return -1;
	}
}