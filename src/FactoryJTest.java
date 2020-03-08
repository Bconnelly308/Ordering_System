import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryJTest {

	@Test
	public void test() {
		String paymentMethod = "Credit";
		String firstName = "Brittney";
		String lastName = "Connelly";
		Customer human = new Customer(firstName, lastName, paymentMethod);
		
		SimpleReceiptFactory factory = new SimpleReceiptFactory();
		Checkout checkout = new Checkout(factory);
		Receipt receipt = checkout.orderReceipt(human.paymentMethod);
		String actual = receipt.getName();
		Credit credit = new Credit();
		String expected = credit.name;
		
		assertEquals(expected, actual);
	}

}
