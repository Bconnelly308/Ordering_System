
public class StoveSauteCommand implements Command {
	Stovetop stovetop;

	public StoveSauteCommand(Stovetop stovetop) {
		this.stovetop = stovetop;
	}

	public void execute() {
		stovetop.saute();
	}
}