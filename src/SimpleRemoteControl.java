
public class SimpleRemoteControl {
	Command slot;
	 
	public SimpleRemoteControl() {}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public boolean buttonWasPressed() {
		slot.execute();
		return true;
	}
	
}