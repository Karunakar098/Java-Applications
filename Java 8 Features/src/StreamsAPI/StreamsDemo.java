package StreamsAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {

		String strArray[] = { "Apple", "Banana", "Cherry" };
		// create stream() method
		Stream<String> s1 = Arrays.stream(strArray);
		System.out.println(s1);

		// create of() method
		Stream<String> s2 = Stream.of(strArray);
		System.out.println(s2);

	}

}
