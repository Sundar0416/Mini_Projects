package interview;
import java.util.Scanner;
public class ascii {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int ans=0;
		int i=0;
		while(i<s.length()) {
			ans=ans*26;
			ans=ans+(s.charAt(i)-'A'+1);
			i++;
		}
		System.out.print(ans);
		
	}
}
