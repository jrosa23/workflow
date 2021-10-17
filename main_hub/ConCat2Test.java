package main_hub;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCat2Test {
	@Test
	public void ConCat2Test() {
		Simple_Program junit = new Simple_Program();
		String result = junit.ConCat2("Jeremy is " + 24 + " years old.");
		assertEquals("Jeremy is 24 years old.",result);
	}
}
