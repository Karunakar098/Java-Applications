package mostUsedFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// define consumer that takes an integer and calculate the square
		Consumer<Integer> squareConsumer = x -> System.out.println(x * x);
		// list of integer
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		// use the consumer to print square of each number
		for (Integer number : numbers)
			squareConsumer.accept(number);

	}

}
