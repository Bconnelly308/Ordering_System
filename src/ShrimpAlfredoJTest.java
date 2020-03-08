import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShrimpAlfredoJTest {

	@Test
	public void test() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Stovetop stovetop = new Stovetop();
		StoveBoilCommand stoveBoil = new StoveBoilCommand(stovetop);
		StoveWarmCommand stoveWarm = new StoveWarmCommand(stovetop);
		StoveSauteCommand stoveSaute = new StoveSauteCommand(stovetop);
		Double expected = 12.0;
	
		String item = "Shrimp Alfredo";
		Menu food = new Menu(item);
		
	
		if (food.item.equalsIgnoreCase("shrimp alfredo")) {
			
			Pasta pasta1 = new Shrimp(new Alfredo());
			assertEquals("Shrimp Alfredo", food.item);
			assertEquals("Alfredo, Shrimp", pasta1.getDescription());
			assertEquals(1200, pasta1.getCalories());
			
			remote.setCommand(stoveBoil);
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
