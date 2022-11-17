package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readingFromFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file2 = new File("F:\\java\\OOPS\\src\\FileHandling\\second.txt");
		file2.createNewFile();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file2))){
		   bw.write("Chaand and Baliyan");	
		   bw.newLine();
		   bw.write("Shabaz");
		   bw.newLine();
		   bw.write("Salim");
		   bw.newLine();
		   bw.write("Praful");
		   bw.newLine();
		   bw.write("Aarti");
		   bw.newLine();
		   System.out.println("Wrting onto the file completed");
		   bw.close();
			
		} catch (IOException e) {
			System.out.println("error occured, while creating writing onto file");
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file2));
			String line;
			System.out.println("***********************");
			
			//.readLine() returns null at the end of the file
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			//it is important to close the resources
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		//using scanner class to read file
		try {
			Scanner sc = new Scanner(new File("F:\\java\\OOPS\\src\\FileHandling\\second.txt"));
			String line;
			System.out.println("***************************");
			while(sc.hasNext()){
				//if ou want to read entire sentence then use sc.nextLine() instead of sc.next()!!
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading file");
		}
		
		//deleting a file
		File file3 = new File("F:\\java\\OOPS\\src\\FileHandling\\third.txt");
		if(file3.createNewFile()) System.out.println("third.txt has been created");
		
		if(file3.delete()) {
			System.out.println("third.txt has been deleted");
		}
		else {
			System.out.println("File not found");
		}
	}

}
