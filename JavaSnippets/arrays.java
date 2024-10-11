package sri;
import java.util.Scanner;
public class arrays {
	public static void main(String[] args) {
		/*marks= {1,2,13,11,10};*/
		Scanner s=new Scanner(System.in);
		String[] words=new String[5];
		
		/*words[0]="ram";
		words[1]="hello";
		words[2]="hi";
		words[3]="sri";
		words[4]="sundar";*/
		
		for(int i=0;i<words.length;i++) {
			words[i]=s.nextLine();
		}
		for(int i=0;i<words.length;i++) {
		
		  System.out.print(words[i]);
		  System.out.print(" ");
		  System.out.println();
		
	}

	}}

