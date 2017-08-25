package trial.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main (String [] args) {
		List <Integer> numbers = new ArrayList<>();
		numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(sumStream(numbers));
	}
	
	private static Integer sumStream(List <Integer> numbers) {
		return numbers.stream().filter(i -> i>5).mapToInt(i -> i).sum();
	}
}
