package palgm;

import java.util.Arrays;

public class X_pat {
	public static void main(String[] args) {
		String s="12345";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i==j) {
					System.out.print(s.charAt(i));
				}
				else if(i+j==s.length()-1) {
					System.out.print(s.charAt(j));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}