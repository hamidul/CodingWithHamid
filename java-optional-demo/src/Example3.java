import java.util.Optional;
/**
 * 
 * Executing code if a value is present
 *
 */
public class Example3 {

	public static void main(String[] args) {

		String someString = "Hello1";
		Optional<String> opt = Optional.ofNullable(someString);
		opt.ifPresent(val -> System.out.println("Value is present: " + val));

	}

}
