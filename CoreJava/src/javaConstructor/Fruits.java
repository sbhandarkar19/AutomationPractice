package javaConstructor;

public class Fruits {
	double weight;
	String color;
    String taste;
    int cost;
    
    Fruits(double w, String c, String t, int cost){
    	weight = w;
    	color = c;
    	taste = t;
    	cost = cost;
    }
    
    Fruits(double w, String c, String t) {     // Multiple Constructor used
    	weight = w;
    	color = c;
    	taste = t;
    }
    
    Fruits(String c, String t) {                // Multiple Constructor used
    	color = c;
    	taste = t;
    }
    
	public static void main(String[] args) {
		
		Fruits apple = new Fruits(220.00, "Red", "Sweet", 100);
		System.out.println("Apple Fruit");
		System.out.println(apple.weight);
		System.out.println(apple.color);
		System.out.println(apple.taste);
		System.out.println(apple.cost);
		
		Fruits orange = new Fruits(145.5, "Orange", "Sour", 60);
		System.out.println("Orange Fruit");
		System.out.println(orange.weight);
		System.out.println(orange.color);
		System.out.println(orange.taste);
		System.out.println(orange.cost);

	}

}
