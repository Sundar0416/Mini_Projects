package sundar;
import java.util.Scanner;
public class pattern118 {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("enter P or A:");
	    char attendance = a.next().charAt(0);
	    
	
		System.out.println("enter the strength(below or above 50):");
		int strength = a.nextInt();
		
		  
		
		System.out.println("enter the String:");
		String Sriram = a.nextLine();
			 
	 
		
	    if(attendance=='P') {
	    	if(strength>=50) {
	    		System.out.println("class will start");
	    	}
	    	else if (strength<50){
	    		System.out.println("class won't start");
	    	}
	    	else {
	    		System.out.println("invalid syntex1");
	    	}
	 
	    }
	    else if(attendance=='A') {
	    	System.out.println("school is closed");
	    }
	    else {
	    	System.out.println("invalid syntex");
	    }
	    System.out.println("end pgm");
	   
	
	}

}

