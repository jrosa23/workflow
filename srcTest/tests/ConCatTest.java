package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main_hub.Simple_Program;

public class ConCatTest {

	@Test
	public void ConCatTest() {
		Simple_Program junit = new Simple_Program();
		String result = junit.ConCat("J", "am");
		assertEquals("Jam", result);
	}
	
}
