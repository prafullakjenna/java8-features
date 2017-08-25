package trial.java8.features;
import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	public static void main (String [] args) {
		BiFunction<String, Integer, String> biFunc = (x, y) -> {
			return x + y;
		};
		
		System.out.println(biFunc.apply("ABCDE ", 252));
	}
}
