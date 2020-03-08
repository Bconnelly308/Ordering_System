import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class setOrderIDJTest {

	@Test
	public void test() {
		Order.setOrderID();
		assertEquals(2, Order.setOrderID());
		assertEquals(3, Order.setOrderID());
	}

}
