import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class IteratorJTest {

	@Test
	public void test() {

        DessertMenu dessertMenu = new DessertMenu();
		Iterator result = dessertMenu.createIterator();
		
		assertNotNull(result);
	}

}
