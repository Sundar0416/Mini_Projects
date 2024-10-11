package sri;

public class multidimentional {
	public static void main(String[] args) {
		int[][] mat=new int[3][4];
		mat[1][1]=12;
		mat[1][2]=11;
		mat[1][3]=13;
		mat[2][1]=15;
		mat[2][2]=23;
		mat[2][3]=27;
		for(int i=1;i<3;i++) {
			for(int j=1;j<4;j++) {
				System.out.println(mat[i][j]);
				System.out.println(" ");
			}System.out.println();
		}
	}

}
