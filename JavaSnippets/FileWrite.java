package sundar;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
	    try {
	      FileWriter myWriter = new FileWriter("D:\\ann\\Test.txt");
	      myWriter.write("Hi Sathish,how are you? i am fine.");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }

}
