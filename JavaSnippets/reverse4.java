package sri;

public class reverse4 {
	public static void main(String[] args) {
		String word="creation";
		String word1=" ";
		for(int i=word.length()-1;i>=0;i--) {
		 word1=word1+word.charAt(i);
		}System.out.print(word1);
		System.out.println();
	if (word.equals(word1)) {
	   System.out.print("palindrome");
	}
	else {
		System.out.print("not palindrome");
	}
	

}}
