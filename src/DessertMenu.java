public class DessertMenu implements Menu2 {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
  
	public DessertMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("Chocolate Cake",
			"Moist chocolate cake, fudge frosting, and vanilla ice cream", 7.99);
		addItem("Tiramisu",
			"Coffee flavored cake", 8.99);
		addItem("Canolli",
			"Fried pastry filled with sweet cream", 5.99);
	
	}
  
	public void addItem(String name, String description, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return new DessertMenuIterator(menuItems);
		
	}
}

