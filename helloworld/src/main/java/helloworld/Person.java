package helloworld;

public class Person {
	
	private int id;
	private String name;
	private int textID;
	private Address address;
	
	

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTextID(int textID) {
		this.textID = textID;
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person()
	{
		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", textID=" + textID + ", address=" + address + "]";
	}
	

	void speek()
	{
		System.out.print("Salam Spring Using Beans Container...");
	}

}
