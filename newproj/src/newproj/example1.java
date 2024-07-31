package newproj;

import java.util.Arrays;
import java.util.List;

public class example1 {
public static void main(String[] args) {
	List<String> li=Arrays.asList("Karur","chennai","coimbatore");
	
//	for(String s : li) {
//		System.out.println(s);
//	}
	
//	li.forEach(s -> System.out.println(s));
	
	li.stream()
	.filter((s) -> s.startsWith("c"))
	.map((s) -> s.toUpperCase())
	.forEach((s) -> System.out.println(s));
	
	li.stream()
	.filter((s) -> s.endsWith("r"))
	.map((s) -> s.toUpperCase())
	.forEach((s) -> System.out.println(s));
}
}
