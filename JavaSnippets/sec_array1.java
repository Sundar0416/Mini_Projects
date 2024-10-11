package sri;

public class sec_array1 {
	public static void main(String[] args) {
		//int[][] arr=new int[2][3];
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==0||i==arr.length-1||j==0||j==arr[i].length-1) {     //arr[i][j]%2==0
					System.out.print(arr[i][j]);                          //i>=j  major diagonal
				}                                                         //i<=j  minor diagonal
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		//System.out.print(arr[i][j]);
	}

}
