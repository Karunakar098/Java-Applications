package IOStreams.charStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("codegnan.txt");
		FileWriter writer = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(writer);
		char[] charArray = { 'a', 'e', 'i', 'o', 'u' };
		bWriter.write(charArray);
		bWriter.newLine();
		bWriter.write("Codegnan Hyderbad");
		bWriter.flush();
		bWriter.close();
	}

}
