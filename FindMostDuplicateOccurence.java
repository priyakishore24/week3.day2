package Week3.Day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostDuplicateOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abbaba";

		Map<Character, Integer> inp = new LinkedHashMap<Character, Integer>();

		char[] charArray = input.toCharArray();
		for (char ch : charArray) {

			if (inp.containsKey(ch)) {
				inp.put(ch, inp.get(ch) + 1);
			} else {
				inp.put(ch, 1);
			}
		}
		
		System.out.println(inp);
		
		Set<Entry<Character, Integer>> entrySet = inp.entrySet();
		
		char maxChar = 0;
		int maxOccur = 0;
		
		for (Entry<Character, Integer> eachEntry : entrySet) {
			
			if(eachEntry.getKey() > maxChar) {
				
				maxChar = eachEntry.getKey();
				maxOccur = eachEntry.getValue();
				
			}
		}
		System.out.println(maxChar+"=="+maxOccur);
	}

}
