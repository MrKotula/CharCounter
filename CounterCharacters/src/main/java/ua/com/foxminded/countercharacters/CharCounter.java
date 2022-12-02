package ua.com.foxminded.countercharacters;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCounter implements CounterInterface {
	private static final StringBuilder RESULT = new StringBuilder();
	private static final StringBuilder NEXT_LINE = new StringBuilder("\n");

	public String buildResultString(String inputString) {
		char[] chars = inputString.toCharArray();
		HashMap<Character, Integer> countMap = new LinkedHashMap<>();

		for (char aChar : chars) {
			if (countMap.containsKey(aChar)) {
				countMap.put(aChar, countMap.get(aChar) + 1);
			} else {
				countMap.put(aChar, 1);
			}
		}

		for (Map.Entry<Character, Integer> e : countMap.entrySet()) {
			RESULT.append("\"").append(e.getKey()).append("\"").append(" - ").append(e.getValue()).append(NEXT_LINE);
		}
		return RESULT.toString();
	}

}
