package bao.java.tongyonglei;

public class Address {
	private String addressName;
	private String zipCode;
	/**
	 * @return the addressName
	 */
	public String getAddressName() {
		return addressName;
	}
	/**
	 * @param addressName the addressName to set
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipeCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipeCode to set
	 */
	public void setZipeCode(String zipeCode) {
		this.zipCode = zipCode;
	}
	public Address(){}
	public Address(String addressName, String zipCode) {
		super();
		this.addressName = addressName;
		this.zipCode = zipCode;
	}
	public String toString(){
		return "µÿ÷∑£∫"+this.addressName+",” ±‡£∫"+this.zipCode;
	}
}
