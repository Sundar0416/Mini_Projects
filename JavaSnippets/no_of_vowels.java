package palgm;

public class no_of_vowels {
	public static void main(String[] args) {
		String s="zoho";
		String v="aeiou";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<v.length();j++) {
				if(s.charAt(i)==v.charAt(j)) {
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println(count);
		}
		else {
			System.out.println("No vowels are present");
		}
		
	}
}