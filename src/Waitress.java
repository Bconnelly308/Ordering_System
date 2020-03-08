import javax.swing.JOptionPane;

public class Waitress {
	Menu2 dessertMenu;
 
	public Waitress(Menu2 dessertMenu) {
		this.dessertMenu = dessertMenu;
	}
 
	public void printMenu() {
		Iterator dinerIterator = dessertMenu.createIterator();
		
		JOptionPane.showMessageDialog(null, "Want a dessert?");
		printMenu(dinerIterator);

	}
 
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			JOptionPane.showMessageDialog(null, menuItem.getName() + ", " + menuItem.getPrice() + " -- " + menuItem.getDescription());

		}
	}
 
}