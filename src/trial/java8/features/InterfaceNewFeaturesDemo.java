package trial.java8.features;

interface Java8Interface {
	
	Long calculate(Integer input);
	
	default void print (Long output) {
		System.out.print("value : " +output);
	}
	
	static boolean isNotNull(Long input) {
		return input != null ? true : false;
	}
	
}

public class InterfaceNewFeaturesDemo implements Java8Interface {
	
	public static void main (String ... args) {
		Java8Interface object = new InterfaceNewFeaturesDemo();
		Long value = object.calculate(100);
		if (Java8Interface.isNotNull(value)) {
			object.print(value);
		}
		
	}

	@Override
	public Long calculate(Integer input) {
		return new Long(input * input);
	}

}
