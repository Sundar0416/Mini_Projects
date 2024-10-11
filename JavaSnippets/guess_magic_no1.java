package pgm;
import java.util.Scanner;
public class guess_magic_no1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the game");
		int magic_no=(int)(Math.random()*100);
		boolean flag=true;
		do 
		{
			System.out.print("Guess the magic number:");
			int user_no=sc.nextInt();
			if(user_no<magic_no) {
				System.out.println("Low");
			}
			else if(user_no>magic_no) {
				System.out.println("High");
			}
			else if(user_no==magic_no) {
				System.out.println("Win the game");
				System.out.println("1.Play Again\n2.Exit");
				int choice=sc.nextInt();
				switch(choice) {
					case 1:
						magic_no=(int)(Math.random()*100);
						break;
					case 2:
						System.out.println("Exiting...\nThank you");
						flag=false;
						break;
				}
			}
		}
		while(flag);	
	}
}