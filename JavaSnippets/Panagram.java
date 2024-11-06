package pgm;

public class Panagram {
	public static void main(String[] args) {
		String s="The Quick brown fox jumps over the lazy dog";
		String res=pan(s.toLowerCase());
		System.out.println(res);
	}
	public static String pan(String s) {
		if(s.length()<26) {
			return "not panagram";
		}
		else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return "not panagram";
				}
			}
		}
		return "panagram";
	}
}

