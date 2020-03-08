
public class StoveBoilCommand implements Command {
	Stovetop stovetop;

	public StoveBoilCommand(Stovetop stovetop) {
		this.stovetop = stovetop;
	}

	public void execute() {
		stovetop.boil();
	}
}
