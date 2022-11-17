package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingIntoFiles {

	public writingIntoFiles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		File file2 = new File("F:\\java\\OOPS\\src\\FileHandling\\first.txt");
		file2.createNewFile();
		//(file, true) means we are appending to existing text!!
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2,true));
		   bw.write("Chaand");	
		   bw.newLine();
		   bw.write("Shabaz");
		   bw.newLine();
		   bw.write("Salim");
		   bw.newLine();
		   bw.write("Praful");
		   bw.newLine();
		   bw.write("Aarti");
		   bw.close();
		   //if we don't want to write bw.close then choose try with resources(it will be showing in the suggestions..
		   System.out.println("Wrting onto the file completed");
			
		} catch (IOException e) {
			System.out.println("error occured, while creating writing onto file");
		}
		
		
	}

}
