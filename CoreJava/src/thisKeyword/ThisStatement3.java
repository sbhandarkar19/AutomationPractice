package thisKeyword;

public class ThisStatement3 {
//	IMP ==> this program solve ===> This statement is know but it is important to know where it will be used.
	
	int a;
	double d;
	char ch;
	
	ThisStatement3(int a){
		this(9.81);
		this.a = a;
		System.out.println("Int parameterized constructor");
	}
	
	ThisStatement3(double d){
		this.d = d;
		System.out.println("Double parameterized constructor");
	}
	
	ThisStatement3(char ch){
		this.ch = ch;
		System.out.println("Char parameterized constructor");
	}

	public static void main(String[] args) {
		
        ThisStatement3 obj = new ThisStatement3(2);
	}

}
