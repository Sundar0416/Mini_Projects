package palgm;

public class pos_neg_zero {
	public static void main(String[] args) {
		int[] arr= {2,1,0,-8,-9};
		int pos_cnt=0;
		int neg_cnt=0;
		int zero_cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				pos_cnt++;
			}
			else if(arr[i]<0) {
				neg_cnt++;
			}
			else if(arr[i]==0) {
				zero_cnt++;
			}
			
		}
		System.out.print((float)pos_cnt/arr.length+","
		                 +(float)zero_cnt/arr.length+","
				         +(float)neg_cnt/arr.length);
	}

}
