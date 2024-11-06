package pgm;

public class StringReverse3 {
	public static void main(String[] args) {
		String str= "hello welcome to java";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			String word=words[i];
			System.out.print(word+" ");
			
		}
	}
}

