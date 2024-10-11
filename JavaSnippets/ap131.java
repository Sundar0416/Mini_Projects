package were;

public class ap131 {
	
	    public static void main(String[] args) {
	        int n = 5;
	        char c = 'E';
	        for (int i = 0; i < n; i++) {
	        	
	            for (int j = n - i; j > 0; j--) {
	                System.out.print(c);
	                c--;
	            }
	            c += (i + 2);
	            System.out.println();
	        }
	    }
	}



