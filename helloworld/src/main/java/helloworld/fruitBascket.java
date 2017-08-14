package helloworld;

import java.util.List;

public class fruitBascket {
	
	private String name;
	private List<String> fruits;
	public fruitBascket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}
	@Override
	public String toString() {
			
		for (String string : fruits) {
			System.out.println("fruit names "+string);
		}
		return "fruitBascket";
	}
	
	

}
