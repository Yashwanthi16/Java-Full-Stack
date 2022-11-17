package FileHandling;

import java.io.File;
import java.io.IOException;

public class creatingFile {

	public static void main(String[] args) throws IOException {
		{
			File file = new File("StudyEasy.txt");
			file.createNewFile();
			System.out.println("File created");
		//creates path in the current project OOPS!!
		}
	}

}
