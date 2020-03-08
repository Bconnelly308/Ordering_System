import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
	static int orderID = 0;
	static LocalDate orderDate = LocalDate.now();
		
	public Order(int orderID, LocalDate orderDate) {
		super();
		// TODO Auto-generated constructor stub
		Order.setOrderID();
		Order.setOrderDate();
		
	}

	public static String setOrderDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String formatedOrderDate = orderDate.format(formatter);
		return formatedOrderDate;
	  } 
	
	public static int setOrderID() {
		orderID++;
		return orderID;
	}
	
}

