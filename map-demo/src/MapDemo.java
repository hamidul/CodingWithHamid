import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> squareList = numbers.stream()
				.map(x -> x * x)
				.collect(Collectors.toList());
		
		System.out.println("squareList>>"+squareList);
		
		 List<String> names = Arrays.asList("John", "Jane", "Jim");
		 List<String> uppercaseNames =names.stream()
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("uppercaseNames>>"+uppercaseNames);
		
		List<Person> people = Arrays.asList(
			    new Person("Ram", 30),
			    new Person("Sham", 25),
			    new Person("Rahim", 35)
			);
		
		List<String> personNames = people.stream()
			.map(p -> p.name)
			.collect(Collectors.toList());
		
		System.out.println("personNames>>"+personNames);


	}

}
