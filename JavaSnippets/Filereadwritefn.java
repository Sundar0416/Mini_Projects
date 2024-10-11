package sundar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Filereadwritefn {
	public static void main(String args[])  
    {
		StringBuffer sb=new StringBuffer(); 
		File myObj = new File("E:\\New folder\\demo_"+Math.random()+".txt");
		try  
    	{  
    		File file=new File("D:\\ann\\Test.txt");    //creates a new file instance  
    		FileReader fr=new FileReader(file);   //reads the file  
    		BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
 
    		String line;  
    		while((line=br.readLine())!=null)  
    		{  
    			sb.append(line);      //appends line to string buffer  
    			sb.append("\n");     //line feed   
    		}  
    		fr.close();    //closes the stream and release the resources  
    		System.out.println("Contents of File: ");  
    		System.out.println(sb.toString());   //returns a string that textually represents the object  
    	}  
    	catch(IOException e)  
    	{  
    		e.printStackTrace();  
    	}  
		 try {
			    String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new java.util.Date());
			      myObj = new File("E:\\New folder\\demo_"+timeStamp+".txt");
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		try {
		      FileWriter myWriter = new FileWriter("E:\\New folder\\"+myObj.getName());
		      myWriter.write(sb.toString());
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
    }  

}
