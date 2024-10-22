package palgm;

public class validIPV6 {
	public static void main(String[] args) {
		String s="2001:0db8:85a3:0000:0000:8a2e:0370:7334";
		String res=validIPV6(s);
		System.out.println(res);
	}
	public static String validIPV6(String s) {
		if(s==null || s.isEmpty())
			return "neither";
		String[] arr=s.split(":");
		if(arr.length!=8)
			return "neither";
		for(int i=0;i<arr.length;i++) {
			String segment=arr[i];
			if(segment.length()>4 || segment==null)
				return "neither";
			for(int j=0;j<segment.length();j++) {
				char ch=segment.charAt(j);
				boolean res=hexadecimal(ch);
				if(!res)
					return "neither";
			}
		}
		return s;
	}
	public static boolean hexadecimal(char ch) {
		if(ch>='0' && ch<='9')
			return true;
		if(ch>='a' && ch<='f')
			return true;
		if(ch>='A' && ch<='F')
			return true;
		return false;
	}
}