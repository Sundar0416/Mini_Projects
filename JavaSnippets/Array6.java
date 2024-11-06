package pgm;

public class Array6 {
	public static void main(String[] args) {
		int[] arr= {-2,4,-8,4};
		int[] pre=new int[arr.length];
		pre[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			pre[i]=pre[i-1]+arr[i];
		}
		int max=Integer.MIN_VALUE;
		int cs=0;
		for(int i=0;i<arr.length;i++) {
			int start=i;
			for(int j=i;j<arr.length;j++) {
				int end=j;
				cs=(start==0)?pre[end]:pre[end]-pre[start-1];
				if(cs>max) {
					max=cs;
				}
				System.out.print(cs+" ");
			}
			System.out.println();
		}
		System.out.println(max);
		
	}
}
//-2 2 -6 -2 
//4 -4 0 
//-8 -4 
//4 

//4



