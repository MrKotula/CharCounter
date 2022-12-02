package ua.com.foxminded.countercharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CharCounterTest {
	private CharCounter testObject = new CharCounter();
	
	@Test
	void checkNullTest() {
		Assertions.assertThrows(NullPointerException.class, () -> 
		testObject.buildResultString(null));
	}

}
