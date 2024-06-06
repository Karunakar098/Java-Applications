package mostUsedFunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating predicate
		Predicate<Integer> p;
		p = i -> (i < 20);

		// tesing predicate
		System.out.println(p.test(10)); // true
		System.out.println(p.test(33)); // false

	}

}
