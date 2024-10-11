package sundar;

import java.util.Scanner;

public class pattern120 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter P or A or O:");
	    char attendance = a.next().charAt(0);
	    switch (attendance) {
	    case 'P':
	    	System.out.println("present");
	    	break;
	    case 'A':
	    	System.out.println("Absent");
	    	break;
	    case 'O':
	    	System.out.println("On-Duty");
	    	break;
	    default:
	    }
	}
	

}
