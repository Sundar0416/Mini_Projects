package MDA;

public class sum {
	public static void main(String[] args) {
		int[][]a= {{1,3,4},{2,6,0},{1,8,4}};
		int[][]b= {{4,2,3},{4,3,5},{5,1,0}};
		traverse(a);
		System.out.println();
		traverse(b);
		System.out.println();
		int[][]ans=addTwoMatrix(a,b);
		System.out.println();
		traverse(ans);
	}
	public static void traverse(int[][]x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] addTwoMatrix(int[][]a,int[][]b){
		int[][]res=new int[a.length][];
		for(int i=0;i<a.length;i++) {
			res[i]=new int[a[i].length];
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}
} 