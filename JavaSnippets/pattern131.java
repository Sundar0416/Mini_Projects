package sundar;

public class pattern131 {
	public static void main(String[] args) {
		int[][] matrix=new int [4][5];
		matrix[1][1]=23;
		matrix[1][2]=43;
		matrix[1][3]=4;
		matrix[1][4]=5;
		matrix[2][1]=6;
		matrix[2][2]=78;
		matrix[2][3]=2;
		matrix[2][4]=666;
		matrix[3][1]=333;
		matrix[3][2]=43;
		matrix[3][3]=45;
		matrix[3][4]=65;
		for(int i=1;i<4;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}System.out.println();
		}
	
	}

}
