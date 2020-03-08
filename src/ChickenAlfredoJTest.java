import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChickenAlfredoJTest {

	@Test
	public void test() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Stovetop stovetop = new Stovetop();
		StoveBoilCommand stoveBoil = new StoveBoilCommand(stovetop);
		StoveWarmCommand stoveWarm = new StoveWarmCommand(stovetop);
		StoveFryCommand stoveFry = new StoveFryCommand(stovetop);
		Double expected = 9.0;	
		String item = "Chicken Alfredo";
		Menu food = new Menu(item);
		
	
		if (food.item.equalsIgnoreCase("chicken alfredo")) {
			
			Pasta pasta1 = new Chicken(new Alfredo());
			assertEquals("Chicken Alfredo", food.item);
			assertEquals("Alfredo, Chicken", pasta1.getDescription());
			assertEquals(1400, pasta1.getCalories());
			
			remote.setCommand(stoveBoil);
			assertTrue(remote.buttonWasPressed());
			remote.setCommand(stoveFry);
			assertTrue(remote.buttonWasPressed());
			remote.setCommand(stoveWarm);
			assertTrue(remote.buttonWasPressed());
			Double actual = pasta1.getCost();
			assertEquals(expected, actual);
				
		}
		
	}

}
