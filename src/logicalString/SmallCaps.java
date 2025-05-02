package logicalString;

import java.util.LinkedHashMap;
import java.util.Map;

public class SmallCaps {

	public static void main(String[] args) {
		String str = "aabbbccccdddd";
		
		char[] ch2 = str.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<>();
		
		for(char c : ch2) {
			if(mp.containsKey(c)) {
				int count = mp.get(c);
				mp.put(c, count+1);
			}else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
		
		for(char key:mp.keySet()) {
			System.out.print(key+""+mp.get(key));
		}
		
	}
}
