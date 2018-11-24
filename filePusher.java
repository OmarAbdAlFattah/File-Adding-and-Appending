import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
import java.text.*;

class filePusher{

  
  	public static void addToFile(String str, String fileName)throws IOException{
		
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(str);
		writer.close();
	}
	
  	public static void appendToFile(String str, String fileName)throws IOException {
		    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
		    writer.append(' ');
		    writer.append(str);
		     
		    writer.close();
	}
  
  	public static void main(String[] args)throws IOException {
		
      Scanner reader = new Scanner(System.in);
		System.out.print("Enter Data to add to file: ");
		String str = reader.nextLine();
		System.out.print("Enter the file name you wish to add the data to: ");
		String fileName = reader.nextLine();
		filePusher.addToFile(str, fileName);
		
		
		System.out.print("Enter Data to append to file: ");
		String strApp = reader.nextLine();
		System.out.print("Enter the file name you wish to append the data into: ");
		String appendFile = reader.nextLine();
		filePusher.appendToFile(strApp, appendFile);
		
		reader.close();
    }
}
//Add a comment at the end of the code