import java.util.ArrayList;


public class PrimeFactors {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int candidate = 2; i > 1; candidate++) {
			while (i % candidate == 0) {
				ret.add(candidate);
				i /= candidate;
			}
		}
		
		if (i > 1) {
			ret.add(i);
		}
		return ret;
	}

}
