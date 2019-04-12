package specialPurpose;

import entities.Address;

/*
 * regular comment
 */
/**
 * @author Doug Hoff
 * I'd like to put this information in the Javadocs...
 * 
 */
public class JavadocsExample {
	public Address address;

	/**
	 * @param none
	 * @return Address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @since 3/22/2017
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
