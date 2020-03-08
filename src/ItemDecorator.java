
abstract class ItemDecorator implements Pasta {
	
	protected Pasta tempPasta;
	
	public ItemDecorator(Pasta newPasta) {
		
		tempPasta = newPasta;
	}
	
	public String getDescription() {
		
		return tempPasta.getDescription();
	}
	
	public double getCost() {
		
		return tempPasta.getCost();
	
	}
	
	public int getCalories() {
		
		return tempPasta.getCalories();
		
	}

}
