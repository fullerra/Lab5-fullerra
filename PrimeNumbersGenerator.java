package PrimeNumbersGeneration;

import java.util.ArrayList;

public class PrimeNumbersGenerator {

	public static ArrayList<Integer> generatePrimeNumbers(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if (i-1 > 1) {
			ret.add(i);
		}
		return ret;
	}

}
