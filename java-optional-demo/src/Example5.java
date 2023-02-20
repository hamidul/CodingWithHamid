import java.util.Optional;

/**
 * 
 * Throwing an exception if a value is not present
 *
 */
public class Example5 {

	public static void main(String[] args) {
		String someString = "How are you";
		Optional<String> opt = Optional.ofNullable(someString);
		String val = opt.orElseThrow(IllegalStateException::new);
		System.out.println("Value is present: " + val);

	}

}
