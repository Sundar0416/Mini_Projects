package were;

public class revfreq2 {
	public static void main(String[] args) {
		String s="A2B2C3";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				for(int j=0;j<s.charAt(i)-48;j++) {
					System.out.print(s.charAt(i-1));
				}
			}
		}
	}

}
