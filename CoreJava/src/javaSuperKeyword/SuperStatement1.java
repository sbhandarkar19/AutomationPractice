package javaSuperKeyword;
//  2] Super Statement Program

class Fruit {    // inherits Object class
	double weight;
}

class Apple extends Fruit {
//	Fruit class direct Parent class
//	Object class indirect Parent class
	
	public void appleTaster() {
		
	}
}

public class SuperStatement1 {

	public static void main(String[] args) {
		Fruit obj = new Fruit();
		obj.toString();
		
		Apple obj1 = new Apple();
		obj1.weight = 4.5;
		obj1.appleTaster();
		obj.hashCode();
	}

}
