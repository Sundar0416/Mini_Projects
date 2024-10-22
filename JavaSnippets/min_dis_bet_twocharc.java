package palgm;

public class min_dis_bet_twocharc {
	public static void main(String[] args) {
		int[] arr= {7,3,4,5,6,4,3,7};     //{1,2,3,4,5,6,7}
		boolean flag=false;
		int length = 0;
		int minDist = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					length=j-i;
					if(length<minDist) {
						minDist=length;
						flag=true;
					}
				}
			}
		}
		if(flag) {
			System.out.println(minDist);
		}
		else {
			System.out.println("-1");
		}
		
	}
}
