
public class StoveWarmCommand implements Command {
	Stovetop stovetop;

	public StoveWarmCommand(Stovetop stovetop) {
		this.stovetop = stovetop;
	}

	public void execute() {
		stovetop.warm();
	}
}