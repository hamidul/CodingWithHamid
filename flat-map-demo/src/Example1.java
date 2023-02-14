import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");
		
		List<String> mergedList = 
		Stream.of(list1, list2)
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		System.out.println(mergedList);
	}

}
