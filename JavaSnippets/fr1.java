package were;

public class fr1 {
	
	    public static void main(String[] args) {
	        String input = "A3a12H2j2D2";
	        String output = decodeCharacters(input);
	        System.out.println(output);
	    }
	    
	    public static String decodeCharacters(String input) {
	        StringBuilder output = new StringBuilder();
	        
	        for (int i = 0; i < input.length(); i += 2) {
	            char character = input.charAt(i);
	            int count = Character.getNumericValue(input.charAt(i + 1));
	            for (int j = 0; j < count; j++) {
	                output.append(character);
	            }
	        }
	        
	        return output.toString();
	    }
	}


