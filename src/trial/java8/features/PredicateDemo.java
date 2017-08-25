package trial.java8.features;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
	
	Integer id;
	String name;
	Integer age;
	
	public Employee (Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}

public class PredicateDemo {
	
   public static void main (String ... args)	{
	   List<Employee> employees = new ArrayList<>();  
	   employees.add(new Employee(1, "Emp1", 12));
	   employees.add(new Employee(1, "Emp1", 18));
	   employees.add(new Employee(2, "Emp1", 59));
	   employees.add(new Employee(3, "Emp1", 62));
	   
	   List<Employee> filteredEmployees = filterEmployees(employees);
	   filteredEmployees.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				System.out.println(String.format("[id=%d, Name=%s, age=%d]", emp.id, emp.getName(), emp.getAge()));
			}		   
	   });
	   
   }
   
	public static Predicate<Employee> isRetired() {
		return p -> p.getAge() > 58;
	}
	
	public static List<Employee> filterEmployees(List<Employee> employees) {
		return employees.stream().filter(isRetired()).collect(Collectors.<Employee>toList());
	}
   
}
