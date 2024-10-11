package pgm;

public class Xyl_phlo {
	public static void main(String[] args) {
		int num=321212;
		int orig=num;
		int first=0;
		int last=num%10;
		num=num/10;
		int F_L_sum=0;
		int M_sum=0;
		while(num>9) {
			int pop=num%10;
			M_sum=M_sum+pop;
			num=num/10;
		}
		first=num;
		F_L_sum=first+last;
		if(F_L_sum==M_sum) {
			System.out.println(orig +" is Xylem");
		}
		else {
			System.out.println(orig +" is Phloem");
		}
	}

}
