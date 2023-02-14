import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		String[][] dataArray = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" }, { "g", "h" } };
		
		System.out.println("Before flatMap():"+Arrays.deepToString(dataArray));
		
		
		List<String> elementsList = 
		Arrays.stream(dataArray)
			.flatMap(childArray -> Arrays.stream(childArray))
			.collect(Collectors.toList());
		
		System.out.println("After flatMap():"+elementsList);

	}

}
