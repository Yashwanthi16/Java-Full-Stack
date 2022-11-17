package FileHandling;

import java.io.File;
import java.io.IOException;

public class creatingDirectory {

	public creatingDirectory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// providing absolute path where the directory needs to be created
		//refresh the panel to see changes!!
		//always better to use "\\" instead of forward single slash so that its compatible on any type of OS.
		File directory = new File("F:\\java\\OOPS\\src\\TEMP");
		directory.mkdirs();
		System.out.println("directory created");
		File file = new File("F:\\java\\OOPS\\src\\FileHandling\\test.txt");
		file.createNewFile();
		System.out.println("File created");

	}

}
