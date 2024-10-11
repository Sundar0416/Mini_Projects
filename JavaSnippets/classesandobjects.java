package sundar;
	class Appform{
		String name;
		int rollno;
		
	
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
		
	}
	public static void main(String args[]) {
		Appform codeio=new Appform();
		codeio.name="hello";
		codeio.rollno=31;
		codeio.display();
	}}


