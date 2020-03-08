public class DessertMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
 
	public DessertMenuIterator(MenuItem[] items) {
		this.items = items;
	}
 
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}