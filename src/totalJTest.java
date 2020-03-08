import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class totalJTest {

	@Test
	public void test() {
		double itemTotal = 8.00;
		double dessertPrice = 5.99;
		double expected = 13.99;
		double expected2 = 15.07;
		DecimalFormat df = new DecimalFormat("0.00");
			
		if (itemTotal != 0) {
			Double subTotal = ((itemTotal + dessertPrice) * 100.00) / 100.00;
			Double total = ((subTotal * 1.0775) * 100.00) / 100.00;
			assertEquals(df.format(expected), df.format(subTotal));
			assertEquals(df.format(expected2), df.format(total));
		}
	}
}
