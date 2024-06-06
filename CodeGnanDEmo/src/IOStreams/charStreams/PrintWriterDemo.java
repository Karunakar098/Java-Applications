package IOStreams.charStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		PrintWriter writer = new PrintWriter("myfile1.txt");

		File fileObj = new File("myfile1.txt");
		fileObj.createNewFile();
		PrintWriter writer1 = new PrintWriter(fileObj);

		FileWriter fwriter = new FileWriter("myfile1.txt");
		PrintWriter writer2 = new PrintWriter(fwriter);

		writer.write(100);
		writer.println(200);
		writer.println(true);
		writer.println('m');
		writer.println("Codegnan It Solutions");
		writer.close();
		writer1.close();
		writer2.close();
	}

}
