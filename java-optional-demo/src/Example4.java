import java.util.Optional;

/**
 * 
 * Mapping a value to another type
 *
 */
public class Example4 {

	public static void main(String[] args) {
		String someString = "Java 1234";
		Optional<String> opt = Optional.ofNullable(someString);
		Optional<Integer> lengthOpt = opt.map(String::length);
		System.out.println(lengthOpt.orElse(0));

	}

}
