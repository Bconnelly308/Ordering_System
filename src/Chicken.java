
public class Chicken extends ItemDecorator {

	public Chicken(Pasta newPasta) {
		super(newPasta);
		
	}
	
	public String getDescription() {
		
		return tempPasta.getDescription() + ", Chicken";
	}
	
	public double getCost() {
		
		return tempPasta.getCost() + 4;
		
	}
	
	public int getCalories() {
		
		return tempPasta.getCalories() + 600;
	}

}