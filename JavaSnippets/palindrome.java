package sri;

public class palindrome {
	public static void main(String[] args) {
		int pop;
		int rev=0;
		int n=12345;
		while  (n!=0){
			pop=n%10;
			rev=rev*10+pop;
			n=n/10;
			
		}System.out.println(rev);
		if(n==rev) {
			System.out.println("p");
		}else {
			System.out.println("np");
			
		}
}
/*	public static void main(String args[]) {
		String word="wertyu";
		String word1="";
		for(int i=word.length()-1;i>=0;i--) {
			word1=word1+word.charAt(i);
		}System.out.println(word1);
	}*/

}
