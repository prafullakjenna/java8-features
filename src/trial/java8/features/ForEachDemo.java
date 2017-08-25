package trial.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
	
	public static void main (String [] args) {
		
		List<Integer> list = new ArrayList<>();
		for (Integer count = 0; count <20; count ++) {
			list.add(count *2);
		}
		//Flavor 1 : Using annonymous consumer class
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer item) {
				System.out.println(item);
			}
			
		});
		
		//Flavor 2 : Using concrete consumer class
		CustomConsumer customConsumer = new CustomConsumer();
		list.forEach(customConsumer);
		
	}
}

class CustomConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer item) {
		System.out.println(item);			
	}
	
}
