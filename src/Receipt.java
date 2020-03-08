import javax.swing.JOptionPane;

abstract public class Receipt {
	String name;

		public String getName() {
			return name;
		}

		public void prepare() {
			JOptionPane.showMessageDialog(null, "Preparing for " + name);
		}

		public void process() {
			JOptionPane.showMessageDialog(null, "Processing " + name);
		}

		public void print() {
			JOptionPane.showMessageDialog(null, "Printing Receipt For " + name + " payment");
		}
		
}
