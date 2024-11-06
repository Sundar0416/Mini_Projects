package palgm;

public class StringRotation {
	public static void main(String[] args) {
		String str="abcd";
		String RotStr="bcda";
		System.out.println(isRotation(str, RotStr));
	}
	public static boolean isRotation(String str, String RotStr){
		boolean flag=false;
		if(str==null || RotStr==null)
			return flag;
		if(str.length()!=RotStr.length())
			return flag;
		String concat=str+str;
		if(concat.contains(RotStr))
			flag=true;
	return flag;
	}
}

