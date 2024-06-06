package IOStreams.charStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("example.txt");
		file.createNewFile();

		FileWriter writer = new FileWriter(file);
		writer.write("Hello World! \n");
		writer.write("Attending IO Streams \n");
		writer.write('C');
		writer.write("\n");
		char[] vowelsArray = { 'a', 'e', 'i', 'o', 'u' };
		writer.write(vowelsArray);
		writer.flush();
		writer.close();

	}

}
