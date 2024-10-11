package sri;

public class reverse5 {
	public static void main(String[] args) {
		String word="hello";
		String word1="";
		for(int i=word.length()-1;i>=0;i--) {
			word1=word1+word.charAt(i);
		
			
		}System.out.println(word1);
		if(word.equals(word1)) {
			System.out.print("p");
		}
		else {
			System.out.print("np");
		}
	}

}
