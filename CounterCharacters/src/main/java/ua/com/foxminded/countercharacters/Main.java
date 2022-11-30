package ua.com.foxminded.countercharacters;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
	private static final Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		String inputSomeText;
		String result;
		Scanner scan = new Scanner(System.in);
		
		logger.info("input some text: ");
		inputSomeText = scan.nextLine();
		result = new CharCounter().countOfchar(inputSomeText);
		logger.info(result);
		scan.close();

	}
}
