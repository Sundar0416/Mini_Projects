package pgm;

public class table {
	public static void main(String[] args) throws Exception {
		int start=3;
		int end=6;
		for(int j=1;j<=10;j++) {
			for(int i=start;i<=end;i++) {
				int prod=i*j;
				System.out.print(j+"*"+i+"="+prod+"\t");
				Thread.sleep(100);
			}
			System.out.println();
		}
	}

}
