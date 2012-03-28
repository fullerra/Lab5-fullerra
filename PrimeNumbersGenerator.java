package PrimeNumbersGeneration;

import java.util.ArrayList;

public class PrimeNumbersGenerator {

	public static ArrayList<Integer> generatePrimeNumbers(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candidate = 2; candidate < i; candidate++) {
			for (int j = candidate; j > 1; j--) {
				if (j == 2) {
					ret.add(candidate);
				}
			}
		}
		return ret;
	}

}
