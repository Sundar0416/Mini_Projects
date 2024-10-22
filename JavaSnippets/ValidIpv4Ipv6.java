package palgm;

public class ValidIpv4Ipv6 {
	public static void main(String[] args) {
        String s1 = "222.111.111.111";
        String s2="2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        String res1=validIPV4(s1);
        String res2=validIPV6(s2);
        System.out.println(res1);
		System.out.println(res2);
    }
    
    public static String validIPV4(String s1) {
        if (s1 == null || s1.isEmpty())
            return "neither";
        String arr[] = s1.split("\\.");
        if (arr.length != 4)
            return "neither";
        for (int i = 0; i < arr.length; i++) {
        	String segment=arr[i];
            if (segment.isEmpty())
                return "neither";
            try {
                int n = Integer.valueOf(segment); 
                if (n < 0 || n > 255 || (segment.charAt(0) == '0' && segment.length() > 1)) {
                    return "neither";
                }
            } catch (NumberFormatException e) {  
                return "neither";
            }
        }
        return s1;  
    }
    public static String validIPV6(String s2) {
		if(s2==null || s2.isEmpty())
			return "neither";
		String[] arr=s2.split(":");
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
		return s2;
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