package palgm;

import java.util.Arrays;

public class very_imp_odd_even1 {
	public static void main(String[] args) {
		int[] arr= {13,2,4,15,12,10,5};
		int eve_cnt=0;
		int odd_cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				eve_cnt++;
			}
			else {
				odd_cnt++;
			}
		}
		int[] even=new int[eve_cnt];
		int[] odd=new int[odd_cnt];
		int even_index=0;
		int odd_index=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				even[even_index++]=arr[i];
			}
			else {
				odd[odd_index++]=arr[i];
			}
		}
		for(int j=1;j<even.length;j++) {
			for(int i=0;i<even.length-j;i++) {
				if(even[i]>even[i+1]) {
					int temp=even[i];
					even[i]=even[i+1];
					even[i+1]=temp;
				}
			}
		}
		for(int j=1;j<odd.length;j++) {
			for(int i=0;i<odd.length-j;i++) {
				if(odd[i]<odd[i+1]) {
					int temp=odd[i];
					odd[i]=odd[i+1];
					odd[i+1]=temp;
				}
			}
		}
		int even_i=0;
		int odd_i=0;
		int[] evod=new int[even.length+odd.length];
		for(int i=0;i<evod.length;i++) {
			if(i%2==0) {
				evod[i]=even[even_i++];
			}
			else {
				evod[i]=odd[odd_i++];
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(evod));
	}
}
