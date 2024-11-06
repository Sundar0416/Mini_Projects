package MDA;

public class pro2 {
	public static void main(String[] args) {
		int[][]arr= {{12,15,15,14},{14,16,24,31},{41,43,44,83}};
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=arr[i].length-1;j>=0;j--) {
				if(arr[i][j]%2==0) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
}
//System.out.print(arr[i][j]+" ");