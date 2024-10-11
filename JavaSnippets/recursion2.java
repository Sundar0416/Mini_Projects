package sundar;

public class recursion2 {
	public static void main(String[] args) {
		whole_no(20);
	}
	public static void whole_no(int n) {
		if(n==0) {
			System.out.println(0);
		}
		else {
			System.out.println(n);
			
			whole_no(n-1);
		}
	}

}
