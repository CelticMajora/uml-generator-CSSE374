package Displays;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class FileDisplayTest {

	private Display testDisplay;

	@Before
	public void setup() {
		testDisplay = new FileDisplay();
	}

	@Test
	public void testDisplayWithText() {
		String testText = "Example generated UML code";
		testDisplay.display(testText);
		File tempDirectory = new File("temp");
		File toCheck = tempDirectory.listFiles()[tempDirectory.listFiles().length - 1];
		Scanner scanner;
		try {
			scanner = new Scanner(toCheck);
			scanner.useDelimiter("\\Z");
			assertEquals(testText, scanner.next());
		} catch (FileNotFoundException e) {
			fail(String.format("Could not find file %s", toCheck.toString()));
			e.printStackTrace();
		}
	}

	@Test
	public void testDisplayWithoutText() {
		String testText = "";
		testDisplay.display(testText);
		File tempDirectory = new File("temp");
		File toCheck = tempDirectory.listFiles()[tempDirectory.listFiles().length - 1];
		Scanner scanner;
		try {
			scanner = new Scanner(toCheck);
			scanner.useDelimiter("\\Z");
			assertFalse(scanner.hasNext());
		} catch (FileNotFoundException e) {
			fail(String.format("Could not find file %s", toCheck.toString()));
			e.printStackTrace();
		}
	}

}
