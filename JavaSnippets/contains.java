package interview;

public class contains {
	public static void main(String[] args) {
		String s1="Sunday is a day";
		String s2="is";
		boolean contains=false;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				int count=0;
				for(int j=0;j<s2.length();j++) {
					if(s2.charAt(j)==s1.charAt(i)) {
						count++;
						i++;
					}
					
				}
				if(count==s2.length()) {
					contains=true;
					System.out.print("contains");
					break;
				}
				else {
					System.out.print("not contains");
					break;
				}
			}
			else if(contains==false){
				System.out.print("not contains");
				break;
			}
		}
	}

}
