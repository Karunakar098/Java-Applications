package mostUsedFunctionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<String, Integer> c;
		c = (name, age) -> System.out.println("Name : " + name + " , Age : " + age);
		c.accept("sai", 24);
	}

}
