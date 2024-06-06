package IOStreams.charStreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		File file = new File("example.txt");
		try (FileReader reader = new FileReader(file)) {
			int Character;
			while ((Character = reader.read()) != -1) {
				System.out.print((char) Character);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
