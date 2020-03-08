
public class Checkout {
	SimpleReceiptFactory factory;
	 
	public Checkout(SimpleReceiptFactory factory) { 
		this.factory = factory;
	}
 
	public Receipt orderReceipt(String type) {
		Receipt receipt;
 
		receipt = factory.createReceipt(type);
 
		receipt.prepare();
		receipt.process();
		receipt.print();

		return receipt;
	}

}
