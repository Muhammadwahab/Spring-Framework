package helloworld;

public class Person {
	
	private int id;
	private String name;
	private int textID;
	private Address address;
	
	

	public static Person getinstance(int id,String name)
	{
		System.out.println("Person Create USing Factory Mehtod..");
		return new Person(id,name);
	}
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
	public void onCreate()
	{
		System.out.println("Person Create in On create Method");
	}
	public void onDestroy()
	{
		System.out.println("Person Destroy");
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
