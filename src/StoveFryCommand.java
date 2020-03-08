
public class StoveFryCommand implements Command {
	Stovetop stovetop;

	public StoveFryCommand(Stovetop stovetop) {
		this.stovetop = stovetop;
	}

	public void execute() {
		stovetop.fry();
	}
}