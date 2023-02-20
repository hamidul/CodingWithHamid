import java.util.Optional;
/**
 * 
 * Providing a default value if a value is not present
 *
 */
public class Example2 {

	public static void main(String[] args) {
		
		String someString = "Hello";
		Optional<String> opt = Optional.ofNullable(someString);
		System.out.println(opt.orElse("Default value"));


	}

}
