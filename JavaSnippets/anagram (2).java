package palgm;
public class anagram {
	public static void main(String[] args) {
		String s1="rat";
		String s2="art";
		if (s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if (s1.charAt(i)==s2.charAt(j)) {
						s2=s2.replaceFirst(""+s2.charAt(j), "");
						break;
					}
				}
			}
			if (s2.length()==0) {
				System.out.print("anagram");
			}
			else {
				System.out.print("not anagram");
			}
		}
		else {
			System.out.print("not anagram");
		}
	}
}
