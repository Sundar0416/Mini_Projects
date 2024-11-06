package MDA;

public class sumSingle {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {3,6,8,4,1};
		traverse(a);
		System.out.println();
		traverse(b);
		System.out.println();
		int[] res=addTwo(a,b);
		traverse(res);
	}
	public static void traverse(int[] x) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
	public static int[] addTwo(int[]a,int[]b) {
		int[] ans=new int[a.length];
		for(int i=0;i<ans.length;i++) {
			ans[i]=a[i]+b[i];
		}
		return ans;
	}
}