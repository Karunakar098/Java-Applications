package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Raghu");

		for (Map.Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
