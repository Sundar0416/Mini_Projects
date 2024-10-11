package sundar;

import java.util.Scanner;

public class pattern13 {
	public static void main(String args[])
	{		
		 	StringBuilder sb = new StringBuilder("");  
			Scanner sc= new Scanner(System.in);
			
			System.out.println("*****Reverse Word Concept*****");
			System.out.println("Enter your value:");
			String word=sc.nextLine();
			System.out.println();
			System.out.println("Your value:"+word);
			System.out.println();
			char []ch=word.toCharArray();
			int revIndex=ch.length;
			char []chRev=new char[revIndex];
			for(int i=0;i<ch.length;i++) {
				System.out.println("ch["+i+"]="+ch[i]);
				chRev[revIndex-1]=ch[i];
				revIndex--;
			}
			System.out.println();
			for(int i=0;i<chRev.length;i++) {
				System.out.println("chRev["+i+"]="+chRev[i]);
				sb.append(chRev[i]);
				
			}
			System.out.println();
			System.out.println("Reverse Value:"+sb.toString());
			}
}