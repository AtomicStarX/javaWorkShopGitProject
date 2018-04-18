/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Product.
 * 
 * @author alu53788313f
 */
public class Product {
	/**
	 * Description of the property suplierID.
	 */
	private EString suplierID = null;

	/**
	 * Description of the property price.
	 */
	private double price = 0D;

	/**
	 * Description of the property invoiceLines.
	 */
	public HashSet<InvoiceLine> invoiceLines = new HashSet<InvoiceLine>();

	/**
	 * Description of the property stock.
	 */
	private int stock = 0;

	/**
	 * Description of the property description.
	 */
	private EString description = null;

	/**
	 * Description of the property identifier.
	 */
	private EInt identifier = null;

	/**
	 * Description of the property suplierName.
	 */
	private EString suplierName = null;

	// Start of user code (user defined attributes for Product)

	// End of user code

	/**
	 * The constructor.
	 */
	public Product() {
		// Start of user code constructor for Product)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Product)

	// End of user code
	/**
	 * Returns suplierID.
	 * @return suplierID 
	 */
	public EString getSuplierID() {
		return this.suplierID;
	}

	/**
	 * Sets a value to attribute suplierID. 
	 * @param newSuplierID 
	 */
	public void setSuplierID(EString newSuplierID) {
		this.suplierID = newSuplierID;
	}

	/**
	 * Returns price.
	 * @return price 
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sets a value to attribute price. 
	 * @param newPrice 
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * Returns invoiceLines.
	 * @return invoiceLines 
	 */
	public HashSet<InvoiceLine> getInvoiceLines() {
		return this.invoiceLines;
	}

	/**
	 * Returns stock.
	 * @return stock 
	 */
	public int getStock() {
		return this.stock;
	}

	/**
	 * Sets a value to attribute stock. 
	 * @param newStock 
	 */
	public void setStock(int newStock) {
		this.stock = newStock;
	}

	/**
	 * Returns description.
	 * @return description 
	 */
	public EString getDescription() {
		return this.description;
	}

	/**
	 * Sets a value to attribute description. 
	 * @param newDescription 
	 */
	public void setDescription(EString newDescription) {
		this.description = newDescription;
	}

	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public EInt getIdentifier() {
		return this.identifier;
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(EInt newIdentifier) {
		this.identifier = newIdentifier;
	}

	/**
	 * Returns suplierName.
	 * @return suplierName 
	 */
	public EString getSuplierName() {
		return this.suplierName;
	}

	/**
	 * Sets a value to attribute suplierName. 
	 * @param newSuplierName 
	 */
	public void setSuplierName(EString newSuplierName) {
		this.suplierName = newSuplierName;
	}

}
