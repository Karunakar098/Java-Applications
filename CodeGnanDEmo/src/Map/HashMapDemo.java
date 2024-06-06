package Map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> countryCodeMap = new HashMap<>();
		countryCodeMap.put(01, "USA");
		countryCodeMap.put(91, "India");
		countryCodeMap.put(03, "Brazile");
		countryCodeMap.put(02, "China");

		System.out.println(countryCodeMap);
		// keySet()
		System.out.println(countryCodeMap.keySet());

		// entrySet()
		System.out.println(countryCodeMap.entrySet());

		// values()
		System.out.println(countryCodeMap.values());

		// to remove()
		countryCodeMap.remove(04);
		System.out.println(countryCodeMap);

	}

}
