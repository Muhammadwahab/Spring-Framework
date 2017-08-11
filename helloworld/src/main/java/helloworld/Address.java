package helloworld;

public class Address {
	
	private int postalCode;
	private String streatAddress;
	public Address(int postalCode, String streatAddress) {
		this.postalCode = postalCode;
		this.streatAddress = streatAddress;
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
