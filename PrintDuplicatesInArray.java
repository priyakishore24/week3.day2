package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		List<Integer> intdups = new ArrayList<Integer>();

		for (Integer eachdata : arr) {
			intdups.add(eachdata);
		}
		
		Collections.sort(intdups);
		System.out.println(intdups);
		
			for (int i = 1; i < intdups.size(); i++) {
				if (intdups.get(i - 1) == intdups.get(i)) {
					System.out.println(intdups.get(i));
				}
			}

		}

	}

