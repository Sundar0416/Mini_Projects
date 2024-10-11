package sundar;

public class oops2 {
	public static void main(String args[]) {
		whole(10);
	}
	
	public static void whole(int n) {
		
		if (n==0){
			System.out.println(0);
		}
		else {
			System.out.println(n);
			whole(n-1);
		}
	}}
    

