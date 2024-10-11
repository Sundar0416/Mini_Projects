package sri;
import java.util.Scanner;
public class string2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a String:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			   System.out.print(Character.toLowerCase(c));
			if(Character.isLowerCase(c))
				   System.out.print(Character.toUpperCase(c));
					}
	}
}
