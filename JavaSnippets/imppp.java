package palgm;

public class imppp {
	public static void main(String[] args) {
		String a="set";
		String b="sangeet";
		System.out.println(subsequence(a,b));
		
	}
	public static String subsequence(String a,String b) {
		int pointer_a=0;
		int pointer_b=0;
		while(pointer_a<a.length() && pointer_b<b.length()) {
			if(a.charAt(pointer_a)==b.charAt(pointer_b)) {
				pointer_a++;
			}
			pointer_b++;
		}
		if(pointer_a==a.length()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}