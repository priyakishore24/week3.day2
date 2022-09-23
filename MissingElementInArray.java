package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		List<Integer> arrlist = new ArrayList<Integer>();

		for (Integer eachdata : arr) {
			arrlist.add(eachdata);
		}

		Collections.sort(arrlist);

		for (int i = 0; i <= arrlist.size(); i++) {

			if ((arrlist.get(i)!=i+1)) {

				System.out.println("Missig Element from the given array is ----" + (i+1));
				break;
			}
		}

	}

}
