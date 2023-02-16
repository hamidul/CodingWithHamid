import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3,4);
		
		int sum = numbers.stream()
				.filter(e -> e % 2 == 0)
				.reduce(0, (a,b) -> a + b);
		
		System.out.println(sum);
	}

}
