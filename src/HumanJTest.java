import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HumanJTest {

	@Test
	public void test() {
		String firstName = "Brittney";
		String lastName = "Connelly";
		String paymentMethod = "Credit";
		Customer human = new Customer(firstName, lastName, paymentMethod);
		assertEquals(firstName,human.firstName);
		assertEquals(lastName,human.lastName);
		assertEquals(paymentMethod,human.paymentMethod);
		
	}

}
