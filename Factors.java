import java.util.ArrayList;


public class Factors {

	public static ArrayList<Integer> generateFactors(int i) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (i > 1) {
			ret.add(2);
		}
		return ret;
	}

}
