package StreamsAPI.Terminal;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Akhil", "Bhaskar", "Chinni", "Anush");
		namesList.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

	}

}
