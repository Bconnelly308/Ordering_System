
public class SimpleReceiptFactory {

	public Receipt createReceipt(String type) {
		Receipt receipt = null;

		if (type.equalsIgnoreCase("credit")) {
			receipt = new Credit();
		} else if (type.equalsIgnoreCase("debit")) {
			receipt = new Debit();
		} else if (type.equalsIgnoreCase("cash")) {
			receipt = new Cash();
		}
		return receipt;
	}
}

