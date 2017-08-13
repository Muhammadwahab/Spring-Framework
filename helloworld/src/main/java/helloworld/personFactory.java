package helloworld;

public class personFactory {
	
	public  Person FactoryCreate(int id,String name)
	{
		System.out.println("Using Factory bean Class  ..");
		return new Person(id,name);
		
	}

}
