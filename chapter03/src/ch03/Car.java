package ch03;

public class Car {

	String name;
	int price;
	// ���԰��� has a 
	Engine engine;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);
	}
}
