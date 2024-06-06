package mostUsedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<Integer, Integer> f;
		f = i -> i * i;
		// display the result
		System.out.println(f.apply(9)); // 81
		System.out.println(f.apply(23)); // 529

	}

}
