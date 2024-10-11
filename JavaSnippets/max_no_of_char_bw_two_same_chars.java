package palgm;

public class max_no_of_char_bw_two_same_chars {
	
	    public static void main(String[] args) {
	        String input = "bacdera";
	        System.out.println(maxCharsBetweenSame(input));
	    }

	    public static int maxCharsBetweenSame(String str) {
	        int maxLength = -1;

	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    int lengthBetween = j - i - 1;
	                    if (maxLength<lengthBetween) {
	                        maxLength = lengthBetween;
	                    }
	                }
	            }
	        }

	        return maxLength;
	    }
	}

