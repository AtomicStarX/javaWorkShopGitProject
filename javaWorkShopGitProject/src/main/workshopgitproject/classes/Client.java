/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Client.
 * 
 * @author alu53788313f
 */
public class Client {
	/**
	 * Description of the property surname.
	 */
	private EString surname = null;

	/**
	 * Description of the property province.
	 */
	private EString province = null;

	/**
	 * Description of the property dni.
	 */
	private EString dni = null;

	/**
	 * Description of the property invoices.
	 */
	public HashSet<Invoice> invoices = new HashSet<Invoice>();

	/**
	 * Description of the property name.
	 */
	private EString name = null;

	/**
	 * Description of the property village.
	 */
	private EString village = null;

	/**
	 * Description of the property streetName.
	 */
	private EString streetName = null;

	/**
	 * Description of the property identifier.
	 */
	private EInt identifier = null;

	/**
	 * Description of the property country.
	 */
	private EString country = null;

	// Start of user code (user defined attributes for Client)

	// End of user code

	/**
	 * The constructor.
	 */
	public Client() {
		// Start of user code constructor for Client)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Client)

	// End of user code
	/**
	 * Returns surname.
	 * @return surname 
	 */
	public EString getSurname() {
		return this.surname;
	}

	/**
	 * Sets a value to attribute surname. 
	 * @param newSurname 
	 */
	public void setSurname(EString newSurname) {
		this.surname = newSurname;
	}

	/**
	 * Returns province.
	 * @return province 
	 */
	public EString getProvince() {
		return this.province;
	}

	/**
	 * Sets a value to attribute province. 
	 * @param newProvince 
	 */
	public void setProvince(EString newProvince) {
		this.province = newProvince;
	}

	/**
	 * Returns dni.
	 * @return dni 
	 */
	public EString getDni() {
		return this.dni;
	}

	/**
	 * Sets a value to attribute dni. 
	 * @param newDni 
	 */
	public void setDni(EString newDni) {
		this.dni = newDni;
	}

	/**
	 * Returns invoices.
	 * @return invoices 
	 */
	public HashSet<Invoice> getInvoices() {
		return this.invoices;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public EString getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(EString newName) {
		this.name = newName;
	}

	/**
	 * Returns village.
	 * @return village 
	 */
	public EString getVillage() {
		return this.village;
	}

	/**
	 * Sets a value to attribute village. 
	 * @param newVillage 
	 */
	public void setVillage(EString newVillage) {
		this.village = newVillage;
	}

	/**
	 * Returns streetName.
	 * @return streetName 
	 */
	public EString getStreetName() {
		return this.streetName;
	}

	/**
	 * Sets a value to attribute streetName. 
	 * @param newStreetName 
	 */
	public void setStreetName(EString newStreetName) {
		this.streetName = newStreetName;
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
	 * Returns country.
	 * @return country 
	 */
	public EString getCountry() {
		return this.country;
	}

	/**
	 * Sets a value to attribute country. 
	 * @param newCountry 
	 */
	public void setCountry(EString newCountry) {
		this.country = newCountry;
	}

}
