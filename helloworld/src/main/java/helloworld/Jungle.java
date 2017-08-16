package helloworld;

import java.util.List;

public class Jungle {
	
	private Animal largest;
	private List<Animal> listofanimals;
	
	public Animal getLargest() {
		return largest;
	}
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	public List<Animal> getListofanimals() {
		return listofanimals;
	}
	public void setListofanimals(List<Animal> listofanimals) {
		this.listofanimals = listofanimals;
	}
	@Override
	public String toString() {
		return "Jungle [animal=" + largest + ", listofanimals=" + listofanimals + "]";
	}
	
	

}
