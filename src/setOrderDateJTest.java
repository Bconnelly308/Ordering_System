import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class setOrderDateJTest {

	@Test
	public void test() {
		LocalDate todayDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String formatedTodayDate = todayDate.format(formatter);
		Order.setOrderDate();
		assertEquals(formatedTodayDate, Order.setOrderDate());
						
	}

}
