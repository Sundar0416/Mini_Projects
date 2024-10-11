package palgm;
import java.util.Scanner;
public class multi_char {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");  //a2b3c4d10
		String s=sc.nextLine();
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			int num=0;
			if(ch[i]>='0' && ch[i]<='9') {
				char temp=ch[i-1];
				for(int j=i;j<ch.length;j++) {
					if(ch[j]>='0' && ch[j]<='9') {
						num=(num*10)+ch[i]-48;
					}
					else {
						break;
					}
					i++;
				}
				for(int k=0;k<num;k++) {
					System.out.print(temp);
			}
			
			}
		}
	}
}


