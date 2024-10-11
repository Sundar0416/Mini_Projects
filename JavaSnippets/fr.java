package were;

public class fr {
	
	   public static void main(String[] args) {
	        String s = "AAAaaaaaaaaaaaaaaaaHHjjDD";
	        String output = countCharacters(s);
	        System.out.println(output);
	    }
	    
	    public static String countCharacters(String s) {
	        StringBuilder output = new StringBuilder();
	        
	        int count = 1;
	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) == s.charAt(i - 1)) {
	                count++;
	            } else {
	                output.append(s.charAt(i - 1));
	                output.append(count);
	                count = 1;
	            }
	        }
	        
	        output.append(s.charAt(s.length() - 1));
	        output.append(count);
	        
	        return output.toString();
	    }
	}

	
	



