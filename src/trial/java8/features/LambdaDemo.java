package trial.java8.features;

@FunctionalInterface
interface Shape {
	void area(int radius);
}

public class LambdaDemo {

	public static void main (String [] args) {
		
		Shape shape = (x) -> {
			System.out.println("Draw shape : "+ x*x);
		};
		
		shape.area(5);
	}
	
}
