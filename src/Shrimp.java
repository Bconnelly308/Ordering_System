
public class Shrimp extends ItemDecorator {

	public Shrimp(Pasta newPasta) {
		super(newPasta);
		
	}
	
	public String getDescription() {
		
		return tempPasta.getDescription() + ", Shrimp";
	}
	
	public double getCost() {
		
		return tempPasta.getCost() + 7;
		
	}
	
	public int getCalories() {
		
		return tempPasta.getCalories() + 400;
	}

}