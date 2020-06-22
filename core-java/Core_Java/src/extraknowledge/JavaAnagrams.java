package extraknowledge;

import java.util.HashMap;
import java.util.Scanner;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
		boolean anagram = true;
		Character[] charSet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		HashMap<Character, Integer> aCharFreq = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bCharFreq = new HashMap<Character, Integer>();
		intializeMap(aCharFreq, charSet);
		intializeMap(bCharFreq, charSet);
		a = a.toUpperCase();
		b = b.toUpperCase();

		// set frequency for both
		for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
			Character c1 = a.charAt(i); // O(1)
			Integer f1 = aCharFreq.get(c1);
			aCharFreq.put(c1, ++f1);
			Character c2 = b.charAt(i); // O(1)
			Integer f2 = bCharFreq.get(c2);
			bCharFreq.put(c2, ++f2);
		}

		// Compare Map
		for (Character chars : charSet) {
			if (!aCharFreq.get(chars).equals(bCharFreq.get(chars))) {
				anagram = false;
			}
		}
		return anagram;
	}

	static void intializeMap(HashMap<Character, Integer> map, Character[] charSet) {
		for (Character chars : charSet) {
			map.put(chars, 0);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
