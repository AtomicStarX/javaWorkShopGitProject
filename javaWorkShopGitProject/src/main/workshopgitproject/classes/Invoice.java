/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Invoice.
 * 
 * @author alu53788313f
 */
public class Invoice {
	/**
	 * Description of the property totalAmount.
	 */
	private double totalAmount = 0D;

	/**
	 * Description of the property clients.
	 */
	public Client clients = null;

	/**
	 * Description of the property invoiceLines.
	 */
	public HashSet<InvoiceLine> invoiceLines = new HashSet<InvoiceLine>();

	/**
	 * Description of the property datePurchase.
	 */
	private EDate datePurchase = null;

	/**
	 * Description of the property aplyDiscount.
	 */
	private boolean aplyDiscount = false;

	/**
	 * Description of the property identifier.
	 */
	private int identifier = 0;

	// Start of user code (user defined attributes for Invoice)

	// End of user code

	/**
	 * The constructor.
	 */
	public Invoice() {
		// Start of user code constructor for Invoice)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Invoice)

	// End of user code
	/**
	 * Returns totalAmount.
	 * @return totalAmount 
	 */
	public double getTotalAmount() {
		return this.totalAmount;
	}

	/**
	 * Sets a value to attribute totalAmount. 
	 * @param newTotalAmount 
	 */
	public void setTotalAmount(double newTotalAmount) {
		this.totalAmount = newTotalAmount;
	}

	/**
	 * Returns clients.
	 * @return clients 
	 */
	public Client getClients() {
		return this.clients;
	}

	/**
	 * Sets a value to attribute clients. 
	 * @param newClients 
	 */
	public void setClients(Client newClients) {
		this.clients = newClients;
	}

	/**
	 * Returns invoiceLines.
	 * @return invoiceLines 
	 */
	public HashSet<InvoiceLine> getInvoiceLines() {
		return this.invoiceLines;
	}

	/**
	 * Returns datePurchase.
	 * @return datePurchase 
	 */
	public EDate getDatePurchase() {
		return this.datePurchase;
	}

	/**
	 * Sets a value to attribute datePurchase. 
	 * @param newDatePurchase 
	 */
	public void setDatePurchase(EDate newDatePurchase) {
		this.datePurchase = newDatePurchase;
	}

	/**
	 * Returns aplyDiscount.
	 * @return aplyDiscount 
	 */
	public boolean getAplyDiscount() {
		return this.aplyDiscount;
	}

	/**
	 * Sets a value to attribute aplyDiscount. 
	 * @param newAplyDiscount 
	 */
	public void setAplyDiscount(boolean newAplyDiscount) {
		this.aplyDiscount = newAplyDiscount;
	}

	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public int getIdentifier() {
		return this.identifier;
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(int newIdentifier) {
		this.identifier = newIdentifier;
	}

}
