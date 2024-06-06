package StreamsAPI.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Akhil","Bhaskar","Chinni","Anush");
		List<Integer> nameLengthList = namesList.stream().map(String::length).collect(Collectors.toList());
		System.out.println(nameLengthList);

	}

}
