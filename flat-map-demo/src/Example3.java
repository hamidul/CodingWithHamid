import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("One","Two","Three"); 
		List<String> list2 = Arrays.asList("Four","Five","Six"); 
		List<String> list3 = Arrays.asList("Seven","Eight","Nine"); 
		List<List<String>> masterList = new ArrayList<List<String>>();
		masterList.add(list1);
		masterList.add(list2);
		masterList.add(list3);
		
		
		System.out.println("Before flatMap():"+masterList);
		
		List<String> flatenList = 
		masterList.stream()
					.flatMap(childList -> childList.stream())
					.collect(Collectors.toList());
		
		System.out.println("After flatMap():"+flatenList);

	}

}
