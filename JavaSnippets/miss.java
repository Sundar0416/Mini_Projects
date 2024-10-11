package were;

public class miss {
	public static void main(String args[]) {
		int[] arr= {30,15,20,10,5};
		int n=30,s1=0,s2=0;
		for(int i=5;i<n;i+=5) {
			s1=s1+i;
		}
		for(int i=1;i<arr.length;i++) {
			s2=s2+arr[i];
		}System.out.print(s1-s2);
	}
}
