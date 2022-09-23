package Week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Ar1 = { 3, 2, 11, 4, 6, 7 };
		int[] Ar2 = { 1, 2, 8, 4, 9, 7 };

		Set<Integer> set1 = new LinkedHashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		for (Integer array1 : Ar1) {

			set1.add(array1);

		}
		for (Integer array2 : Ar2) {

			set2.add(array2);

		}
		set1.retainAll(set2);
		set2.retainAll(set1);
		System.out.println("Intersection of 2 Array is " + set1);

	}

}
