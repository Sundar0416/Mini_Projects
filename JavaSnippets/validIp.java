package palgm;

public class validIp {
    public static void main(String[] args) {
        String input = "222.111.111.111";
        String res=validIPV4(input);
        System.out.println(res);
    }
    
    public static String validIPV4(String IP) {
        if (IP == null || IP.isEmpty())
            return "neither";

        String arr[] = IP.split("\\.");
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
        return IP;  
    }
}
/*
 
 IP is null or empty ("neither")
 
 split the IP string using "."
 
 store it in the string arr    {222,111,111,111}
 
 */
 