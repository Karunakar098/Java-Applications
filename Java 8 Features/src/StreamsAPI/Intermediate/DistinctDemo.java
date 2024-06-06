package StreamsAPI.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(10, 20, 50, 2, 3, 3, 3, 4, 5, 65, 66, 98, 66, 66);
		List<Integer> distinctNumbers = numbersList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNumbers);
	}

}
