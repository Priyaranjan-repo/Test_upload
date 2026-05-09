package Interview;

import java.util.HashMap;
import java.util.Map;

public class DupCharUsingMap {

	public static void main(String[] args) {

		String str = "Hello java program";

		// char word[] = str.tocharr();
		// map<ch,inte> ch = new h ashmap<>();

		//
		// for(char ch :word){
		// if(map.containskey()){
		// map.put(ch,map.get(ch+1));
		// else {

		// map.put(ch,1);
		// for( Character c :map.keySet)){
		// if(map.get(c)>1{
		// sop(c+"="map.get(c));

		Map<Character, Integer> charMap = new HashMap();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);

			} else {
				charMap.put(ch, 1);

			}
		}

		for (Character c : charMap.keySet()) {
			if (charMap.get(c) > 1) {
				System.out.println("duplicate word:  " + c);
			}

		}
	}
}
