package trial.java8.features;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeApiDemo {

	public static void main (String ... args)	{
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date : " +currentDate);
		
		LocalDate tenthDay2010 = LocalDate.ofYearDay(2010, 10);
		System.out.println("10th day of 20140 = "+tenthDay2010);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time : " +currentTime);
	}
}
