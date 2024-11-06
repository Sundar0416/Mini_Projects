package palgm;
public class abc {
	public static void main(String[] args) {
		String s="aba";
		int n=10;
		System.out.println(find_a_count_in_infinite_string(s,n));
	}
	public static long find_a_count_in_infinite_string(String s,int n) {
		long a_count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				a_count++;
			}
		}
		long fullRepetition = n/s.length();
		a_count *= fullRepetition;               
		int remainingCharacters=n%s.length();
		for(int i=0;i<remainingCharacters;i++) {
			if(s.charAt(i)=='a') {
				a_count++;
			}
		}
		return a_count;
	}
}