package Week3.Day2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };

		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i : input) {

			if (map.containsKey(i)) {

				map.put(i, map.get(i) + 1);
			} else {

				map.put(i, 1);
			}

		}

		System.out.println(map);
		
Set<Entry<Integer, Integer>> entrySet = map.entrySet();

int maxOccurence = 0;
int maxCharacter = 0;

for (Entry<Integer, Integer> eachentry : entrySet) {
	
	Integer key = eachentry.getKey();
	Integer value = eachentry.getValue();
	
	System.out.println(key +"----->" +value );
	
// if (eachentry.getValue() > maxOccurence) {
//	 maxCharacter = eachentry.getKey();
//	 maxOccurence = eachentry.getValue();
// }
// 
//	System.out.println(maxCharacter +"------>"+ maxOccurence);
}



	}

}
