package mostUsedFunctionalInterfaces;

import java.util.function.Supplier;

public class SuplierDemo {

	public static void main(String[] args) {

		// define a suplier in random numbers
		Supplier<Double> randomNumberSupplier;
		randomNumberSupplier = () -> Math.random();

		// get a random number for suplier
		double randomNumber = randomNumberSupplier.get();
		System.out.println("Random Number is : " + randomNumber);
	}

}
