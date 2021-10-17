package main_hub;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AddTest {

	@Test
	public void AddTest() {
		Simple_Program junit = new Simple_Program();
		int result = junit.add(100, 25);
		assertEquals(125, result);
	}
	
}
