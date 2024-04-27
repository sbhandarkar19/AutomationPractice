package oopsAbstraction;
// Program ==> 1] One interface can be inherited from another interface.For that you will have to use extends keyword.
//             2] By creating a normal clsss we will create an interface in it.

interface Fruits {
	int fruitWeight = 100;        // Compiler write here by default ==> public static final int fruitWeight = 100;
	
	void fruitTaste();            // Compiler write here by default ==> public abstract void fruitTaste();
}

interface Vegetables extends Fruits {
	
//	public static final int fruitWeight = 100;
//	public abstract void fruitTaste();
	
	void benefitsOfVegetable();
}

class Food implements Vegetables {
	public void fruitTaste() {
		
	}
	
	public void benefitsOfVegetable() {
		
	}
}

public class Interface3 {

	public static void main(String[] args) {
		

	}

}
