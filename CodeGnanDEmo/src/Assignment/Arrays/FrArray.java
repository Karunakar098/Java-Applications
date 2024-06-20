package Assignment.Arrays;
//write a java program to find the frequency of each element in the array

public class FrArray {
	public static void main(String[] args) {
		int n[] = new int[] {2,3,4,2,3,4,5,6,7,8,9,5,6,4,3,2,5,6,7,8};
		int fr[] = new int[n.length];
		int counted = -1;
		for (int i = 0; i < n.length; i++) {
			int count = 1;
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					count++;
					fr[j] = counted;
				}
			}
			if (fr[i] != counted)
				fr[i] = count;
		}

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != counted) {
				System.out.println(n[i]+ " : " +fr[i]);
			}
		}
	}

}
