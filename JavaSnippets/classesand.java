package sundar;


class ppform{
	String name;
	int rollno;
	

public void display() {
	System.out.println(name);
	System.out.println(rollno);
	
}
public void setvalues(String str,int num) {
	 name=str;
     rollno=num;
	}
}
class Main{
public static void main(String args[]) {
	ppform codeio=new ppform();
	codeio.name="hello";
	codeio.rollno=31;
	codeio.display();
	
	ppform viewers=new ppform();
	viewers.name="hi";
	viewers.rollno=333;
	viewers.display();
	
	
}}


