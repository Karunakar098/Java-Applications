package mostUsedFunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// check if the sum of 2 numbers is even
		BiPredicate<Integer, Integer> isSumEven;
		isSumEven = (a, b) -> ((a + b) % 2 == 0);

		// testing the bipredicate
		int x = 5;
		int y = 3;
		boolean result = isSumEven.test(x, y);
		System.out.println("Is the sum of " + x + "and " + y + "even?" + result);
	}

}
