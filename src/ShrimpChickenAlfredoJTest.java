import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShrimpChickenAlfredoJTest {

	@Test
	public void test() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Stovetop stovetop = new Stovetop();
		StoveBoilCommand stoveBoil = new StoveBoilCommand(stovetop);
		StoveWarmCommand stoveWarm = new StoveWarmCommand(stovetop);
		StoveFryCommand stoveFry = new StoveFryCommand(stovetop);
		StoveSauteCommand stoveSaute = new StoveSauteCommand(stovetop);
		Double expected = 16.0;
	
		String item = "Shrimp and Chicken Alfredo";
		Menu food = new Menu(item);
		
	
		if (food.item.equalsIgnoreCase("shrimp and chicken alfredo")) {
			
			Pasta pasta1 = new Chicken(new Shrimp(new Alfredo()));
			assertEquals("Shrimp and Chicken Alfredo", food.item);
			assertEquals("Alfredo, Shrimp, Chicken", pasta1.getDescription());
			assertEquals(1800, pasta1.getCalories());
			
			remote.setCommand(stoveBoil);
			assertTrue(remote.buttonWasPressed());
			remote.setCommand(stoveFry);
			assertTrue(remote.buttonWasPressed());
			remote.setCommand(stoveSaute);
			assertTrue(remote.buttonWasPressed());
			remote.setCommand(stoveWarm);
			assertTrue(remote.buttonWasPressed());
			Double actual = pasta1.getCost();
			assertEquals(expected, actual);
		}
	}
}