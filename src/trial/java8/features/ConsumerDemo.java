package trial.java8.features;

import java.util.function.Consumer;

public class ConsumerDemo {
		
	public static void main (String [] args) {
		
		Consumer<String> consumer = ConsumerDemo::display; 
		consumer.accept("abc");
		consumer.accept("abcd");
		consumer.accept("abcde");
	}
	
	private static void display(String name) {
		System.out.println(name);
	}
	
}

