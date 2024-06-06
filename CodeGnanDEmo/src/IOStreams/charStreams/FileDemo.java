package IOStreams.charStreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// File file = new File("codegnan.txt");
		// file.createNewFile();
		// System.out.println(file.exists());

		// create a directory/ folder
		// File file2 = new File("iostreams");
		// file2.mkdir();
		File myDirectory = new File("mydirectory");
		myDirectory.mkdir();

		File myFile1 = new File("mydirectory", "myfile1.txt");
		myFile1.createNewFile();
		File myFile2 = new File("mydirectory", "myfile2.txt");
		myFile2.createNewFile();

		// list the file contents of the directory
		String[] filesArray = myDirectory.list();
		for (String fileName : filesArray) {
			System.out.println(fileName);
		}

	}

}
