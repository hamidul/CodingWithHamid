import java.util.Optional;
/**
 * 
 * Checking if a value is present
 *
 */
public class Example1 {

	public static void main(String[] args) {
		
		String someString = "hello";
		Optional<String> opt = Optional.ofNullable(someString);
		if (opt.isPresent()) {
		    System.out.println(opt.get());
		} else {
		    System.out.println("Value is not present.");
		}


	}

}
