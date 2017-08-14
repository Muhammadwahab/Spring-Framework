package helloworld;

public class Address {
	
	private int postalCode;
	private String streatAddress;
	public Address(int postalCode, String streatAddress) {
		this.postalCode = postalCode;
		this.streatAddress = streatAddress;
	}
	
	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreatAddress() {
		return streatAddress;
	}

	public void setStreatAddress(String streatAddress) {
		this.streatAddress = streatAddress;
	}

	public Address()
	{
		
	}
	@Override
	public String toString() {
		return "Address [postalCode=" + postalCode + ", streatAddress=" + streatAddress + "]";
	}
	
	public void  init()
	{
		System.out.println("Adrees Class Create  ...");
	}
	

}
