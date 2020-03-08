import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Stovetop stovetop = new Stovetop();
		StoveBoilCommand stoveBoil = new StoveBoilCommand(stovetop);
		StoveSauteCommand stoveSaute = new StoveSauteCommand(stovetop);
		StoveWarmCommand stoveWarm = new StoveWarmCommand(stovetop);
		StoveFryCommand stoveFry = new StoveFryCommand(stovetop);
		double itemTotal = 0;
        DessertMenu dessertMenu = new DessertMenu();
		Waitress waitress = new Waitress(dessertMenu);
		Double dessertPrice = null;
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		JOptionPane.showMessageDialog(null, "Order Date: " + Order.setOrderDate());
		String firstName =JOptionPane.showInputDialog("Enter your first name.");
		String lastName = JOptionPane.showInputDialog("Enter your last name.");
		String[] possiblePayValues = {"Credit", "Debit", "Cash"};
		String paymentMethod = (String) JOptionPane.showInputDialog(null, "Choose your payment method.", "Input", JOptionPane.INFORMATION_MESSAGE,  null, possiblePayValues ,  possiblePayValues[0]);
		Customer human = new Customer(firstName, lastName, paymentMethod);
		JOptionPane.showMessageDialog(null, human.firstName + " " + human.lastName + ", please start your order.");
		JOptionPane.showMessageDialog(null, "Order ID: " + Order.setOrderID());
		String[] possibleFoodValues = {"Chicken Alfredo", "Shrimp Alfredo", "Chicken and Shrimp Alfredo"};
		String item = (String) JOptionPane.showInputDialog(null, "Choose your food item.", "Input", JOptionPane.INFORMATION_MESSAGE,  null, possibleFoodValues ,  possibleFoodValues[0]);
		Menu food = new Menu(item);
		
		try {
			if (food.item.equalsIgnoreCase("chicken alfredo")) {
				
				Pasta pasta1 = new Chicken(new Alfredo());
				JOptionPane.showMessageDialog(null, "You ordered: " + food.item + "\nIngredients: " + pasta1.getDescription() + "\nDish Calories: " + pasta1.getCalories());
				remote.setCommand(stoveBoil);
				remote.buttonWasPressed();
				remote.setCommand(stoveFry);
				remote.buttonWasPressed();
				remote.setCommand(stoveWarm);
				remote.buttonWasPressed();
				itemTotal = pasta1.getCost();
				
			}
			
			else if (food.item.equalsIgnoreCase("shrimp alfredo")) {
				
				Pasta pasta1 = new Shrimp(new Alfredo());
				JOptionPane.showMessageDialog(null, "You ordered: " + food.item + "\nIngredients: " + pasta1.getDescription() + "\nDish Calories: " + pasta1.getCalories());
				remote.setCommand(stoveBoil);
				remote.buttonWasPressed();
				remote.setCommand(stoveSaute);
				remote.buttonWasPressed();
				remote.setCommand(stoveWarm);
				remote.buttonWasPressed();
				itemTotal = pasta1.getCost();
				
			}
			
			else if (food.item.equalsIgnoreCase("chicken and shrimp alfredo")) {
				
				Pasta pasta1 = new Chicken(new Shrimp(new Alfredo()));
				JOptionPane.showMessageDialog(null, "You ordered: " + food.item + "\nIngredients: " + pasta1.getDescription() + "\nDish Calories: " + pasta1.getCalories());
				remote.setCommand(stoveBoil);
				remote.buttonWasPressed();
				remote.setCommand(stoveFry);
				remote.buttonWasPressed();
				remote.setCommand(stoveSaute);
				remote.buttonWasPressed();
				remote.setCommand(stoveWarm);
				remote.buttonWasPressed();
				itemTotal = pasta1.getCost();
				
			}
				
			waitress.printMenu();
			String[] possibleDessertValues = {"Chocolate Cake", "Tiramisu", "Cannoli"};
			String name = (String) JOptionPane.showInputDialog(null, "Choose your dessert", "Input", JOptionPane.INFORMATION_MESSAGE,  null, possibleDessertValues ,  possibleDessertValues[0]);
						
			if (name.equalsIgnoreCase("chocolate cake")) {
				dessertPrice = ChocolateCake.getPrice();
			}
			
			else if (name.equalsIgnoreCase("tiramisu")) {
				dessertPrice = Tiramisu.getPrice();
			}
			
			else if (name.equalsIgnoreCase("cannoli")) {
				dessertPrice = Cannoli.getPrice();
			}
			
			JOptionPane.showMessageDialog(null, "Dessert chosen: " + name);		
			
			if (itemTotal != 0) {
				Double subTotal = ((itemTotal + dessertPrice) * 100.00) / 100.00;
				Double total = ((subTotal * 1.0775) * 100.00) / 100.00;
				JOptionPane.showMessageDialog(null, "Subtotal: $" + df.format(subTotal) + "\nTotal: $" + df.format(total));
				JOptionPane.showMessageDialog(null, "Payment method chosen: " + human.paymentMethod);
				SimpleReceiptFactory factory = new SimpleReceiptFactory();
				Checkout checkout = new Checkout(factory);
				Receipt receipt = checkout.orderReceipt(human.paymentMethod);
				JOptionPane.showMessageDialog(null, "Thank you for your payment method: " + receipt.getName() + "\n");
				
			}	
						
		} catch (NullPointerException e) {System.out.println("System error "+ e + ". Please Restart Order");}
	
	}
	
}
