package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargestNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		
		 List<Integer> intdata = new ArrayList<Integer>();
		
		 
		 for (Integer ID : data) {
		intdata.add(ID);
		}
		
		Collections.sort(intdata);
		System.out.println(intdata);
		System.out.println("Second largest element: "+ intdata.get(intdata.size()-2));
		
		
		
		
		
	}
	
}
