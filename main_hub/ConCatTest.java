package main_hub;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void ConCatTest() {
		Simple_Program junit = new Simple_Program();
		String result = junit.ConCat("J", "am");
		assertEquals("Jam", result);
	}
	
}
