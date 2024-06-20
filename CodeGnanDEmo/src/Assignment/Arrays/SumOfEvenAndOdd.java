package Assignment.Arrays;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int even = 0, odd = 0;
		int l = n.length;

		// Loop to find even, odd sum
		for (int i = 0; i < l; i++) {
			if (n[i] % 2 == 0) {

				even = even + n[i];
			} else {

				odd = odd + n[i];
			}
		}
		System.out.println("sum of even numbers is :" + even);
		System.out.println("|sum of odd numbers is : " + odd);
	}

}
