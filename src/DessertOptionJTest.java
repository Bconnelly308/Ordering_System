import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DessertOptionJTest {

	@Test
	public void test() {
		String name1 = "Chocolate Cake";
		String name2 = "tiramisu";
		String name3 = "Cannoli";
		
		
		if (name1.equalsIgnoreCase("chocolate cake")) {
			Double dessertPrice1 = ChocolateCake.getPrice();
			double expected1 = 7.99;
			assertEquals(expected1, dessertPrice1, 0.00);
		}
		
		else if (name2.equalsIgnoreCase("tiramisu")) {
			double dessertPrice2 = Tiramisu.getPrice();
			double expected2 = 8.99;
			assertEquals(expected2, dessertPrice2, 0.00);
		}
		
		else if (name3.equalsIgnoreCase("cannoli")) {
			double dessertPrice3 = Cannoli.getPrice();
			double expected3 = 5.99;
			assertEquals(expected3, dessertPrice3, 0.00);
		}

	}

}
