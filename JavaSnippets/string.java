package sri;

public class string {
	public static void main(String[] args) {
		String word="  hello"+"   hi";
		System.out.print(word);
		System.out.println();
		System.out.print(word.endsWith("s"));
		System.out.println();
		System.out.print(word.startsWith("s"));
		System.out.println();
		System.out.print(word.length());
		System.out.println();
		System.out.print(word.indexOf("o"));
		System.out.println();
		System.out.print(word.replace("e", "a"));
		System.out.print(word.toUpperCase());
		System.out.print(word.toLowerCase());
		System.out.print(word.trim());
	}

}
