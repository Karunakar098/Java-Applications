package StreamsAPI.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Nani","Akhil","Bhaskar","Chinni","Anush");
		List<String> filteredList = namesList.stream().sorted().collect(Collectors.toList());
		System.out.println(filteredList);
	}

}
