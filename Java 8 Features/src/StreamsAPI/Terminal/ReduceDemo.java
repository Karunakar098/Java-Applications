package StreamsAPI.Terminal;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbersList.parallelStream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
