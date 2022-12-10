package ua.com.foxminded.countercharacters;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCounter implements CounterInterface {
	private static final StringBuilder RESULT = new StringBuilder();
	private static final StringBuilder NEXT_LINE = new StringBuilder("\n");
	private static final StringBuilder SEPARATOR_LINE = new StringBuilder("\"");
	private static final StringBuilder HYPHEN = new StringBuilder(" - ");

	public String countCharacters(String inputString) {
		char[] chars = inputString.toCharArray();
		Map<Character, Integer> countMap = new LinkedHashMap<>();

		for (char aChar : chars) {
			if (countMap.containsKey(aChar)) {
				countMap.put(aChar, countMap.get(aChar) + 1);
			} else {
				countMap.put(aChar, 1);
			}
		}
		return buildResultString(countMap);
	}

	private String buildResultString(Map<Character, Integer> countMap) {
		for (Map.Entry<Character, Integer> e : countMap.entrySet()) {
			RESULT.append(SEPARATOR_LINE).append(e.getKey()).append(SEPARATOR_LINE).append(HYPHEN).append(e.getValue()).append(NEXT_LINE);
		}
		return RESULT.toString();
	}

}
