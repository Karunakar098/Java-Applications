package mostUsedFunctionalInterfaces;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> f1;
		f1 = i -> 2 * i;
		Function<Integer, Integer> f2;
		f2 = i -> i * i;
		// aplying f1.andThen(f2)
		System.out.println(f1.andThen(f2).apply(2)); // 16 2*2 =4 4*4 = 16
		System.out.println(f1.andThen(f2).apply(10)); // 400 2*10 = 20*20 = 400

		// applying f1.compose(f2)
		System.out.println(f1.compose(f2).apply(2)); // 8 2*2 = 4*2 = 8
		System.out.println(f1.compose(f2).apply(10)); // 200 10*10 = 100*2 = 200

	}

}
