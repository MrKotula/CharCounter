package ua.com.foxminded.countercharacters;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		logger.info("input some text: ");
		String inputString = scan.nextLine();
		String result = new CharCounter().countCharacters(inputString);
		logger.info(result);
		scan.close();
	}
}
