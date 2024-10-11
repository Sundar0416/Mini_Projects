package sundar;

import java.util.Scanner;

public class pattern122 {
	public static void main(String[] args) {
		int sum=0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter the no. of digits:");
		int n = a.nextInt();
		
		
	/*	for(int i=1;i<=n;i++) {
			sum+=i;
		}
		*/
		
	/*	int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		*/
		int i=1;
		do {
			sum+=i;
			i++;
			
		}while(i<=n);
		System.out.println("sum:"+sum);
}}
