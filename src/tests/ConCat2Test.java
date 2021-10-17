package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main_hub.Simple_Program;

public class ConCat2Test {
	@Test
	public void ConCat2Test() {
		Simple_Program junit = new Simple_Program();
		String result = junit.ConCat2("Jeremy is " + 24 + " years old.");
		assertEquals("Jeremy is 24 years old.",result);
	}
}
