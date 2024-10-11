package were;

public class newmis {
	public static void main(String[] args) {
		int n=6;
		int s1=0,s2=0;
		int[] arr= {3,2,4,6,1};
		for(int i=1;i<=n;i++) {
			s1=s1+i;		
			}
		for(int i=0;i<arr.length;i++) {
			s2=s2+arr[i];		
			}
		System.out.print(s1-s2);
	}

}
