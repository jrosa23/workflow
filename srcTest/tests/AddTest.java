package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main_hub.Simple_Program;


public class AddTest {

	@Test
	public void AddTest() {
		Simple_Program junit = new Simple_Program();
		int result = junit.add(100, 25);
		assertEquals(125, result);
	}
	
}
